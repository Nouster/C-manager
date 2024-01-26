<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
	<%@include file="navigation.jsp" %>




	<h1 class="text-center"> Quel film souhaitez-vous ajouter ? </h1>
	
	<form class="container-fluid" method="POST">
		<div class="mb-3">
	  		<label for="exampleFormControlInput1" class="form-label">Nom du film</label>
	  		<input type="text" class="form-control" placeholder="Nom du film" name="NOM_FILM">
		</div>
		<div class="mb-3">
	  		<label for="exampleFormControlInput1" class="form-label">Nom du réalisateur</label>
	  		<input type="text" class="form-control" placeholder="Nom du réalisateur" name="NOM_REALISATEUR">
		</div>
		<div class="mb-3">
	  		<label for="exampleFormControlInput1" class="form-label">Année de sortie</label>
	  		<input type="text" class="form-control" placeholder="Année de sortie" name="ANNEE_DE_SORTIE">
		</div>	
		<button class="btn btn-primary" type="submit">Ajouter un film</button>
		
	</form>
</body>
</html>