package com.grokonez.jwtauthentication.model;



import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Jury {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJury; 
	private String titreGrade;
	private String nom;
	
	@ManyToMany
    Set<Planning> listPlanning;

	public Jury(String titreGrade, String nom, Set<Planning> listPlanning) {
		super();
		this.titreGrade = titreGrade;
		this.nom = nom;
		this.listPlanning = listPlanning;
	}

	public Jury() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdJury() {
		return idJury;
	}

	public void setIdJury(Long idJury) {
		this.idJury = idJury;
	}

	public String getTitreGrade() {
		return titreGrade;
	}

	public void setTitreGrade(String titreGrade) {
		this.titreGrade = titreGrade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Planning> getListPlanning() {
		return listPlanning;
	}

	public void setListPlanning(Set<Planning> listPlanning) {
		this.listPlanning = listPlanning;
	}
	
	
	
	
	
	
	
	
	
}
