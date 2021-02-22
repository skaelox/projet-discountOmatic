<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="header.jsp">
	<c:param name="titre" value="Accueil" />
</c:import>


<div class="jumbotron jumbotron-fluid">
	<div class="container">
		<h1 class="display-4">Fluid jumbotron</h1>
		<p class="lead">This is a modified jumbotron that occupies the
			entire horizontal space of its parent.</p>
	</div>
</div>


<div class="card-group">
	<div class="card shadow p-3 mb-5 bg-body rounded m-3 ml-4" style="width: 40rem">
		<img class="card-img-top" src="..." alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">Catégorie 1</h5>
			<p class="card-text">This is a wider card with supporting text
				below as a natural lead-in to additional content. This content is a
				little bit longer.</p>
			<p class="card-text">
<!-- 				<small class="text-muted">Last updated 3 mins ago</small> -->
			</p>
			<a href="#" class="btn btn-light mt-5 ml-4">Voir catégorie</a> 
		</div>
	</div>
	<div class="card shadow p-3 mb-5 bg-body rounded m-3" style="width: 40rem">
		<img class="card-img-top" src="..." alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">Catégorie 2</h5>
			<p class="card-text">This card has supporting text below as a
				natural lead-in to additional content.</p>
			<p class="card-text">
<!-- 				<small class="text-muted">Last updated 3 mins ago</small> -->
			</p>
			<a href="#" class="btn btn-light mt-5 ml-4">Voir catégorie</a> 
		</div>
	</div>
	<div class="card shadow p-3 mb-5 bg-body rounded m-3 mr-4" style="width: 40rem">
		<img class="card-img-top" src="..." alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">Catégorie 3</h5>
			<p class="card-text">This is a wider card with supporting text
				below as a natural lead-in to additional content. This card has even
				longer content than the first to show that equal height action.</p>
			<p class="card-text">
<!-- 				<small class="text-muted">Last updated 3 mins ago</small> -->
			</p>
			<a href="#" class="btn btn-light mt-5 ml-4">Voir catégorie</a> 
		</div>
	</div>
</div>

<div class="row">

	<c:forEach items="${articleArray}" var="article">
		<div class="card mx-auto mt-5 shadow p-3 mb-5 bg-body rounded"
			style="width: 20rem">
			<img class="card-img-top" src="" alt="Photo Article">
			<div class="card-body">
				<h4 class="card-title">
					<c:out value="${article.name}" />
				</h4>
				<hr>
				<h4 class="card-test" style="color: #6610f2">
					Prix:
					<c:out value="${article.price}" />
				</h4>
				<a href="#" class="btn btn-light mt-5 ml-4">See more.</a> 
				<a href="#" class="btn btn-warning mt-5 mr-4">Panier</a> 
			</div>
		</div>
	</c:forEach>
</div>

<nav aria-label="Page navigation example">
	<ul class="pagination">
		<li class="page-item"><a class="page-link" href="#">Previous</a></li>
		<li class="page-item"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
</nav>

<c:import url="footer.jsp" />