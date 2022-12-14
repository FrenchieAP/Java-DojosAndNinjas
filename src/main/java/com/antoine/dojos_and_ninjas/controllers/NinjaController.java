package com.antoine.dojos_and_ninjas.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.antoine.dojos_and_ninjas.models.Dojo;
import com.antoine.dojos_and_ninjas.models.Ninja;
import com.antoine.dojos_and_ninjas.services.DojoService;
import com.antoine.dojos_and_ninjas.services.NinjaService;



@Controller
public class NinjaController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	NinjaService ninjaServ;
	
	// ------------------ DATA BINDING(CREATE) ------------------------ //
	// READ ALL
	@GetMapping("/")
	public String index(
		Model model, @ModelAttribute("ninjaObj") Ninja emptyNinjaObj
	) {

		List<Dojo> allDojosFromDB = DojoService.getAllDojos();
		

		model.addAttribute("allDojos", allDojosFromDB);
		
		// RENDER THE JSP
		return "add_dojo.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String processNinja(
		Model model,
		@Valid @ModelAttribute("ninjaObj") Ninja filledNinjaObj,
		BindingResult results
	) {
		if(results.hasErrors()) {
			model.addAttribute("allNinjas", ninjaServ.getAllNinjas());
			return "index.jsp";
		}
		ninjaServ.create(filledNinjaObj);
		return "redirect:/";
	}
}
