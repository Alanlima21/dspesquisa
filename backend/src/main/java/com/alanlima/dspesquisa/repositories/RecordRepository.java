package com.alanlima.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanlima.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
