<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<c:import url="header.jsp">
    <c:param name="titre" value="Exemple"/>
</c:import>

<h1>Modification du Profil</h1>

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
            <form:label class="form-label" path="phone_number">N° de téléphone :</form:label>
            <form:input class="form-control" path="phone_number" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="phone_number"/> 
        </div>
        
        <!-- Adress -->    
        <h2>Adresse</h2>
        <div class="form-group">
            <form:label class="form-label" path="street">Rue</form:label>
            <form:input class="form-control" path="street" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="street"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="number">N°</form:label>
            <form:input class="form-control" path="number" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="number"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="city">Ville</form:label>
            <form:input class="form-control" path="city" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="city"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="country">Pays</form:label>
            <form:input class="form-control" path="country" placeholder="Entrer votre n° de téléphone"/>
            <form:errors class="small text-danger" path="country"/> 
        </div>
        <!-- Button -->
        <input class="btn btn-success" type="submit" id='submit' value='Valider'>
        <input class="btn btn-danger" type="submit" id='submit' value='Annuler'>
    </div>
</form:form>

<c:import url="footer.jsp"/>