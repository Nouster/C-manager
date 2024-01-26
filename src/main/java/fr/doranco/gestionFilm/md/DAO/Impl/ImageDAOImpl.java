package fr.doranco.gestionFilm.md.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.doranco.gestionFilm.md.DAO.DatabaseConnection;
import fr.doranco.gestionFilm.md.DAO.ImageDAO;
import fr.doranco.gestionFilm.md.DAO.Requete;
import fr.doranco.gestionFilm.md.business.Image;

public class ImageDAOImpl implements ImageDAO {
	
	private Connection connexion;
	
	
	public ImageDAOImpl() {
		try {
			connexion = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Image creerImage(Image image) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.AJOUTER_IMAGE, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, image.getUrl());
        ps.setLong(2, image.getFilm().getIdFilm());
        ps.executeUpdate();
       
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            image.setIdImage(1);
        }
        return image;
	}



	@Override
	public Image ImageParFilmId(long id) throws SQLException {
		// TODO Auto-generated method stub
		 PreparedStatement ps = connexion.prepareStatement(Requete.TOUTES_LES_IMAGES_PAR_ID_FILM);
	        ps.setLong(1, id);

	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            Image image = new Image();
	            image.setIdImage(rs.getLong("Id_Image"));
	            image.setUrl(rs.getString("url"));

	            return image;
	        }
	        return null;
	}

	@Override
	public boolean supprimerImage(Long id) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps = connexion.prepareStatement(Requete.EFFACER_IMAGE);
		ps.setLong(1, id);
		return ps.execute();
	}

}
