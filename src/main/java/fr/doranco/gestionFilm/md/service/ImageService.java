package fr.doranco.gestionFilm.md.service;


import fr.doranco.gestionFilm.md.business.Image;

public interface ImageService {
	
	Image creerImage(Image image);
		
	Image ImageParFilmId(long id);
	
	boolean supprimerImage(Long id);

}
