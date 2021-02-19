<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<c:import url="header.jsp">
    <c:param name="titre" value="Accueil"/>
</c:import>

<div class="row">
<c:forEach items="${articleArray}" var="article">
        <div class="card" style="width: 20rem">
            <img class="card-img-top" src="" alt="Photo Article">
            <div class="card-body">
                <h3 class="card-title"><c:out value="${article.name}" /></h3>
                <p class="card-test"><c:out value="${article.price}" /></p>
                <a href="#" class="btn btn-light">See more.</a>
            </div>
        </div>
</c:forEach>
</div>

<c:import url="footer.jsp"/>