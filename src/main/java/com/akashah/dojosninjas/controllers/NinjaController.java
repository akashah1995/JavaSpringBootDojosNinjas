package com.akashah.dojosninjas.controllers;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akashah.dojosninjas.models.Ninja;
import com.akashah.dojosninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	NinjaService ninjaService;
	
	NinjaController(NinjaService ninjaService){
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasEachPage(Model model, @PathVariable("prageNumber") int pageNumber) {
		Page<Ninja> ninjas = ninjaService.ninjasPerPage(pageNumber - 1);
		int totalPages = ninjas.getTotalPages();
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("ninjas", ninjas);
		return "home.jsp";
	}
	
	
	

}
