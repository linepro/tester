package com.linepro.marvel;

import java.util.List;

import com.linepro.marvel.model.MarvelCharacter;

public interface MarvelApi {

    MarvelCharacter getCharacter(Integer id);

    List<Integer> getCharacters();

}
