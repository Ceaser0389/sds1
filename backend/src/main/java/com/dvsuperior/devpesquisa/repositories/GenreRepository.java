/**
 * 
 */
package com.dvsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvsuperior.devpesquisa.entities.Genre;

@Repository
public interface GenreRepository extends  JpaRepository <Genre,Long>{

}
