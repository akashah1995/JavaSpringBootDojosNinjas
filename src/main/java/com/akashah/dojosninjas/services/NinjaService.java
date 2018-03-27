package com.akashah.dojosninjas.services;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.akashah.dojosninjas.models.Dojo;
import com.akashah.dojosninjas.models.Ninja;
import com.akashah.dojosninjas.repositories.*;

@Service
@Transactional
public class NinjaService {
	NinjaRepository ninjaRepository;
	DojoRepository dojoRepository;
	
	private static final int PAGE_SIZE = 5;
	
	NinjaService(NinjaRepository ninjaRepository, DojoRepository dojoRepository){
		this.ninjaRepository = ninjaRepository;
		this.dojoRepository = dojoRepository;
	}
	
	 public Page<Ninja> ninjasPerPage(int pageNumber) {
		 PageRequest pageRequest = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "lastName");
		 Page<Ninja> ninjas = ninjaRepository.findAll(pageRequest);
		 return ninjaRepository.findAll(pageRequest);
		
	 }
	 
	 public void addNinja(Ninja ninja) {
		 ninjaRepository.save(ninja);
	 }
	 
	 public void addDojo(Dojo dojo) {
		 dojoRepository.save(dojo);
	 }
	
	
}
