package com.antoine.dojos_and_ninjas.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.antoine.dojos_and_ninjas.models.Dojo;
import com.antoine.dojos_and_ninjas.services.DojoService;
import com.antoine.dojos_and_ninjas.services.NinjaService;
import com.antoine.dojos_and_ninjas.models.Ninja;



@Controller
public class DojoController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	DojoService dojoServ;
	@Autowired 
	NinjaService ninjaServ;
	
	@GetMapping("/")
	public String index(
		Model model, @ModelAttribute("ninjaObj") Ninja emptyNinjaObj
	) {

		List<Ninja> allNinjasFromDB = ninjaServ.getAllNinjas();
		

		model.addAttribute("allNinjas", allNinjasFromDB);
		
		// RENDER THE JSP
		return "index.jsp";
	}
	
	
	// ------------------ DATA BINDING(CREATE) ------------------------ //
	// READ ALL
	@GetMapping("/dojos")
	public String dojos(
		Model model, @ModelAttribute("dojoObj") Dojo emptyDojoObj
	) {

		List<Dojo> allDojosFromDB = dojoServ.getAllDojos();
		

		model.addAttribute("allDojos", allDojosFromDB);
		
		// RENDER THE JSP
		return "add_dojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String processDojo(
		Model model,
		@Valid @ModelAttribute("dojoObj") Dojo filledDojoObj,
		BindingResult results
	) {
		if(results.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.getAllDojos());
			return "index.jsp";
		}
		dojoServ.create(filledDojoObj);
		return "redirect:/";
	}
//	// ------------------ DATA BINDING(CREATE) ------------------------ //
//	
//	
//	
//
//	@GetMapping("/dojos/{id}")
//	public String showOne(
//		@PathVariable("id") Long dojoId,
//		Model model
//	) {
//
//		Dojo oneDojo = dojoServ.findDojo(dojoId);
//		
//		// PASS THE INFORMATION TO THE JSP
//		model.addAttribute("dojo", oneDojo);
//	
//		return "one.jsp";
//	}

	
}
