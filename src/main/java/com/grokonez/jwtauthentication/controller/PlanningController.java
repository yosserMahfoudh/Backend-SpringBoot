package com.grokonez.jwtauthentication.controller;


import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.Planning;
import com.grokonez.jwtauthentication.security.services.PlanningServiceImpl;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController()
@RequestMapping("/planning")
public class PlanningController {
	@Autowired
	PlanningServiceImpl planning;
	
	
	@PostMapping("/save")
	 public Planning save(@RequestBody Planning pl)
	 {
		 return planning.saveorupdate(pl);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { planning.DeleteById(id);
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Planning> findALL(){
		return planning.getAll();
		 
	 }

	 
	
	@GetMapping("/getById/{id}")
	 public Planning findById( @PathVariable Long id) {
		 return planning.getById(id);
	 }
}
