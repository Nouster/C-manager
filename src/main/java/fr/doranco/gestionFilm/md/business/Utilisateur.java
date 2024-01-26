package fr.doranco.gestionFilm.md.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Utilisateur {
	
  private Long idUtilisateur;
  private String nom;
  private String prenom;
  private String telephone;
  private String email;
  private String motDePasse;
  private LocalDateTime dateHeureInscription;
  private List<Film> films;
  
  public Utilisateur() {
		films = new ArrayList<Film>();
		 dateHeureInscription = LocalDateTime.now();
  }
  
  public Utilisateur(Long idUtilisateur, String nom, String prenom, String telephone, String email, String motDePasse,
		LocalDateTime dateHeureInscription) {
	this.idUtilisateur = idUtilisateur;
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.email = email;
	this.motDePasse = motDePasse;
	this.dateHeureInscription = dateHeureInscription;
}
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public LocalDateTime getDateHeureInscription() {
		return dateHeureInscription;
	}
	
	public void setDateHeureInscription(LocalDateTime dateHeureInscription) {
		this.dateHeureInscription = dateHeureInscription;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
  

}
