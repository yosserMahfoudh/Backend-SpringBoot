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

import com.grokonez.jwtauthentication.model.Planning_Soumission;
import com.grokonez.jwtauthentication.security.services.Planning_SoumissionServiceImpl;

 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController()
@RequestMapping("/plnSoum")
public class Planning_SoumissionController {
	@Autowired
	Planning_SoumissionServiceImpl planning;
	
	
	@PostMapping("/save")
	 public Planning_Soumission save(@RequestBody Planning_Soumission pl)
	 {
		 return planning.saveorupdate(pl);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { planning.DeleteById(id);
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Planning_Soumission> findALL(){
		return planning.getAll();
		 
	 }

	 
	
	@GetMapping("/getById/{id}")
	 public Planning_Soumission findById( @PathVariable Long id) {
		 return planning.getById(id);
	 }
}
