package fr.doranco.gestionFilm.md.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fr.doranco.gestionFilm.md.business.Film;
import fr.doranco.gestionFilm.md.business.Image;
import fr.doranco.gestionFilm.md.service.FilmService;
import fr.doranco.gestionFilm.md.service.ImageService;
import fr.doranco.gestionFilm.md.service.Impl.FilmServiceImpl;
import fr.doranco.gestionFilm.md.service.Impl.ImageServiceImpl;

/**
 * Servlet implementation class FilmParId
 */

@WebServlet(urlPatterns = {"/film-image"})

public class FilmParId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmService filmService = new FilmServiceImpl();
	private ImageService imageService = new ImageServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmParId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        Film film = filmService.trouverFilmParId(Long.parseLong(request.getParameter("id")));
        Image image = imageService.ImageParFilmId(Long.parseLong(request.getParameter("id")));
        request.setAttribute("film", film);
        request.setAttribute("image", image);
        request.getRequestDispatcher("WEB-INF/film-image.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
