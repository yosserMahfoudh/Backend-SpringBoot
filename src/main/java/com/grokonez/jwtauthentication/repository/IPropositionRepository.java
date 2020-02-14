package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Proposition; 


public interface IPropositionRepository extends JpaRepository<Proposition, Long>{
	
	

}
