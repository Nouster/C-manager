package fr.doranco.gestionFilm.md.DAO;

public class Requete {
	
	// Image
	
	public static final String AJOUTER_IMAGE = "INSERT INTO `image`(`url`, `Id_Film`) VALUES (?,?)";
	public static final String TOUTES_LES_IMAGES_PAR_ID_FILM = "SELECT * FROM `image` WHERE Id_Film = ?";
	public static final String EFFACER_IMAGE = "DELETE FROM `image` WHERE Id_Film = ?";

	


	
	// Film
	
	public static final String AJOUTER_FILM = "INSERT INTO `film`(`nom`, `realisateur`, `anneeDeSortie`) VALUES (?,?,?)";
	public static final String FILM_PAR_ID = "SELECT * FROM `film` WHERE Id_Film = ?";
	public static final String TOUS_LES_FILM = "SELECT * FROM `film`";
	public static final String EFFACER_FILM = "DELETE FROM `film` WHERE Id_Film = ?";
	
	// Utilisateur
	
	public static final String AJOUTER_UTILISATEUR = "INSERT INTO `utilisateur`(`nom`, `prenom`, `telephone`, `email`, `motDePasse`, `DateHeureInscription`) VALUES (?,?,?,?,?,?)";
	public static final String TOUS_LES_UTILISATEURS = "SELECT * FROM `utilisateur`";


}

