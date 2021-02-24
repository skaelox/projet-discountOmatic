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
		    <thead style="background-color: #ECF0F1">
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
		            <th>${sessionScope.user.firstName}</th>
		            <th>${sessionScope.user.lastName}</th>
		            <th>${sessionScope.user.adress.number}</th>
		            <th>${sessionScope.user.adress.street}</th>
		            <th>${sessionScope.user.adress.city}</th>
		            <th>${sessionScope.user.adress.country}</th>
		        </tr>
		    </tbody>
		</table>

<!-- 
    Etablissement de l'addresse de livraison
 -->
 	
	<h2>Informations du lieu de livraison</h2>
    <form:form action="/#" method="post" modelAttribute="createorderform">
        <div class="form-group">
            <form:label class="form-label" path="customerordernumber">N° de rue</form:label>
            <form:input class="form-control" path="customerordernumber" placeholder="Entrer votre n° de rue "/>
            <form:errors class="small text-danger" path="customerordernumber"/> 
        </div>
        
        <div id="container">
            <div class="form-group">
            <form:label class="form-label" path="customerorderstreet">Rue</form:label>
            <form:input class="form-control" path="customerorderstreet" placeholder="Entrer votre rue"/>
            <form:errors class="small text-danger" path="customerorderstreet"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="customerordercity">Ville</form:label>
            <form:input class="form-control" path="customerordercity" placeholder="Entrer votre ville"/>
            <form:errors class="small text-danger" path="customerordercity"/> 
        </div>
        
        <div class="form-group">
            <form:label class="form-label" path="customerordercountry">Pays</form:label>
            <form:input class="form-control" path="customerordercountry" placeholder="Entrer votre pays"/>
            <form:errors class="small text-danger" path="customerordercountry"/> 
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
