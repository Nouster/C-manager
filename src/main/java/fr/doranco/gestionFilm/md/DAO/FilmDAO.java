package fr.doranco.gestionFilm.md.DAO;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.md.business.Film;


public interface FilmDAO {
	
	Film creerFilm(Film film) throws SQLException;

	List<Film> trouverTousLesFilms() throws SQLException;
	
	boolean supprimerFilm(Long id) throws SQLException;
	
	Film filmParId(long id) throws SQLException;

		
}
