package fr.doranco.gestionFilm.md.DAO;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		// création d'un objet Properties
		Properties properties = new Properties();

		try {
			// essaye de charger les ressources présentent dans la classe que l'on vient de
			// créer get ressources fournie par public InputStream
			properties.load(DatabaseConnection.class.getResourceAsStream("/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// driver = clef puis le reste est la valeur associée envoyée en paramètres pour
		// la connexion à la BDD
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// créé un élément Driver qui compose une Array pour la stocker et l'envoyer
		Class.forName(driver);
		// System.out.println(url);
		// Recherche pour envoyer les éléments en parametres pour communiquer avec la
		// BDD, connection => même fonctionnement que le PrepareStatement.
		Connection connection = DriverManager.getConnection(url, username, password);
		// répond si tout c'est bien déroulé avec le reste du programme.
		return connection;
	}
}

