package com.grokonez.jwtauthentication.model;


import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;




@Entity
public class Planning {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPlanning; 
	
	
	private String jour;
	private String salle;
	
	 @ManyToMany
	    Set<Jury> jury;
	
	
	@OneToMany(mappedBy = "planning")
	private List<Planning_Soumission> pfe;


	public Planning() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Planning(String jour, String salle) {
		super();
		this.jour = jour;
		this.salle = salle;
	}




	public Planning(String jour, String salle, Set<Jury> jury, List<Planning_Soumission> pfe) {
		super();
		this.jour = jour;
		this.salle = salle;
		this.jury = jury;
		this.pfe = pfe;
	}




	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public String getSalle() {
		return salle;
	}


	public void setSalle(String salle) {
		this.salle = salle;
	}


	public List<Planning_Soumission> getPfe() {
		return pfe;
	}


	public void setPfe(List<Planning_Soumission> pfe) {
		this.pfe = pfe;
	}	
	
	
	
	

}
