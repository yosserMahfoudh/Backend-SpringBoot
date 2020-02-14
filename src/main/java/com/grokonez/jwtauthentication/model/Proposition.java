package com.grokonez.jwtauthentication.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proposition {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProp;
	
	private String sujet;
	private String description;
	private Integer telephone;
	private String email;
	private String nomEntreprise;
	public Proposition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proposition(String sujet, String description, Integer telephone, String email, String nomEntreprise) {
		super();
		this.sujet = sujet;
		this.description = description;
		this.telephone = telephone;
		this.email = email;
		this.nomEntreprise = nomEntreprise;
	}
	public Long getIdProp() {
		return idProp;
	}
	public void setIdProp(Long idProp) {
		this.idProp = idProp;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	
	
	
	

}
