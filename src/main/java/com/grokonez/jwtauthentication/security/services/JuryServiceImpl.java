package com.grokonez.jwtauthentication.security.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Jury;
import com.grokonez.jwtauthentication.repository.IJuryRepository;



@Service
public class JuryServiceImpl implements IJuryService {
	@Autowired
	IJuryRepository jury;

	@Override
	public List<Jury> getAll() {
		
		return jury.findAll();
	}

	@Override
	public Jury getById(Long id) {
		// TODO Auto-generated method stub
		return jury.findById(id).get();
	}

	@Override
	public Jury saveorupdate(Jury j) {
		// TODO Auto-generated method stub
		jury.save(j);
		return j;
	}

	@Override
	public void DeleteById(Long id) {
		jury.deleteById(id);
		
	}

}
