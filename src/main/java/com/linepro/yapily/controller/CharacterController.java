/*
 * 
 */
package com.linepro.yapily.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linepro.marvel.MarvelApi;
import com.linepro.marvel.model.MarvelCharacter;
import com.linepro.yapily.dto.CharacterDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value="Character")
@RestController
public class CharacterController {

    private static final String ID = "id";

    private static final Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @Autowired
    private MarvelApi marvelApi;

    /**
     * Gets a list of characters from the Marvel database.
     * @return a list of Marvel Character Ids
     */
    @ApiOperation(value="Get a list of Marvel Character ids", response=Integer.class, responseContainer="List")
    @GetMapping(value = "/characters", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Integer>> getCharacters() {
        try {
            return new ResponseEntity<>(marvelApi.getCharacters(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error(String.format("Error retrieving characters: %s", e.getMessage()), e);

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets a character from the Marvel database.
     * @param id the character's Marvel Id
     * @return a character dto with the character details
     */
    @ApiOperation(value="Get a Marvel Character", response=CharacterDto.class)
    @GetMapping(value = "/characters/{" + ID + "}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<CharacterDto> getCharacters(@ApiParam(value="The Marvel Character Id") @PathVariable(ID) int id) {
        try {
            MarvelCharacter character = marvelApi.getCharacter(id);

            if (character != null) {
                return new ResponseEntity<>(new CharacterDto(character), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error(String.format("Error retrieving character %d: %s", id, e.getMessage()), e);

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
