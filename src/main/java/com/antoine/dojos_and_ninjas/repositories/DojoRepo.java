package com.antoine.dojos_and_ninjas.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.antoine.dojos_and_ninjas.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	// GET ALL METHOD
	List<Dojo> findAll();
	

}