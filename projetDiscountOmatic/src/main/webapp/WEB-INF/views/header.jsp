<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<c:url value="/webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	var="urlbootstrap" />
<link rel="stylesheet" href="${urlbootstrap}" />
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<title><c:out value='test' /></title>
</head>
<body>
	<header
		class="navbar navbar-expand-lg sticky-top mb-4 navbar-dark" style="background-color: #ECF0F1">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="/"></a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link text-dark" href='/'>DiscountOmatic</a></li>
				<li class="nav-item"><a class="nav-link text-primary" href='/'><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-house-door-fill" viewBox="0 0 16 16">
  <path d="M6.5 14.5v-3.505c0-.245.25-.495.5-.495h2c.25 0 .5.25.5.5v3.5a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5z"/>
</svg></a></li>			
			</ul>
		</div>
		
		<div class="container">
	<form action="/recherche/" method="get">
		<fieldset>
			<div class="input-group" style="width: 200%">
				<div class="input-group-prepend">
					<select id="oCategorie" name="oCategorie"
						class="custom-select bg-primary text-light">
						<option selected="selected" value="0">Catégorie</option>
						<option value="1">Articles</option>
					</select>
				</div>
				<input id="oSaisie" name="oSaisie" type="text" class="form-control"
					aria-label="Saisie de mots clés" placeholder="Mot(s) clé(s)"
					required="required">
				<div class="input-group-append">
					<button type="submit" class="btn btn-primary">
						<span class="fa fa-search text-center"></span>
					</button>
				</div>
			</div>
		</fieldset>
	</form>
</div>

<!-- Bouton panier -->
		<a class="btn btn-warning" href="/viewcart"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
  <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
</svg>
          Panier
        </a>
		
		<!-- Bouton profil -->
		<div class="btn-group dropleft ml-4" role="group">
		<button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
  <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
  <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
</svg>

		  Profile
		</button>
			<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<c:if test="${not empty sessionScope.isConnected && !sessionScope.isConnected}">
		        <a class="dropdown-item" href='login'>Login</a>
		        <a class="dropdown-item" href='signin'>Inscription</a>
		        </c:if>
		        <c:if test="${not empty sessionScope.isConnected && sessionScope.isConnected}">
		        <p>${sessionScope.user.firstName}</p>
                <a class=dropdown-item href='/myaccount'>Voir mon profile</a>
                <a class=dropdown-item href='/logout'>Logout</a>
                </c:if>
			</div>
		  
		
		</div>
	</header>
	<main class="container-fluid">