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