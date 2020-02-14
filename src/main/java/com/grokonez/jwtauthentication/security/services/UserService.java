package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import com.grokonez.jwtauthentication.model.Jury;
import com.grokonez.jwtauthentication.model.Utilisateur;

public interface UserService {
	 public List<Utilisateur> getAll();
	   
	   public Utilisateur getById(Long id);
	   
	    public Utilisateur saveorupdate(Utilisateur user);
	    
	   public void  DeleteById(Long id);
}
