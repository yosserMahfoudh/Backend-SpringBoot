package com.grokonez.jwtauthentication.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Jury;
import com.grokonez.jwtauthentication.model.Utilisateur;
import com.grokonez.jwtauthentication.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Utilisateur> getAll() {
	return userRepository.findAll();
	}

	@Override
	public Utilisateur getById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public Utilisateur saveorupdate(Utilisateur user) {
		
		return userRepository.save(user);
	}

	@Override
	public void DeleteById(Long id) {
		 userRepository.deleteById(id);
	}
	
	

	

}
