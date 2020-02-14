package com.grokonez.jwtauthentication.controller;



   
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.Soumission;
import com.grokonez.jwtauthentication.model.Utilisateur;
import com.grokonez.jwtauthentication.repository.ISoumissionRepository;
import com.grokonez.jwtauthentication.repository.UserRepository;
import com.grokonez.jwtauthentication.security.services.SoumissionServiceImp;
import com.grokonez.jwtauthentication.security.services.UserDetailsServiceImpl;
import com.grokonez.jwtauthentication.security.services.UserServiceImp;







 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController()
@RequestMapping("/Soumission")
public class SoumissionController {

	@Autowired
	SoumissionServiceImp soumissionservice;
	
	@Autowired
	ISoumissionRepository soumrepo;
	
	@Autowired
	UserRepository userrepo;

	@Autowired
	UserServiceImp userService;

	
	@PostMapping("/save/{id}")
	 public Soumission save(@RequestBody Soumission soum , @PathVariable Long id)
	 { 
		
		Utilisateur user= userService.getById(id);
		soum.setUser(user);
		 return soumissionservice.saveorupdate(soum);
	 }
	
	
	@PostMapping("/update/{id}")
	 public Soumission update(@RequestBody Soumission soum,@PathVariable Long idBinome )
	 { 
		
		 return soumissionservice.update(soum);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { soumissionservice.DeleteById(id);
	 
	 }
	 
	

	
	
	@GetMapping("/getAll")
	 public List<Soumission>findALL(){

	
		return soumissionservice.getAll();
		 
	 }

	 
	
	@GetMapping("/getById/{id}")
	 public Soumission findById( @PathVariable Long id) {
		 return soumissionservice.getById(id);
	 }

}
