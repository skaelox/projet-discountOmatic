<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
   
<c:import url="header.jsp">
    <c:param name="titre" value="Exemple"/>
</c:import>

<div class="card mx-auto" style="max-width: 1500px">
<c:if test="${empty sessionScope.cart}">
    <p class="text-center"> Votre panier est vide. </p>
</c:if>
<c:if test="${not empty sessionScope.cart}">
<table class="table">
    <thead style="background-color: #ECF0F1">
        <tr>
            <th scopes="col"> </th>
            <th scopes="col">Article </th>
            <th scopes="col">Prix</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${sessionScope.cart}" var="article">
		    <tr>
		          <th scopes="row"><img class="card-img-top" style="width: 50px"
                src='/imgArticles/<c:out value="${article.picture}"/>' alt="Logo" /></th>
		          <th scopes="row">${article.name}</th>
		          <th scopes="row">${article.price}</th>
		    </tr>
		</c:forEach>
    </tbody>
</table>
</c:if>
</div>
<c:import url="footer.jsp"/>