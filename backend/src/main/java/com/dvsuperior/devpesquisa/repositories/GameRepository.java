/**
 * 
 */
package com.dvsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvsuperior.devpesquisa.entities.Game;

@Repository
public interface GameRepository extends  JpaRepository <Game,Long>{

}
