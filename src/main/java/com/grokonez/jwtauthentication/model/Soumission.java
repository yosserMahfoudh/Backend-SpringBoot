package com.grokonez.jwtauthentication.model;



import java.util.Date; 
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Soumission {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idsoum;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
  private Date dateDeb;
	
	
	private String sujet;
	private String environementML;
    private String technologieU;
	private String parcours;
	private String encadreurExterne;
	private String encadreurInterne;
	private String etatInitial;
	private String etatFinal;
	private String org;
	private String commentaire;
	private String objectif;
	
	private String binome;
	 
	@ManyToOne
	@JoinColumn(name = "id")
	// avoid showing a many lists of users
	@JsonIgnoreProperties("soumission")
	private Utilisateur user;

	
	
	
//	@OneToMany (mappedBy ="soumission") 
//	private List<Planning_Soumission> soumpfr;
//	

	

	public Soumission() {
		super();
		// TODO Auto-generated constructor stub
	}













	public Soumission(Date dateDeb, String sujet, String environementML, String technologieU, String parcours,
			String encadreurExterne, String encadreurInterne, String etatInitial, String etatFinal, String org,
			String commentaire, String objectif, String binome, Utilisateur user) {
		super();
		this.dateDeb = dateDeb;
		this.sujet = sujet;
		this.environementML = environementML;
		this.technologieU = technologieU;
		this.parcours = parcours;
		this.encadreurExterne = encadreurExterne;
		this.encadreurInterne = encadreurInterne;
		this.etatInitial = etatInitial;
		this.etatFinal = etatFinal;
		this.org = org;
		this.commentaire = commentaire;
		this.objectif = objectif;
		this.binome = binome;
		this.user = user;
		//this.soumpfr = soumpfr;
	}













	public String getBinome() {
		return binome;
	}













	public void setBinome(String binome) {
		this.binome = binome;
	}













	public Utilisateur getUser() {
		return user;
	}







	public void setUser(Utilisateur o) {
		this.user = o;
	}







	public String getOrg() {
		return org;
	}






	public void setOrg(String org) {
		this.org = org;
	}






	public String getCommentaire() {
		return commentaire;
	}






	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}






//	public List<Planning_Soumission> getSoumpfr() {
//		return soumpfr;
//	}
//
//
//
//	public void setSoumpfr(List<Planning_Soumission> soumpfr) {
//		this.soumpfr = soumpfr;
//	}



	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}



	public String getEnvironementML() {
		return environementML;
	}

	public void setEnvironementML(String environementML) {
		this.environementML = environementML;
	}

	public String getTechnologieU() {
		return technologieU;
	}

	public void setTechnologieU(String technologieU) {
		this.technologieU = technologieU;
	}

	public String getParcours() {
		return parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}

	public String getEncadreurExterne() {
		return encadreurExterne;
	}

	public void setEncadreurExterne(String encadreurExterne) {
		this.encadreurExterne = encadreurExterne;
	}

	public String getEncadreurInterne() {
		return encadreurInterne;
	}

	public void setEncadreurInterne(String encadreurInterne) {
		this.encadreurInterne = encadreurInterne;
	}

	public String getEtatInitial() {
		return etatInitial;
	}

	public void setEtatInitial(String etatInitial) {
		this.etatInitial = etatInitial;
	}

	public String getEtatFinal() {
		return etatFinal;
	}

	public void setEtatFinal(String etatFinal) {
		this.etatFinal = etatFinal;
	}

	
	public Long getIdsoum() {
		return idsoum;
	}




	public void setIdsoum(Long idsoum) {
		this.idsoum = idsoum;
	}





	public Date getDateDeb() {
		return dateDeb;
	}




	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}




	public String getObjectif() {
		return objectif;
	}











	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}



	
	
	
	
	
}
