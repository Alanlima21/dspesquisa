package com.alanlima.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanlima.dspesquisa.entities.Genre;

public interface GameRepository extends JpaRepository<Genre, Long> {

}
