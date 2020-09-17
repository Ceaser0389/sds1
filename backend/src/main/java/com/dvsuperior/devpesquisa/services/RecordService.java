package com.dvsuperior.devpesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dvsuperior.devpesquisa.dto.RecordDTO;
import com.dvsuperior.devpesquisa.dto.RecordInsertDTO;
import com.dvsuperior.devpesquisa.entities.Game;
import com.dvsuperior.devpesquisa.entities.Record;
import com.dvsuperior.devpesquisa.repositories.GameRepository;
import com.dvsuperior.devpesquisa.repositories.RecordRepository;
@Service 
public class RecordService {
    
	
	@Autowired
	private RecordRepository  repository;

	@Autowired
	private GameRepository  gameRepository;

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
