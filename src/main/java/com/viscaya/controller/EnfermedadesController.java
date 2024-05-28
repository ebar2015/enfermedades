/**
 * 
 */
package com.viscaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viscaya.entities.Enfermedades;
import com.viscaya.repository.IEnfermedadesRepository;

/**
 * @author joseviscaya
 *
 */
@RestController
@RequestMapping("/api")
public class EnfermedadesController {
	
	
	@Autowired
	private IEnfermedadesRepository service;
	
	@GetMapping("/byId/{id}")
	public Enfermedades getById(@PathVariable(value = "id") String id) {
		
		return service.findById(id).get();
	}
	
	@GetMapping("/bySearch/{search}")
	public List<Enfermedades> bydata(@PathVariable(value = "search") String search) {
		
		return service.search(search);
	}

}
