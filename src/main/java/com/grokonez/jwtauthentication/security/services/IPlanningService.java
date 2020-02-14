package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import com.grokonez.jwtauthentication.model.Planning; 



public interface IPlanningService {
	 public List<Planning> getAll();
	   
	   public Planning getById(Long id);
	   
	    public Planning saveorupdate(Planning pl);
	    
	   public void  DeleteById(Long id);

}
