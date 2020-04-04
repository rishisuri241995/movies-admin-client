<%-- 
    Document   : listmovie
    Author     : rishi
	ListMovie Jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.text.SimpleDateFormat" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="listmovie.css" rel="stylesheet" type="text/css" />
        
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <title>Movie List</title>
    </head>
    <body>
	<!-- main -->
         <form action="MoviesServlet" method="POST">
	<div class="main-w3layouts wrapper">
		<h1>MOVIE LIST</h1>
                <div class="container">
                    <div class="row">
                      <div class="col-12">
                        <table class="table table-hover table-bordered">
                          <thead>
                            <tr>
                              <th scope="col">Title</th>
                              <th scope="col">Description</th>
                              <th scope="col">Producer</th>
                              <th scope="col">Director</th>
                              <th scope="col">Release Date</th>
                              <th scope="col">Budget</th>
                              <th scope="col">Poster</th>
                            </tr>
                          </thead>
                          <tbody>
                              <c:forEach var="movie" items="${movie}" varStatus="loop">
                                  <tr><th scope="row">${movie.title}</th>
                                                  <td>${movie.description}</td>
                                                  <td>${movie.producer}</td>
                                                  <td>${movie.director}</td>
                                                  <td>${dates[loop.index]}</td>
                                                  
                                                  <td>${movie.budget}</td>
                                                  <td class="w-25">
                                                      <img src="data:image/jpg;base64,${image[loop.index]}" class="img-fluid img-thumbnail" width="100" height="100">
                                                     
                                                    </td>
						<td>
                                                  <button type="submit" name="updateid" value="${movie.id}" class="btn btn-success"><i class="fas fa-edit"></i></button>
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                  <button type="submit" name="deleteMovie" value="${movie.id}" class="btn btn-danger"><i class="far fa-trash-alt"></i></button>
                                                </td></tr>
                                </c:forEach>
                          <button type="submit" class="btn btn-primary" name="addPage">ADD NEW MOVIE&nbsp;&nbsp;&nbsp;<i class="fas fa-plus "></i></button>
                          </tbody>
                        </table>
                      </div>
                    </div>
                  </div>
		<!-- copyright -->
		<div class="fixed-bottom myright">
			<p>© 2020 MovieBizz. All rights reserved | Design by Rishi Suri</p>
		</div>
		<!-- //copyright -->
		<ul class="bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
         </form>
</body>
</html>
