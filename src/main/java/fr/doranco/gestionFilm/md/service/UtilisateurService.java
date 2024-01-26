package fr.doranco.gestionFilm.md.service;


import java.util.List;

import fr.doranco.gestionFilm.md.business.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur creerUtilisateur(Utilisateur utiliateur);
		
	List<Utilisateur> trouverTousLesUtilisateurs();


}
