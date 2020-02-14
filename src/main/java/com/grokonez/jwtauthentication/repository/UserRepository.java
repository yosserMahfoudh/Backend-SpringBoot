package com.grokonez.jwtauthentication.repository;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grokonez.jwtauthentication.model.Utilisateur;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Long> {
    List<Utilisateur> findByUsername(String username);
   List<Utilisateur>findByEmail(String cin);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
//
//    @Query(value = "select role from users where password = ? and username=?", nativeQuery = true)
//	List<IUserProjection> findPersoneRole(String password, String username);
	
}