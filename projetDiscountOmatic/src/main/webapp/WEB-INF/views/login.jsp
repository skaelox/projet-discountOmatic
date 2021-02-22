<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Import du header -->
<c:import url="header.jsp">
    <c:param name="titre" value="Connnexion"/>
</c:import> 

<h1>Connexion</h1> 

<!-- Formulaire de connexion -->
<form:form action="/login" method="post" modelAttribute="loginform">
	<div class="form-check" id="container">	
		<div class="form-group">
			<form:label path="email">Adresse e-mail</form:label> 
			<form:input class="form-control" path="email" type="email" placeholder="Entrer votre adresse mail" name="mail"/>
			<form:errors class="text-danger small" path="email"/>
		</div>
		
		<div class="form-group">
			<form:label path="password">Mot de passe</form:label> 
			<form:input class="form-control" path="password" type="password" placeholder="Entrer le mot de passe" name="password"/>
			<form:errors class="text-danger small" path="password"/>
		</div>
		<input class="btn btn-success" type="submit" value='Connexion'>
	</div>
</form:form>


<!-- Import du footer, qui dispose de la balise fermante </body> -->
<c:import url="footer.jsp"/>
