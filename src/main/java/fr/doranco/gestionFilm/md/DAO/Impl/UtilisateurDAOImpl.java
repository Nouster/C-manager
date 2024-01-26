package fr.doranco.gestionFilm.md.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.gestionFilm.md.DAO.DatabaseConnection;
import fr.doranco.gestionFilm.md.DAO.Requete;
import fr.doranco.gestionFilm.md.DAO.UtilisateurDAO;
import fr.doranco.gestionFilm.md.business.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	private Connection connexion;
	
	
	public UtilisateurDAOImpl() {
		try {
			connexion = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Utilisateur creerUtilisateur(Utilisateur utilisateur) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.AJOUTER_UTILISATEUR, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, utilisateur.getNom());
        ps.setString(2, utilisateur.getPrenom());
        ps.setString(3, utilisateur.getTelephone());
        ps.setString(4, utilisateur.getEmail());
        ps.setString(5, utilisateur.getMotDePasse());
        ps.setTimestamp(6, Timestamp.valueOf(utilisateur.getDateHeureInscription()));
        ps.executeUpdate();
       
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            utilisateur.setIdUtilisateur(rs.getLong(1));
        }
        return utilisateur;
	}
	
	@Override
	public List<Utilisateur> trouverTousLesUtilisateurs() throws SQLException {
		// TODO Auto-generated method stub
		

		PreparedStatement ps = connexion.prepareStatement(Requete.TOUS_LES_UTILISATEURS);
		ResultSet rs = ps.executeQuery();
		List<Utilisateur> utilisateurs = new ArrayList<>();
		
		while(rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
            utilisateur.setIdUtilisateur(rs.getLong("Id_Utilisateur"));
            utilisateur.setNom(rs.getString("nom"));
            utilisateur.setPrenom(rs.getString("prenom"));
            utilisateur.setTelephone(rs.getString("telephone"));
            utilisateur.setEmail(rs.getString("email"));
            utilisateur.setMotDePasse(rs.getString("motDePasse"));
            utilisateurs.add(utilisateur);
		}
	

		return utilisateurs;
	}


	

}
