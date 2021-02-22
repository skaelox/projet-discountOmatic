package fr.dawan.discountomatic.controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.dawan.discountomatic.dto.ArticleDto;

@Controller
@SessionAttributes({"user","isConnected"})
public class ViewController {
    
    @Autowired
    private UserController userController;
    
    @GetMapping("/")
    public String homePage(Model m) {
        List<ArticleDto> articles = userController.getArticles();
        m.addAttribute("articleArray", articles);
        return "home";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/account")
    public String account(Model m) {
        return "profile";
    }
    
    @PostMapping("/addcart")
    public String addCart(@RequestParam String value, HttpServletResponse response) {
        Cookie cart = new Cookie("items", value);
        response.addCookie(cart);
        return "redirect:/";
    }

}
