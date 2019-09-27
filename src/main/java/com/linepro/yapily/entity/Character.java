/*
 * 
 */
package com.linepro.yapily.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Character.
 * Minimal character info for the Character repository; name retained for debugging.
 */
@Entity
public class Character {

    /** The id. */
    @Id
    private Integer id;
    
    /** The name. */
    @Column
    private String name;

    /**
     * Instantiates a new character.
     */
    public Character() {
    }

    /**
     * Instantiates a new character.
     * @param id the id
     * @param name the name
     */
    public Character(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id.
     * @return the id
     */
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

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Character other = (Character) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return String.format("Character [id=%s, name=%s]", id, name);
    }
    
}
