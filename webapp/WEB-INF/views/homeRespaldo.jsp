<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenidos a Cineapp</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet" 
	href="${urlPublic }/bootstrap/css/bootstrap.min.css">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>
<body>


	<!-- 	<h1>Lista de peliculas</h1> -->

	<!-- 	<ol> -->
	<%-- 		<c:forEach items="${peliculas}" var="pelicula"> --%>
	<%-- 			<li>${pelicula}</li> --%>
	<%-- 		</c:forEach> --%>
	<!-- 	</ol> -->

	<div class="card">
		<div class="card-header">Lista de peliculas</div>
		<div class="card-body">

			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>Titulo</th>
						<th>Duracion</th>
						<th>Clasificacion</th>
						<th>Genero</th>
						<th>Imagen</th>
						<th>Fecha Estreno</th>
						<th>Estatus</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${peliculas}" var="pelicula">
						<tr>
							<td>${pelicula.id }</td>
							<td>${pelicula.titulo }</td>
							<td>${pelicula.duracion }min</td>
							<td>${pelicula.clasificacion }</td>
							<td>${pelicula.genero }</td>
							<td><img src="${urlPublic}/images/${pelicula.imagen}" width="80" height="100"></td>
							<td><fmt:formatDate value="${pelicula.fechaEstreno }" pattern="dd-MM-yyyy"/></td>
							<td>
							<c:choose>
							<c:when test="${pelicula.estatus=='Activa' }">
							<button type="button" class="btn btn-success">Activa</button>
							</c:when>
							<c:otherwise>
							<button type="button" class="btn btn-danger">Inactiva</button>
							</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>