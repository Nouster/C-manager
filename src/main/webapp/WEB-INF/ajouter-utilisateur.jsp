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

	
	<h1 class="text-center mt-5"> Inscription </h1>
	
	<div class="row justify-content-around align-items-center">
		<form class="col-md-4 ms-5" method="POST">
			<div class="mb-3">
		  		<label for="exampleFormControlInput1" class="form-label">Nom</label>
		  		<input type="text" class="form-control" placeholder="Nom" name="NOM_UTILISATEUR">
			</div>
			<div class="mb-3">
		  		<label for="exampleFormControlInput1" class="form-label">Prénom</label>
		  		<input type="text" class="form-control" placeholder="Prénom" name="PRENOM_UTILISATEUR">
			</div>
			<div class="mb-3">
		  		<label for="exampleFormControlInput1" class="form-label">N° de Téléphone</label>
		  		<input type="text" class="form-control" placeholder="Téléphone" name="TELEPHONE_UTILISATEUR">
			</div>
				<div class="mb-3">
		  		<label for="exampleFormControlInput1" class="form-label">Email</label>
		  		<input type="email" class="form-control" placeholder="email" name="EMAIL_UTILISATEUR">
			</div>
				<div class="mb-3">
		  		<label for="exampleFormControlInput1" class="form-label">Mot de passe</label>
		  		<input type="password" class="form-control" placeholder="Mot de passe" name="MDP_UTILISATEUR">
			</div>
			<button class="btn btn-primary" type="submit">S'enregistrer</button>
		</form>
	
	
	<div class="col-md-6">
		<h5 class="text-center mb-5">Liste des utilisateurs enregistrés</h5>
			<table class="table">
  				<thead>
				    <tr>
				      <th scope="col">Prénom</th>
				      <th scope="col">Nom</th>
				      <th scope="col">email</th>
				      <th scope="col">Date d'inscription</th>
				    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${utilisateurs}" var="utilisateur">
			    <tr>
			      <th scope="row">${ utilisateur.prenom }</th>
			      <td>${ utilisateur.nom }</td>
			      <td>${ utilisateur.email }</td>
			      <td>${ utilisateur.dateHeureInscription }</td>
			    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		
		</div>
		</div>
	</body>
</html>