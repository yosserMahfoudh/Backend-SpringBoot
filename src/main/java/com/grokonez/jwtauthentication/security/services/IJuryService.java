package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import com.grokonez.jwtauthentication.model.Jury; 


public interface IJuryService {
	
	 public List<Jury> getAll();
	   
	   public Jury getById(Long id);
	   
	    public Jury saveorupdate(Jury jury);
	    
	   public void  DeleteById(Long id);

}
