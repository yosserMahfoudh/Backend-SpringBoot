package com.grokonez.jwtauthentication.security.services;

 
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Proposition;
import com.grokonez.jwtauthentication.repository.IPropositionRepository;



@Service
public class PropositionService implements IPropositionService {
	
@Autowired
IPropositionRepository proposition;

	@Override
	public List<Proposition> getAll() {
		return proposition.findAll();
	}

	@Override
	public Proposition getById(Long id) {
	 return proposition.findById(id).get();
	}

	@Override
	public Proposition saveorupdate(Proposition sm) {
		proposition.save(sm);
		return sm;
	}

	@Override
	public void DeleteById(Long id) {
		proposition.deleteById(id);
		
	}

}
