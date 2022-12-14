package com.antoine.dojos_and_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoine.dojos_and_ninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	// GET ALL METHOD
	List<Ninja> findAll();
	
	// CUSTOM QUERIES
	List<Ninja> findById(String search);
}