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
<table class="table mt-4">
    <thead style="background-color: #517DAF">
        <tr>
            <th scopes="col"> </th>
            <th scopes="col">Article </th>
            <th scopes="col">Prix</th>
        </tr>
    </thead>
    <tbody>
        <c:set var="total" value="0" />
        <c:forEach items="${sessionScope.cart}" var="article">
		    <tr>
		          <th scopes="row"><img class="card-img-top" style="width: 50px"
                src='/imgArticles/<c:out value="${article.picture}"/>' alt="Logo" /></th>
		          <th scopes="row">${article.name}</th>
		          <th scopes="row">${article.price}</th>
		    </tr>
		    <c:set var="total" value="${total + article.price}" />
		</c:forEach>
		<tr>
		      <td></td>
		      <td><p class="text-right">Total:</p></td>
		      <td>${total}</td>
		</tr>
		<tr><td></td>
              <td></td>
              <td><a href="/pay" class="text-center"><button class="btn btn-light mt-5 m-3 rounded-pill border border-2">Passer commande.</button></a></td>
        </tr>
    </tbody>
</table>
</c:if>

</div>
<c:import url="footer.jsp"/>