package com.antoine.dojos_and_ninjas.services;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.antoine.dojos_and_ninjas.models.Dojo;
import com.antoine.dojos_and_ninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	// IMPORT REPOSITORY
	@Autowired
	DojoRepo dojoRepo;

	
	// CREATE A USER
	public Dojo create(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}
	
	// GET ALL USERS
	public List<Dojo> getAllDojos(){
		return dojoRepo.findAll();
	}
	
	// GET ONE USER
    public Dojo findDojo(Long id) {
    	
    	return dojoRepo.findById(id).orElse(null);
//        Optional<User> optionalUser = userRepo.findById(id);
//        if(optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
//            return null;
//        }
    }
	// UPDATE A USER
	public Dojo updateDojo(@Valid Dojo updatedDojo) {
		return dojoRepo.save(updatedDojo);
	}
	
	// DELETE A USER
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}