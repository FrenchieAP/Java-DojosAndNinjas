package com.antoine.dojos_and_ninjas.services;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoine.dojos_and_ninjas.models.Ninja;
import com.antoine.dojos_and_ninjas.repositories.NinjaRepo;




@Service
public class NinjaService {
	
	// IMPORT REPOSITORY
	@Autowired
	NinjaRepo ninjaRepo;

	
	// CREATE A USER
	public Ninja create(Ninja newNinja) {
		return ninjaRepo.save(newNinja);
	}
	
	// GET ALL USERS
	public List<Ninja> getAllNinjas(){
		return ninjaRepo.findAll();
	}
	
	// GET ONE USER
    public Ninja findNinja(Long id) {
    	
    	return ninjaRepo.findById(id).orElse(null);
//        Optional<User> optionalUser = userRepo.findById(id);
//        if(optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
//            return null;
//        }
    }
	// UPDATE A USER
	public Ninja updateNinja(@Valid Ninja updatedNinja) {
		return ninjaRepo.save(updatedNinja);
	}
	
	// DELETE A USER
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}