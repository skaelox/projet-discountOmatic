<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Import du header -->
<c:import url="header.jsp">
    <c:param name="titre" value="Edition de facture"/>
</c:import> 

<h1>Edition de Facture</h1>

<!-- Formulaire d'édition de facture -->

<!--
    Récuperation des infos clients via la session + Etablissement d'un tableau avec les données stockées
-->

<div class="card mx-auto" style="max-width: 1500px">
	<h2>Informations client</h2>
		<table class="table">
		    <thead style="background-color: #517DAF">
		        <tr>
		            <th>Prénom</th>
		            <th>Nom</th>
		            <th>N° de rue</th>
		            <th>Adresse</th>
		            <th>Ville</th>
		            <th>Pays</th>
		        </tr>
		    </thead>
		    <tbody>
		        <tr>
		            <td>${sessionScope.user.firstName}</td>
		            <td>${sessionScope.user.lastName}</td>
		            <td>${sessionScope.user.adress.number}</td>
		            <td>${sessionScope.user.adress.street}</td>
		            <td>${sessionScope.user.adress.city}</td>
		            <td>${sessionScope.user.adress.country}</td>
		        </tr>
		    </tbody>
		</table>

<!-- 
    Etablissement de l'addresse de livraison
 -->
 	
	<h2>Informations du lieu de livraison</h2>
    <form:form action="/pay" method="post" modelAttribute="orderform">
        <div class="form-group">
            <form:label class="form-label" path="number">N° de rue</form:label>
            <form:input class="form-control" path="number" placeholder="Entrer votre n° de rue "/>
            <form:errors class="small text-danger" path="number"/> 
        </div>
        
        <div id="container">
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
        <div class="form-group">
            <form:label class="form-label" path="numCb">Numéros de carte de crédit</form:label>
            <form:input class="form-control" path="numCb" placeholder="Entrer le numéros de carte de crédit"/>
            <form:errors class="small text-danger" path="numCb"/> 
        </div>
        <div class="form-group">
            <form:label class="form-label" path="ownerCb">Propiétaire de la carte de crédit</form:label>
            <form:input class="form-control" path="ownerCb" placeholder="Entrer propiétaire de la carte de crédit"/>
            <form:errors class="small text-danger" path="ownerCb"/> 
        </div>
        <div class="form-group">
            <form:label class="form-label" path="cryptoCb">Cyptocode</form:label>
            <form:input class="form-control" path="cryptoCb" placeholder="Entrer votre cyptocode"/>
            <form:errors class="small text-danger" path="cryptoCb"/> 
        </div>
        </div>
    </form:form>
    
<!-- 
    Récuperation des produits via le panier + Etablissement d'un tableau avec les données stockées
 -->
		
	<h2>Liste des produits</h2>
		<c:if test="${empty sessionScope.cart}">
	        <p class="text-center"> Aucun produit selectionné. </p>
	    </c:if>
	
	    <c:if test="${not empty sessionScope.cart}">
	        <table class="table">
	            <thead style="background-color: #ECF0F1">
	                <tr>
	                    <th scopes="col">Article </th>
	                    <th scopes="col">Prix</th>
	                </tr>
	            </thead>
	            <tbody>
	                <c:forEach items="${sessionScope.cart}" var="article">
	                    <tr>
	                        <th scopes="row">${article.name}</th>
	                        <th scopes="row">${article.price}</th>
	                    </tr>
	                </c:forEach>
	            </tbody>
	        </table>
	    </c:if>
</div>


<!-- Import du footer -->
<c:import url="footer.jsp"/>
