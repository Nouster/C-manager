package fr.doranco.gestionFilm.md.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fr.doranco.gestionFilm.md.service.FilmService;
import fr.doranco.gestionFilm.md.service.ImageService;
import fr.doranco.gestionFilm.md.service.Impl.FilmServiceImpl;
import fr.doranco.gestionFilm.md.service.Impl.ImageServiceImpl;

/**
 * Servlet implementation class SupprimerFilm
 */
@WebServlet("/supprimerFilm")

public class SupprimerFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmService filmService = new FilmServiceImpl();
	private ImageService imageService = new ImageServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		imageService.supprimerImage(Long.parseLong(request.getParameter("id")));
		filmService.supprimerFilm(Long.parseLong(request.getParameter("id")));
		response.sendRedirect("index");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
