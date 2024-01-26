package fr.doranco.gestionFilm.md.DAO;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.md.business.Utilisateur;


public interface UtilisateurDAO {

	Utilisateur creerUtilisateur(Utilisateur utiliateur) throws SQLException;
	
	List<Utilisateur> trouverTousLesUtilisateurs() throws SQLException;
	
}
