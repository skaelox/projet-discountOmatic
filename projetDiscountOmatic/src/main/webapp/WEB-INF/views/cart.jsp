<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
   
<c:import url="header.jsp">
    <c:param name="titre" value="Exemple"/>
</c:import>

<table class="table">
    <thead>
        <tr>
            <th scopes="col"> </th>
            <th scopes="col">Article </th>
            <th scopes="col">Prix</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${sessionScope.cart}" var="article">
		    <tr>
		          <th scopes="row">${article.picture}</th>
		          <th scopes="row">${article.name}</th>
		          <th scopes="row">${article.price}</th>
		    </tr>
		</c:forEach>
    </tbody>
</table>

<c:import url="footer.jsp"/>