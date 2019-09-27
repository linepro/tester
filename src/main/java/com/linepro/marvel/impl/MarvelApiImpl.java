/*
 * 
 */
package com.linepro.marvel.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.linepro.marvel.MarvelApi;
import com.linepro.marvel.model.MarvelCharacter;
import com.linepro.marvel.model.MarvelCharacterDataWrapper;
import com.linepro.yapily.entity.Character;
import com.linepro.yapily.entity.CharacterRepository;

/**
 * The Marvel Api
 * Implements methods for accessing the Marvel Database.
 */
@Component
public class MarvelApiImpl implements MarvelApi {

    /** The id query parameter. */
    private static final String ID = "id";

    /** The end point for retrieving a character. */
    private static final String GET_CHARACTER = "/characters/{" + ID + "}";

    /** The offset query parameter. */
    private static final String OFFSET = "offset";

    /** The fetch size when retrieving a list of characters. */
    private static final int CHUNK_SIZE = 100;

    /** The end point for retrieving a list of characters. */
    private static final String GET_CHARACTERS = "/characters?limit=" + CHUNK_SIZE;

    /** The offset when retrieving a list of characters. */
    private static final String OFFSET_PARAM = "&offset={" + OFFSET + "}";

    /** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(MarvelApiImpl.class);

    /** The rest template. */
    private final RestTemplate restTemplate;

    /** The character repository. */
    private final CharacterRepository characterRepository;

    /**
     * Instantiates a new marvel api impl.
     * @param restTemplate the rest template
     * @param characterRepository the character repository
     */
    @Autowired
    public MarvelApiImpl(RestTemplate restTemplate, CharacterRepository characterRepository) {
        this.restTemplate = restTemplate;
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Integer> getCharacters() {
        List<Character> characters = characterRepository.findAll();

        if (characters.isEmpty()) {
            loadCharacters();

            characters = characterRepository.findAll();
        }

        return characters.stream().map(c -> c.getId()).collect(Collectors.toList());
    }

    @Override
    public MarvelCharacter getCharacter(Integer id) {
        MarvelCharacterDataWrapper wrapper = restTemplate.getForObject(GET_CHARACTER, MarvelCharacterDataWrapper.class,
                Collections.singletonMap(ID, id));
        return wrapper.getData().getResults().get(0);
    }

    /**
     * Loads the list of Marvel Characters into the repository.
     */
    private void loadCharacters() {
        for (int offset = 0;; offset += CHUNK_SIZE) {
            try {
                MarvelCharacterDataWrapper wrapper = restTemplate.getForObject(
                        GET_CHARACTERS + (offset > 0 ? OFFSET_PARAM : ""), MarvelCharacterDataWrapper.class,
                        Collections.singletonMap(OFFSET, Integer.toString(offset)));

                if (wrapper.getCode() != HttpStatus.OK.value() || wrapper.getData().getCount() == 0) {
                    return;
                }

                List<MarvelCharacter> characters = (List<MarvelCharacter>) wrapper.getData().getResults();
                characters.forEach(c -> {
                    try {
                        characterRepository.save(new Character(c.getId(), c.getName()));
                    } catch (Exception e) {
                        logger.error("Saving " + c, e);
                    }
                });
            } catch (Exception e) {
                logger.error(String.format("Failure loading characters: %s", e.getMessage()), e);

                return;
            }
        }
    }
}
