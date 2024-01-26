package fr.doranco.gestionFilm.md.service.Impl;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.md.DAO.UtilisateurDAO;
import fr.doranco.gestionFilm.md.DAO.Impl.UtilisateurDAOImpl;
import fr.doranco.gestionFilm.md.business.Utilisateur;
import fr.doranco.gestionFilm.md.service.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {
	
	UtilisateurDAO utilisateurDAO = new UtilisateurDAOImpl();


	@Override
	public Utilisateur creerUtilisateur(Utilisateur utiliateur) {
		// TODO Auto-generated method stub
		try {
			return utilisateurDAO.creerUtilisateur(utiliateur);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<Utilisateur> trouverTousLesUtilisateurs() {
		// TODO Auto-generated method stub
		try {
			return utilisateurDAO.trouverTousLesUtilisateurs();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
