package com.grokonez.jwtauthentication.security.services;



import java.util.List; 

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Soumission;
import com.grokonez.jwtauthentication.repository.ISoumissionRepository;




@Service
public class SoumissionServiceImp implements ISoumissionService {
	
	@Autowired
	ISoumissionRepository soumission;
	  @Autowired
	  HttpSession session;
		




	@Override
	public Soumission getById(Long id) {
		
		return soumission.findById(id).get();
	}

	@Override
	public Soumission saveorupdate(Soumission sm) {
		soumission.save(sm);
		return sm;
	}

	@Override
	public void DeleteById(Long id) {
		soumission.deleteById(id);
		
	}

	@Override
	public List<Soumission> getAll() {
		
		return (List<Soumission>) soumission.findAll();	}

	@Override
	public Soumission update(Soumission sm) {
		Soumission p = soumission.findById(1L).orElse(null); 
		
		return soumission.save(sm);
	}

}
