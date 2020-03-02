<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<spring:url value="/" var="urlRoot" />

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class=container>
		<a class="navbar-brand" href="#"> <img
			src="https://image.flaticon.com/icons/png/512/168/168818.png"
			width="50" height="50" alt="">
		</a> <a class="navbar-brand" href="${urlRoot }">Cinema Metropol</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
		
				<li class="nav-item active"><a class="nav-link" href="${urlRoot }peliculas/index">Peliculas
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Acerca
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Login
						<span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Buscar" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
			</form>
		</div>
	</div>
</nav>