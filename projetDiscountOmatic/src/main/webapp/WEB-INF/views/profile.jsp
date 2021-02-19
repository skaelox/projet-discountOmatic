<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 


<c:import url="header.jsp"/>
<!-- Import du header, qui dispose de la balise ouvrante <body> -->

<div id="container">

    <!-- Formulaire dde modification du profil -->
    <form action="#" method="POST">
        <h1>Modifier son profil</h1>

        <input type="radio" id="homme" name="gender" value="homme" checked>
        <label for="homme">Homme</label>
        <input type="radio" id="femme" name="gender" value="femme" checked>
        <label for="femme">Femme</label>
        <input type="radio" id="autre" name="gender" value="autre" checked>
        <label for="autre">Autre</label>
        
        <label>Prénom :</label> 
        <input type="text" placeholder="Entrer votre Prénom" name="firstName">
        
        <label>Nom :</label> 
        <input type="text" placeholder="Entrer votre Nom" name="lastName">
        
        <label>Adresse e-mail :</label> 
        <input type="email" placeholder="Entrer votre adresse mail" name="mail" required>
        
        <label>Confirmation de l'adresse mail :</label> 
        <input type="email" placeholder="Entrer de nouveau votre adresse mail" name="confirm_mail" required>

        <label>Mot de passe :</label> 
        <input type="password" placeholder="Entrer le mot de passe" name="password" required>
        
        <label>Confirmation du mot de passe :</label> 
        <input type="password" placeholder="Entrer de nouveau le mot de passe" name="confirm_password" required>
        
        <label>N° de téléphone :</label> 
        <input type="text" placeholder="Entrer votre n° de téléphone" name="phone_number" required>

        <input type="submit" id='submit' value='Connexion'>
    </form>
</div>


<c:import url="footer.jsp"/>
<!-- Import du footer, qui dispose de la balise fermante </body> -->