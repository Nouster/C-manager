package fr.doranco.gestionFilm.md.service.Impl;

import java.sql.SQLException;

import fr.doranco.gestionFilm.md.DAO.ImageDAO;
import fr.doranco.gestionFilm.md.DAO.Impl.ImageDAOImpl;
import fr.doranco.gestionFilm.md.business.Image;
import fr.doranco.gestionFilm.md.service.ImageService;

public class ImageServiceImpl implements ImageService {
	
	ImageDAO imageDAO = new ImageDAOImpl();


	@Override
	public Image creerImage(Image image) {
		// TODO Auto-generated method stub
		try {
			return imageDAO.creerImage(image);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Image ImageParFilmId(long id) {
		// TODO Auto-generated method stub
		try {
			return imageDAO.ImageParFilmId(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean supprimerImage(Long id) {
		// TODO Auto-generated method stub
		
		try {
			return imageDAO.supprimerImage(id);
		}catch(SQLException e) {
			e.printStackTrace();

		}
		return false;
	}
	}


