package com.grokonez.jwtauthentication.security.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Planning;
import com.grokonez.jwtauthentication.repository.IPlanningRepository;



@Service
public class PlanningServiceImpl  implements IPlanningService{
	@Autowired
	IPlanningRepository planning ;

	@Override
	public List<Planning> getAll() {
		// TODO Auto-generated method stub
		return planning.findAll();
	}

	@Override
	public Planning getById(Long id) {
		// TODO Auto-generated method stub
		return planning.findById(id).get();
	}

	@Override
	public Planning saveorupdate(Planning pl) {
		planning.save(pl);
		return pl;
	}

	@Override
	public void DeleteById(Long id) {
		planning.deleteById(id);
		
	}

}
