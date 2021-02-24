<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Import du header -->
<c:import url="header.jsp">
    <c:param name="titre" value="Inscription"/>
</c:import> 

<h1>Inscription</h1>

<!-- Formulaire d'inscription -->
<form:form action="/signin" method="post" modelAttribute="createaccountform">
    <div id="container">

        <!-- Radio button -->
        <form:label path="gender" >
            <form:label path="gender">Homme</form:label>
            <form:radiobutton path="gender" value="homme" checked="checked" />
            
            <form:label path="gender">Femme</form:label>
            <form:radiobutton path="gender" value="femme" />
            
            <form:label path="gender">Autre</form:label>
            <form:radiobutton path="gender" value="Autre" />
        </form:label>
        <!-- Text Field -->    
        <div class="form-group">
	        <form:label path="prenom">Prénom</form:label>
	        <form:input class="form-control" path="prenom" placeholder="Entrer votre prenom"/>
	        <form:errors class="small text-danger" path="prenom"/>
        </div>        
        <div class="form-group">
            <form:label path="nom">Nom</form:label>
	        <form:input class="form-control" path="nom" placeholder="Entrer votre nom"/>
	        <form:errors class="small text-danger" path="nom"/>
        </div>        
        <div class="form-group">
            <form:label path="email">Adresse e-mail</form:label> 
            <form:input class="form-control" path="email" type="email" placeholder="Entrer votre adresse mail"/>
            <form:errors class="text-danger small" path="email"/>
        </div>        
        <div class="form-group">
            <form:label class="form-label" path="confirm_email">Confirmation de l'adresse mail :</form:label> 
            <form:input class="form-control" path="confirm_email" type="email" placeholder="Entrer de nouveau votre adresse mail"/>
            <form:errors class="text-danger small" path="confirm_email"/>
        </div>       
        <div class="form-group">
            <form:label class="form-label" path="password">Mot de passe :</form:label>
	        <form:password class="form-control" path="password" placeholder="Entrer votre mot de passe"/>
	        <form:errors class="small text-danger" path="password"/>
        </div>       
        <div class="form-group">
            <form:label class="form-label" path="confirm_password">Confirmation du mot de passe :</form:label>
            <form:password class="form-control" path="confirm_password" placeholder="Entrer de nouveau le mot de passe"/>
            <form:errors class="small text-danger" path="confirm_password"/>
        </div>        
        <div class="form-group">
            <form:label class="form-label" path="phone_number">N° de téléphone :</form:label>
            <form:input class="form-control" path="phone_number" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="phone_number"/> 
        </div>
        
        <!-- Adresse -->    
        <h2>Adresse</h2>
        
        <div class="form-group">
            <form:label class="form-label" path="number">N°</form:label>
            <form:input class="form-control" path="number" placeholder="Entrer votre n° de rue"/>
            <form:errors class="small text-danger" path="number"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="street">Rue</form:label>
            <form:input class="form-control" path="street" placeholder="Entrer votre rue"/>
            <form:errors class="small text-danger" path="street"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="city">Ville</form:label>
            <form:input class="form-control" path="city" placeholder="Entrer votre ville"/>
            <form:errors class="small text-danger" path="city"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="country">Pays</form:label>
            <form:input class="form-control" path="country" placeholder="Entrer votre pays"/>
            <form:errors class="small text-danger" path="country"/> 
        </div>
        <!-- Button -->
        <input class="btn btn-success" type="submit" id='submit' value='Valider'>
        <input class="btn btn-danger" type="submit" id='submit' value='Annuler'>
    </div>
</form:form>

<!-- Import du footer, qui dispose de la balise fermante </body> -->
<c:import url="footer.jsp"/>



