package fr.doranco.gestionFilm.md.service.Impl;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.md.DAO.FilmDAO;
import fr.doranco.gestionFilm.md.DAO.Impl.FilmDAOImpl;
import fr.doranco.gestionFilm.md.business.Film;
import fr.doranco.gestionFilm.md.service.FilmService;

public class FilmServiceImpl implements FilmService {
	
	FilmDAO filmDA0 = new FilmDAOImpl();


	@Override
	public Film creerFilm(Film film) {
		// TODO Auto-generated method stub
		try {
			return filmDA0.creerFilm(film);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Film> trouverTousLesFilms() {
		// TODO Auto-generated method stub
		try {
			return filmDA0.trouverTousLesFilms();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean supprimerFilm(Long id) {
		// TODO Auto-generated method stub
		
		try {
			return filmDA0.supprimerFilm(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Film trouverFilmParId(Long id) {
		// TODO Auto-generated method stub
		
		try {
			return filmDA0.filmParId(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
