package fr.doranco.gestionFilm.md.service;

import java.util.List;

import fr.doranco.gestionFilm.md.business.Film;

public interface FilmService {
	
	Film creerFilm(Film film);

	List<Film> trouverTousLesFilms();
	
	boolean supprimerFilm(Long id);
	
	Film trouverFilmParId(Long id);

}
