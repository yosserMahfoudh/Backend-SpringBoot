package com.grokonez.jwtauthentication.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Planning_Soumission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlanSoum;
	
	private int heure;
	
	@ManyToOne 
	@JoinColumn(name = "idsoum")
	@JsonIgnoreProperties("soumpfr")
	private  Soumission soumission;
	

	
	@ManyToOne 
	@JoinColumn(name = "idPlanning")
	@JsonIgnoreProperties("pfe")
	private  Planning planning;



	public Planning_Soumission() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Planning_Soumission(int heure) {
		super();
		this.heure = heure;
	}



	public Long getIdPlanSoum() {
		return idPlanSoum;
	}



	public void setIdPlanSoum(Long idPlanSoum) {
		this.idPlanSoum = idPlanSoum;
	}



	public int getHeure() {
		return heure;
	}



	public void setHeure(int heure) {
		this.heure = heure;
	}



	public Soumission getSoumission() {
		return soumission;
	}



	public void setSoumission(Soumission soumission) {
		this.soumission = soumission;
	}



	public Planning getPlanning() {
		return planning;
	}



	public void setPlanning(Planning planning) {
		this.planning = planning;
	}





}
