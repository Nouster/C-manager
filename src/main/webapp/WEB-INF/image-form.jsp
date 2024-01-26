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

	
	<h1 class="text-center mt-5">Ajouter une affiche de film</h1>
	<div class="row justify-content-center mt-5">
		<div class="col-md-6">
			<form method="POST">
				<label>Liste des films</label>
				<select class="form-select" name="ID_FILM">
				  <c:forEach items="${films}" var="film">
						<option value=${ film.idFilm }> ${film.nomFilm }</option>
					</c:forEach>
				</select>
			
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">URL de l'image</label>
				  <input type="text" class="form-control" name="URL_IMAGE" placeholder="URL">
				</div>
				<button class="btn btn-primary" type="submit">Ajouter une affiche</button>
			</form>
		</div>
	</div>
</body>
</html>