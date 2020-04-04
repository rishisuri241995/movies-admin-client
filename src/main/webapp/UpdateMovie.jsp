<%-- 
    Document   : AddMovie
    Author     : rishi
	AddMovie Jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Update Movie</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
        <link href="addmovie.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>UPDATE MOVIE</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
                            <form action="MoviesServlet" method="post" enctype="multipart/form-data">
					<input class="text" type="text" name="title" value="${movie.title}" placeholder="Title" required>
                                        <textarea rows="6" cols="50" class="text" name="description" placeholder="Description" required>${movie.description}</textarea>
					<input class="text" type="text" name="producer" placeholder="Producer" value="${movie.producer}" required>
                                        <input class="text" type="text" name="director" placeholder="Director" value="${movie.director}" required>
                                        <input class="text" type="text" name="budget" placeholder="Budget" value="${movie.budget}" required>
                                         <input class="text" type="date" name="releasedate" value="${movie.releaseDate}" required>
					
                                            <div class="file-field big form-group">
                                                        <a class="btn-floating btn-lg amber darken-2 mt-0 float-left">
                                                          <i class="fas fa-images" aria-hidden="true"></i>
                                                          <input type="file" id="img" name="img" accept="image/*">
                                                        </a>
                                                        </div><br/><br/>

                                    <c:if test="${not empty uploadedImg}">
                                        <p style="color: black; font-weight: bold">OLD IMAGE</p>
                                    <div class="form-group">
                                        <img src="data:image/jpg;base64,${uploadedImg}" class="img-thumbnail" style="margin-left:15%;margin-right: 15%;" width="304" height="auto"> 
                                    </div>
                                </c:if>
					<input type="submit" name="updateMovie" value="Update">
                                        <c:if test="${not empty error}">
                                            <div class="row">
                                                <medium class="text-danger" style='color:red'>
                                                    <mark>${error}</mark>
                                                </medium>      
                                            </div>
                                        </c:if>
                                        <c:if test="${not empty handlerError}">
                                            <div class="row">
                                                <medium class="text-danger" style='color:red'>
                                                   <mark>${handlerError}</mark>
                                                </medium>      
                                            </div>
                                        </c:if>
                                        <c:if test="${not empty imageError}">
                                            <div class="row">
                                                <medium class="text-danger" style='color:red'>
                                                   <mark>${imageError}</mark>
                                                </medium>      
                                            </div>
                                        </c:if>
                                        <a href="MoviesServlet" style="color:blue; font-size: 1.2em; text-align: center; margin: 0 8.5em">Back Home</a>
				</form>
			</div>
		</div>
		<!-- copyright -->
		<div class="myright fixed-bottom">
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
	<!-- //main -->
</body>
</html>