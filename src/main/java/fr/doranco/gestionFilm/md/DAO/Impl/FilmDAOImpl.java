package fr.doranco.gestionFilm.md.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.gestionFilm.md.DAO.DatabaseConnection;
import fr.doranco.gestionFilm.md.DAO.FilmDAO;
import fr.doranco.gestionFilm.md.DAO.Requete;
import fr.doranco.gestionFilm.md.business.Film;

public class FilmDAOImpl implements FilmDAO {
	
	private Connection connexion;
	
	
	public FilmDAOImpl() {
		try {
			connexion = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Film creerFilm(Film film) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.AJOUTER_FILM, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, film.getNomFilm());
        ps.setString(2, film.getRealisateur());
        ps.setInt(3, film.getAnneeDeSortie());
        ps.executeUpdate();
       
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            film.setIdFilm(rs.getLong(1));
        }
        return film;
	}

	@Override
	public List<Film> trouverTousLesFilms() throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps = connexion.prepareStatement(Requete.TOUS_LES_FILM);
		ResultSet rs = ps.executeQuery();
		List<Film> films = new ArrayList<>();
		
		while(rs.next()) {
			Film film = new Film();
            film.setIdFilm(rs.getLong("Id_Film"));
            film.setNomFilm(rs.getString("nom"));
            film.setRealisateur(rs.getString("realisateur"));
            film.setAnneeDeSortie(rs.getInt("anneeDeSortie"));
            films.add(film);
		}
	

		return films;
	}

	@Override
	public boolean supprimerFilm(Long id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.EFFACER_FILM);
		ps.setLong(1, id);
		return ps.execute();
	}

	@Override
	public Film filmParId(long id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.FILM_PAR_ID);
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			Film film = new Film();
			film.setIdFilm(rs.getLong("Id_Film"));
			film.setNomFilm(rs.getString("nom"));
			film.setRealisateur(rs.getString("realisateur"));
			film.setAnneeDeSortie(rs.getInt("anneeDeSortie"));
			return film;
		}
		
		return null;
	}



}
