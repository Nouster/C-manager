package fr.doranco.gestionFilm.md.business;

import java.util.ArrayList;
import java.util.List;


public class Film {
	
	private Long idFilm;
	private String nomFilm;
	private String realisateur;
	private int anneeDeSortie;
	private List<Utilisateur> utilisateurs;
	
	
	public Film() {
		
		utilisateurs = new ArrayList<Utilisateur>();
	}
	
	public Film(Long idFilm, String nomFilm, String realisateur, int anneeDeSortie) {
		this();
		this.idFilm = idFilm;
		this.nomFilm = nomFilm;
		this.realisateur = realisateur;
		this.anneeDeSortie = anneeDeSortie;
	}

	public Long getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public int getAnneeDeSortie() {
		return anneeDeSortie;
	}

	public void setAnneeDeSortie(int anneeDeSortie) {
		this.anneeDeSortie = anneeDeSortie;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	
}
