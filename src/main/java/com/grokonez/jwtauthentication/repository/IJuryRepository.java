package com.grokonez.jwtauthentication.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Jury; 


public interface IJuryRepository  extends JpaRepository<Jury, Long> {

}
