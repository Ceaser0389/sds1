/**
 * 
 */
package com.dvsuperior.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.devpesquisa.entities.Record;

public interface RecordRepository extends  JpaRepository <Record,Long>{

}
