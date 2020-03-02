<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Listado de Peliculas</title>
    <spring:url value="/resources" var="urlPublic" />
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link href="${urlPublic }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
  </head>

  <body>

    <jsp:include page="../includes/menu.jsp"></jsp:include>
    
<div class="container theme-showcase" role="main">

      <h3>Listado de Peliculas</h3>
       <c:if test="${msg!=null }">
    <div class='alert alert-success' role="alert">${ msg }</div>
    </c:if>   
      
      
      <a href="create" class="btn btn-success" role="button" title="Nueva Pelicula" >Nueva</a><br><br>
	
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered">
            <tr>
                <th>Titulo</th>
                <th>Genero</th>
                <th>Clasificacion</th>
                <th>Duracion</th>
                <th>Fecha Estreno</th>
                <th>Estatus</th>
                <th>Opciones</th>
            </tr>
            <c:forEach items="${peliculas }" var="pelicula">
            <tr>
                <td>${pelicula.titulo }</td>
                <td>${pelicula.genero }</td>
                <td>${pelicula.clasificacion }</td>
                <td>${pelicula.duracion }</td>
                <td><fmt:formatDate value="${pelicula.fechaEstreno }" pattern="dd-MM-yyyy"/></td>
                <td>
                <c:choose>
                <c:when test="${pelicula.estatus=='Activa' }">
                <span class="badge badge-success">Activa</span>
                </c:when>
                <c:otherwise>
                <span class="badge badge-danger">Inactiva</span>
                </c:otherwise>
                </c:choose>
                </td>
                <td>
                    <button href="#" class="btn btn-success " type="button" title="Edit" > <i class="fa fa-pencil-square-o"></i></button>
                    <button href="#" class="btn btn-danger" type="button" title="Eliminar"><i class="fa fa-trash"></i></button>
                </td>
            </tr>
            </c:forEach>
          
        </table>
      </div>
          
      <hr class="featurette-divider">

      <!-- FOOTER -->
<jsp:include page="../includes/footer.jsp"></jsp:include>

    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="bootstrap/js/bootstrap.min.js"></script>     
  </body>
</html>
