package com.grokonez.jwtauthentication.controller;



import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.Jury;
import com.grokonez.jwtauthentication.model.Utilisateur;
import com.grokonez.jwtauthentication.security.services.UserServiceImp;



@RestController
@EnableAutoConfiguration
@RequestMapping("/users")

public class UserController {


	
	@Autowired
	UserServiceImp user;
	

	
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { 
	 user.DeleteById(id);
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Utilisateur> findALL(){
		return user.getAll();
		 
	 }

	 
	
	@GetMapping("/getById/{id}")
	 public Utilisateur findById( @PathVariable Long id) {
		 return user.getById(id);
	 }

}
