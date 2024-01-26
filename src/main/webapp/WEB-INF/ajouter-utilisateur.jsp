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