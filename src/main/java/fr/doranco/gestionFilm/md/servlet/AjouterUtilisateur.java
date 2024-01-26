package fr.doranco.gestionFilm.md.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import fr.doranco.gestionFilm.md.business.Utilisateur;
import fr.doranco.gestionFilm.md.service.UtilisateurService;
import fr.doranco.gestionFilm.md.service.Impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class AjouterUtilisateur
 */
@WebServlet(urlPatterns = {"/ajouter-utilisateur"})

public class AjouterUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Utilisateur> utilisateurs = utilisateurService.trouverTousLesUtilisateurs();
		request.setAttribute("utilisateurs", utilisateurs);

		request.getRequestDispatcher("WEB-INF/ajouter-utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(request.getParameter("NOM_UTILISATEUR"));
		utilisateur.setPrenom(request.getParameter("PRENOM_UTILISATEUR"));
		utilisateur.setTelephone(request.getParameter("TELEPHONE_UTILISATEUR"));
		utilisateur.setEmail(request.getParameter("EMAIL_UTILISATEUR"));
		utilisateur.setMotDePasse(request.getParameter("MDP_UTILISATEUR"));
		utilisateur.setDateHeureInscription(LocalDateTime.now());

		utilisateurService.creerUtilisateur(utilisateur);

		response.sendRedirect("ajouter-utilisateur");
	}

}
