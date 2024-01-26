<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
	<body>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">Cinema</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarNav">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="index">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="ajouter-film">Ajouter un film</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="ajouter-utilisateur">Ajouter utilisateur</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="image-form">Ajouter des affiches</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
	<h1 class="text-center mt-5">Cinema</h1>	
		<h2 class="text-center mt-5">Liste des films :</h2>
		
		<section class="container-fluid mt-5">
			<div class="row justify-content-center gap-3">
					<c:if test="${empty films}">
					<a href="ajouter-film" class="btn btn-primary col-md-3">Ajouter un film</a>
					</c:if>
						<c:forEach items="${films}" var="film">
							
							
							<div class="card col-md-3" style="width: 18rem;">
							  <div class="card-body">
							    <h5 class="card-title">${film.nomFilm}</h5>
							    <p class="card-text">Réalisateur : ${film.realisateur}</p>
							    <p class="card-text">Année de sotie : ${film.anneeDeSortie}</p>
							    <div class="d-flex">
								    <div class="col-md-6">
								    	<a class="btn btn-primary" href="film-image?id=${film.idFilm }">Voir plus</a>
								    </div>
								    <div class="col-md-3">
								    	<a href="supprimerFilm?id=${film.idFilm}" class="btn btn-danger">Supprimer</a>
								    </div>
							    </div>
							  </div>
							</div>
							
									
						</c:forEach>
				</div>					
		</section>
</body>
</html>