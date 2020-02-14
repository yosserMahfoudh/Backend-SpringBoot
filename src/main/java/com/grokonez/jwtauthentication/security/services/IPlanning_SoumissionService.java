package com.grokonez.jwtauthentication.security.services;
import java.util.List;

import com.grokonez.jwtauthentication.model.Planning_Soumission; 


 
public interface IPlanning_SoumissionService {
	 public List<Planning_Soumission> getAll();
	   
	   public Planning_Soumission getById(Long id);
	   
	    public Planning_Soumission saveorupdate(Planning_Soumission pl);
	    
	   public void  DeleteById(Long id);


}
