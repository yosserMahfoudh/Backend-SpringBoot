package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Planning; 


public interface IPlanningRepository extends JpaRepository<Planning, Long>{

}
