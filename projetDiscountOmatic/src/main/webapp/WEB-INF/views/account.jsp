<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Import du header -->
<c:import url="header.jsp">
    <c:param name="titre" value="Modification du Profil"/>
</c:import> 

<div class="card" style="max-width: 1500px">
    <div class="card-body">
	    <h5 class="card-title">${sessionScope.user.firstName} ${sessionScope.user.lastName}</h5>
	    <p class="card-text">${sessionScope.user.gender}</p>
	    <p class="card-text">${sessionScope.user.mail}</p>
	    <p class="card-text">${sessionScope.user.phoneNumber}</p>
        <p class="card-text">${sessionScope.user.adress.number}</p>
        <p class="card-text">${sessionScope.user.adress.street}</p>
        <p class="card-text">${sessionScope.user.adress.city}</p>
        <p class="card-text">${sessionScope.user.adress.country}</p>
	    <a href="/updateaccount" class="btn btn-primary">Modifier mes informations.</a>
    </div>
</div>


<!-- Import du footer, qui dispose de la balise fermante </body> -->
<c:import url="footer.jsp"/>



