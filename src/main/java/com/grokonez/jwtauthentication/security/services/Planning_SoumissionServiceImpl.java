package com.grokonez.jwtauthentication.security.services;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Planning_Soumission;
import com.grokonez.jwtauthentication.repository.IPlanning_SoumissionRepository;


@Service
public class Planning_SoumissionServiceImpl implements IPlanning_SoumissionService{
	
	@Autowired
	IPlanning_SoumissionRepository ps;

	@Override
	public List<Planning_Soumission> getAll() {
		
		return ps.findAll() ;
	}

	@Override
	public Planning_Soumission getById(Long id) {
		// TODO Auto-generated method stub
		return ps.findById(id).get();
	}

	@Override
	public Planning_Soumission saveorupdate(Planning_Soumission pl) {
		// TODO Auto-generated method stub
		return ps.save(pl);
	}

	@Override
	public void DeleteById(Long id) {
		ps.deleteById(id);
		
	}

}
