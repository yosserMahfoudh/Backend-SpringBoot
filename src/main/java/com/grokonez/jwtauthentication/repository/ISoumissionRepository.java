package com.grokonez.jwtauthentication.repository;



import org.springframework.data.jpa.repository.Query; 
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.grokonez.jwtauthentication.model.Soumission;



@Repository
public interface ISoumissionRepository extends CrudRepository<Soumission, Long> {
	
 

	
	


}
