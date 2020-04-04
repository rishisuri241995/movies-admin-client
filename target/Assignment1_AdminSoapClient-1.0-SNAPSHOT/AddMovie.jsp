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
<title>Add Movie</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="addmovie.css" rel="stylesheet" type="text/css" media="all" />
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>MOVIE FORM</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
                            <form action="MoviesServlet" method="post" enctype="multipart/form-data">
					<input class="text" type="text" name="title" placeholder="Title" required>
                                        <textarea maxlength="100" rows="6" cols="50" class="text" type="text" name="description" placeholder="Description" required></textarea>
					<input class="text" type="text" name="producer" placeholder="Producer" required>
                                        <input class="text" type="text" name="director" placeholder="Director" required>
                                        <input class="text" type="text" name="budget" placeholder="Budget" required>
                                         <input class="text" type="date" name="releasedate" required>
                                         
                                         <div class="file-field big">
                                        <a class="btn-floating btn-lg amber darken-2 mt-0 float-left">
                                          <i class="fas fa-images" aria-hidden="true"></i>
                                          <input type="file" accept="image/*" name="img" required>
                                        </a>
                                        </div><br/><br/>
					<input type="submit" name="addMovie" value="Add">
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
                                        <a href="MoviesServlet"  style="color:blue; font-size: 1.2em; text-align: center; margin: 0 8.5em">Back Home</a>
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