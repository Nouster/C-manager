package fr.doranco.gestionFilm.md.DAO;

import java.sql.SQLException;

import fr.doranco.gestionFilm.md.business.Image;


public interface ImageDAO {
	
	Image creerImage(Image image) throws SQLException;
		
	Image ImageParFilmId(long id) throws SQLException;
	
	boolean supprimerImage(Long id) throws SQLException;

	
}
