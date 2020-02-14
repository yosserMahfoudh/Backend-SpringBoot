package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import com.grokonez.jwtauthentication.model.Proposition; 



public interface IPropositionService {
	 public List<Proposition> getAll();
	   
	   public Proposition getById(Long id);
	   
	    public Proposition saveorupdate(Proposition sm);
	    
	   public void  DeleteById(Long id);

}
