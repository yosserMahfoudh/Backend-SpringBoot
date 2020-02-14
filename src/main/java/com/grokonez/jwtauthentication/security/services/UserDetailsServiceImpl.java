package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.Utilisateur; 
import com.grokonez.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


		Utilisateur user = userRepository.findByUsername(username).get(0);

		return UserPrinciple.build(user);

		
	}
}