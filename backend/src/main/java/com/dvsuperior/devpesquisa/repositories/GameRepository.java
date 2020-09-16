/**
 * 
 */
package com.dvsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.devpesquisa.entities.Game;

public interface GameRepository extends  JpaRepository <Game,Long>{

}
