<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 


<c:import url="header.jsp"/>
<!-- Import du header, qui dispose de la balise ouvrante <body> -->

<div id="container">

	<!-- zone de connexion -->
	<form action="#" method="POST">
		<h1>Connexion</h1>

		<label><b>Adresse e-mail</b></label> <input type="email"
			placeholder="Entrer votre adresse mail" name="mail" required>

		<label><b>Mot de passe</b></label> <input type="password"
			placeholder="Entrer le mot de passe" name="password" required>

		<input type="submit" id='submit' value='Connexion'>
	</form>
</div>


<c:import url="footer.jsp"/>
<!-- Import du footer, qui dispose de la balise fermante </body> -->