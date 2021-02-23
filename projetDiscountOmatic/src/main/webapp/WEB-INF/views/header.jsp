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
<title><c:out value='test' /></title>
</head>
<body>
	<header
		class="navbar navbar-expand-lg sticky-top mb-4 navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="/"></a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href='/'>DiscountOmatic</a></li>
				<li class="nav-item"><a class="nav-link" href='/'>Accueil</a></li>			
			</ul>
		</div>
		<div class="btn-group dropleft" role="group">
		<button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		  Profile
		</button>
			<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<c:if test="${not empty sessionScope.isConnected && !sessionScope.isConnected}">
		        <a class="dropdown-item" href='login'>Login</a>
		        <a class="dropdown-item" href='subcribe'>Inscription</a>
		        <a class=dropdown-item href='account'>Logout</a>
		        </c:if>
		        <c:if test="${not empty sessionScope.isConnected && sessionScope.isConnected}">
		        <p>${sessionScope.user.firstName}</p>
                <a class=dropdown-item href='#'>Voir mon profile</a>
                <a class=dropdown-item href='/logout'>Logout</a>
                <a class=dropdown-item href='#'>Voir mon profile</a>
                </c:if>
			</div>
		
		
		</div>
	</header>
	<main class="container-fluid">