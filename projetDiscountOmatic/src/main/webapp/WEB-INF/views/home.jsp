<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="header.jsp">
	<c:param name="titre" value="Accueil" />
</c:import>

<!-- Barre de recherche avec filtre par catégories & articles -->



<!-- Bannière du site -->

<div class="container">

	<img class="img ml-5 text-center" src="images/home_depannage.png"
		alt="Logo" />
	<!-- 		<h4 class="mr-8">Bienvenue sur Discountomatic</h4> -->
	<b><p class="mr-15">
			Vous recherchez des conseils, des bons plans ou encore un service
			après-vente de qualité, <br> DiscountOmatic et ses
			collaborateurs, tous passionnés par l’informatique et l’univers High
			Tech, <br> sauront répondre à vos besoins, que ce soit sur
			internet ou dans l’un de nos magasins près de chez vous.
		<p></b>
</div>

<!-- Catégories -->
<hr>
<div class="row">
	<div class="card mx-auto shadow p-3 mb-5 bg-body rounded" style="width: 20rem;">
		<img src="images/pcPortable2.jpg" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">Nos pc portables</h5>
			<p class="card-text">Voici une sélection de nos pc portables</p>
			<a href='<c:url value="/category?id=1"/>' class="btn btn-light mt-5 ml-4 rounded">Voir la catégorie</a>
		</div>
	</div>

	<div class="card mx-auto shadow p-3 mb-5 bg-body rounded" style="width: 20rem;">
		<img src="images/pcBureau.png" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">PC de bureau</h5>
			<p class="card-text">Vous cherchez un pc de bureau ? Visitez nos
				catégories</p>
			<a href='<c:url value="/category?id=2"/>' class="btn btn-light mt-5 ml-4 rounded">Voir la catégorie</a>
		</div>
	</div>

	<div class="card mx-auto shadow p-3 mb-5 bg-body rounded" style="width: 20rem;">
		<img src="images/ecran.jpg" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">Nos écrans</h5>
			<p class="card-text">Petite sélection de nos écran</p>
			<a href='<c:url value="/category?id=3"/>' class="btn btn-light mt-5 ml-4 rounded">Voir la catégorie</a>
		</div>
	</div>

	<div class="card mx-auto shadow p-3 mb-5 bg-body rounded" style="width: 20rem;">
		<img src="images/autres.jpg" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">Besoin d'un clavier ou d'une souris sans fil? Visitez notre catalogue </h5>
			<p class="card-text">Claviers & Souris</p>
			<a href='<c:url value="/category?id=4"/>' class="btn btn-light mt-5 ml-4 rounded">Voir la catégorie</a>
		</div>
	</div>
</div>
<hr>
<!-- Fin de catégories -->


<!-- Affichage des articles -->
<div>

<div class="container-fluid" style="background-color: #517DAF">
<b><h1 class="text-center text-white">Catalogue</h1></b>
</div>

</div>
<div class="row">
	<c:forEach items="${articleArray}" var="article">
		<div class="card mx-auto mt-5 shadow p-3 mb-5 bg-body rounded"
			style="width: 20rem">
			<img class="card-img-top" style="width: 18rem"
				src='/imgArticles/<c:out value="${article.picture}"/>' alt="Logo" />

			<div class="card-body">
				<h6 class="card-title" style="color: #154360">
					<c:out value="${article.name}" />
				</h6>
				<hr>
				<b><h6 class="card-test text-center" style="color: #154360">
						Prix:
						<c:out value="${article.price}" />
						€
					</h6></b> <a href='<c:url value="/showarticle?id=${article.articleId}"/>'
					class="btn btn-light mb-2 m-3 rounded-pill border border-2"><svg
						xmlns="http://www.w3.org/2000/svg" width="50" height="20"
						fill="currentColor" class="bi bi-eye" viewBox="0 0 16 16">
  <path
							d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8zM1.173 8a13.133 13.133 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5c2.12 0 3.879 1.168 5.168 2.457A13.133 13.133 0 0 1 14.828 8c-.058.087-.122.183-.195.288-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5 8 12.5c-2.12 0-3.879-1.168-5.168-2.457A13.134 13.134 0 0 1 1.172 8z" />
  <path
							d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5zM4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0z" />
</svg></a> <a href='<c:url value="/addcart?id=${article.articleId}"/>'
					class="btn btn-warning mb-2 m-3 rounded-pill"><svg
						xmlns="http://www.w3.org/2000/svg" width="15" height="16"
						fill="currentColor" class="bi bi-cart4" viewBox="0 0 16 16">
  <path
							d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z" />
</svg>Panier</a>

				<!-- Boutons card avec îcones -->

			</div>
		</div>
	</c:forEach>
</div>

<!-- Fin d'affichage des articles -->

<nav aria-label="Page navigation example">
	<ul class="pagination">
		<li class="page-item"><a class="page-link" href="#">Précedent</a></li>
		<li class="page-item"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Suivant</a></li>
	</ul>
</nav>

<c:import url="footer.jsp" />