package fr.doranco.gestionFilm.md.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fr.doranco.gestionFilm.md.business.Film;
import fr.doranco.gestionFilm.md.service.FilmService;
import fr.doranco.gestionFilm.md.service.Impl.FilmServiceImpl;

/**
 * Servlet implementation class AjouterFilm
 */

@WebServlet(urlPatterns = {"/ajouter-film"})

public class AjouterFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmService filmService = new FilmServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/ajouter-film.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Film film = new Film();
		film.setNomFilm(request.getParameter("NOM_FILM"));
		film.setRealisateur(request.getParameter("NOM_REALISATEUR"));
		film.setAnneeDeSortie(Integer.parseInt(request.getParameter("ANNEE_DE_SORTIE")));
		filmService.creerFilm(film);
	
		response.sendRedirect("index");
		
	}

}
