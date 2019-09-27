package com.linepro.yapily.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Character repository.
 * Provides a session indepentent repository of Marvel Characters.
 */
@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
