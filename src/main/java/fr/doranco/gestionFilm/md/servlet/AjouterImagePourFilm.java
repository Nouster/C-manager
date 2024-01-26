package fr.doranco.gestionFilm.md.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import fr.doranco.gestionFilm.md.business.Film;
import fr.doranco.gestionFilm.md.business.Image;
import fr.doranco.gestionFilm.md.service.FilmService;
import fr.doranco.gestionFilm.md.service.ImageService;
import fr.doranco.gestionFilm.md.service.Impl.FilmServiceImpl;
import fr.doranco.gestionFilm.md.service.Impl.ImageServiceImpl;

/**
 * Servlet implementation class AjouterImagePourFilm
 */

@WebServlet("/image-form")

public class AjouterImagePourFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImageService imageService = new ImageServiceImpl();
	private FilmService filmService = new FilmServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterImagePourFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Film> films = filmService.trouverTousLesFilms();
		request.setAttribute("films", films);
		request.getRequestDispatcher("WEB-INF/image-form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Film film = new Film();
		film.setIdFilm(Long.parseLong(request.getParameter("ID_FILM")));
		
		Image image = new Image();
		image.setUrl(request.getParameter("URL_IMAGE"));
		image.setFilm(film);
		imageService.creerImage(image);
		response.sendRedirect("index");
	}

}
