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

import com.grokonez.jwtauthentication.model.Proposition;
import com.grokonez.jwtauthentication.security.services.PropositionService;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController()
@RequestMapping("/proposition")
public class PropositionController {

	@Autowired
	PropositionService prop;
	
	
	@PostMapping("/save")
	 public Proposition save(@RequestBody Proposition pl)
	 {
		 return prop.saveorupdate(pl);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { prop.DeleteById(id);
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Proposition> findALL(){
		return prop.getAll();
		 
	 }

	 
	
	@GetMapping("/getById/{id}")
	 public Proposition findById( @PathVariable Long id) {
		 return prop.getById(id);
	 }
}
