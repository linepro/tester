/*
 * 
 */
package com.linepro.yapily.dto;

import com.linepro.marvel.model.MarvelCharacter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Character Dto.
 * Provides a defined format for GET characters/{id}
 */
@ApiModel(description = "A Marvel Character")
public class CharacterDto {

    /** The id. */
    private Integer id;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The thumbnail. */
    private Thumbnail thumbnail;

    /**
     * Instantiates a new character dto.
     */
    public CharacterDto() {
    }

    /**
     * Instantiates a new character dto.
     * @param id the id
     * @param name the name
     * @param description the description
     * @param thumbnail the thumbnail
     */
    public CharacterDto(Integer id, String name, String description, Thumbnail thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    /**
     * Instantiates a new character dto.
     * @param character the character
     */
    public CharacterDto(MarvelCharacter character) {
        this(character.getId(), character.getName(), character.getDescription(), new Thumbnail(character.getThumbnail()));
    }

    /**
     * Gets the id.
     * @return the id
     */
    @ApiModelProperty(notes = "The Marvel Character id")
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id the new id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the name.
     * @return the name
     */
    @ApiModelProperty(notes = "The character name")
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     * @return the description
     */
    @ApiModelProperty(notes = "The character description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the thumbnail.
     * @return the thumbnail
     */
    @ApiModelProperty(notes = "The character's thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the thumbnail.
     * @param thumbnail the new thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return String.format("CharacterDto [id=%s, name=%s, description=%s, thumbnail=%s]", id, name, description,
                thumbnail);
    }
}
