package fr.dawan.discountomatic.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.services.UserService;


/**
 * Web services pour les Utilisateurs
 * @author Kévin Langlet
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping(produces = "application/json")
    public List<ArticleDto> getArticles(){
        return userService.getAllArticle();
    }
    
    @GetMapping(produces = "application/json")
    public List<CategoryDto> getCategories(){
        return userService.getAllCategory();
    }
    
    @GetMapping(value="/find")
    public CustomerDto findBy(@RequestParam(name = "mail", required = true) String mail, 
            @RequestParam(name = "password", required = true) String password){
        return userService.findAllByMailAndPassword(mail, password);
    }
}