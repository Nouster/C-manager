package fr.doranco.gestionFilm.md.business;

public class Image {

	private Long idImage;
	private String url;
	private Film film;
	
	
	public Image() {
		
	}
	
	public Image(Long idImage, String url, Film film) {
		this();
		this.idImage = idImage;
		this.url = url;
		this.film = film;
	}

	public long getIdImage() {
		return idImage;
	}

	public void setIdImage(long idImage) {
		this.idImage = idImage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
	
	
	
}
