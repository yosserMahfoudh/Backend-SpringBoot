package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import com.grokonez.jwtauthentication.model.Soumission; 



public interface ISoumissionService {
	
	   public Soumission getById(Long id);
	   
	    public Soumission saveorupdate(Soumission sm);
	    
	    public Soumission update(Soumission sm);
	    
	    
	   public void  DeleteById(Long id);

	List<Soumission> getAll();


}
