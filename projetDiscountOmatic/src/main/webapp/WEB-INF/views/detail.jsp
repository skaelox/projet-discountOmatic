<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="header.jsp">
	<c:param name="titre" value="detail" />
</c:import>



<div class="row">
    <div class="card mx-auto mt-5 shadow p-3 mb-5 bg-body rounded"
            style="width: 20rem">
            <img class="card-img-top" src='/imgArticles/<c:out value="${article.picture}"/>' alt="Logo" /> 

            <div class="card-body">
                <h4 class="card-title">
                    <c:out value="${article.name}" />
                </h4>
                <hr>
                <h4 class="card-test" style="color: #6610f2">
                    Prix:
                    <c:out value="${article.price}" />
                </h4>
                <a href='<c:url value="/details"/>' class="btn btn-light mt-5 ml-4">See more.</a> 
                <a href="#" class="btn btn-warning mt-5 mr-4">Panier</a> 
            </div>
</div>



<c:import url="footer.jsp" />