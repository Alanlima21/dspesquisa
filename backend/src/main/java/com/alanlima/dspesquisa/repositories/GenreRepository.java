package com.alanlima.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanlima.dspesquisa.entities.Game;

public interface GenreRepository extends JpaRepository<Game, Long> {

}
