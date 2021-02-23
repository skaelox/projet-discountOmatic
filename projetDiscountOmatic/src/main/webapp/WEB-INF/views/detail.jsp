<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="header.jsp">
	<c:param name="titre" value="detail" />
</c:import>

<h3 class="text-center"><b><c:out value="${article.name}"/></b></h3>
<div class="row">

<img class="card-img-top  mx-auto shadow p-3 mb-5 bg-body rounded"
			src='/imgArticles/<c:out value="${article.picture}"/>' alt="Logo"
			style="max-width: 30%" />



	<div class="card mx-auto mt-5 shadow p-3 mb-5 bg-body rounded w-50 p-3" style="background-color: #EBF5FB ">
		

		<div class="card-body">
			<h3 class="card-test" style="color: #000080">
				Prix:
				<c:out value="${article.price}" />
			</h3>
			<h3 class="card-title">
				<c:out value="${article.description}" />
			</h3>
			<a href='<c:url value="/"/>' class="btn btn-light mt-5 ml-4">Retour</a>
			<a href="#" class="btn btn-warning mt-5 mr-4">Panier</a>
		</div>
	</div>
</div>




<c:import url="footer.jsp" />