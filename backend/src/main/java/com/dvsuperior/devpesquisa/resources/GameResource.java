package com.dvsuperior.devpesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvsuperior.devpesquisa.dto.GameDTO;
import com.dvsuperior.devpesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> fildAll() {
		List <GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
				
	}
	
	
	
	
	
	
	
}
