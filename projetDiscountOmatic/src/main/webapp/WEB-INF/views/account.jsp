<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Import du header -->
<c:import url="header.jsp">
    <c:param name="titre" value="Modification du Profil"/>
</c:import> 

<h1>Modification du Profil</h1>

<!-- Formulaire d'inscription -->
<form:form action="/signin" method="post" modelAttribute="createaccountform">
    <div class="form-check" id="container">

        <!-- Radio button -->
        <div class="form-check">
            <form:input class="form-check-input" type="radio" id="femme" name="gender" value="femme" checked/>
            <form:label class="form-check-label" path="homme">Homme</form:label>
        </div>
        <div class="form-check">
            <form:input class="form-check-input" type="radio" id="homme" name="gender" value="homme"/>
            <form:label class="form-check-label" path="femme">Femme</form:label>
        </div>
        <div class="form-check">
            <form:input class="form-check-input" type="radio" id="autre" name="gender" value="autre"/>
            <form:label class="form-check-label" path="autre">Autre</form:label>
        </div>
            
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
            <form:input class="form-control" type="email" placeholder="Entrer votre adresse mail"/>
            <form:errors class="text-danger small" path="email"/>
        </div>        
        <div class="form-group">
            <form:label class="form-label" path="confirm_email">Confirmation de l'adresse mail :</form:label> 
            <form:input class="form-control" type="email" placeholder="Entrer de nouveau votre adresse mail"/>
            <form:errors class="text-danger small" path="confirm_email"/>
        </div>       
        <div class="form-group">
            <form:label class="form-label" path="password">Mot de passe :</form:label>
            <form:password class="form-control" path="password" placeholder="Entrer votre mot de passe"/>
            <form:errors class="small text-danger" path="password"/>
        </div>       
        <div class="form-group">
            <form:label class="form-label" path="confirm_password">Confirmation du mot de passe :</form:label>
            <form:password class="form-control" path="password" placeholder="Entrer de nouveau le mot de passe"/>
            <form:errors class="small text-danger" path="confirm_password"/>
        </div>        
        <div class="form-group">
            <form:label class="form-label" path="phone_number">N° de téléphone :</form:label>
            <form:password class="form-control" path="password" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="phone_number"/> 
        </div>        

        <!-- Button -->
        <input class="btn btn-success" type="submit" id='submit' value='Valider'>
        <input class="btn btn-danger" type="submit" id='submit' value='Annuler'>
    </div>
</form:form>

<!-- Import du footer, qui dispose de la balise fermante </body> -->
<c:import url="footer.jsp"/>



