package com.alanlima.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alanlima.dspesquisa.dto.RecordDTO;
import com.alanlima.dspesquisa.dto.RecordInsertDTO;
import com.alanlima.dspesquisa.entities.Game;
import com.alanlima.dspesquisa.entities.Record;
import com.alanlima.dspesquisa.repositories.GameRepository;
import com.alanlima.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);	
	}
}