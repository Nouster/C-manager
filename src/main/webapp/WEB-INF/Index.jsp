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
	<%@include file="navigation.jsp" %>
		
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