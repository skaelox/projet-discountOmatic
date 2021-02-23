package fr.dawan.discountomatic.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.forms.LoginForm;

@Controller
@SessionAttributes({"user","isConnected","cart"})
public class ViewController {
    
    @Autowired
    private UserController userController;
    
    @Autowired
    private AdminController adminController;
    
    @GetMapping("/")
    public String homePage(Model m) {
        List<ArticleDto> articles = userController.getArticles();
        m.addAttribute("articleArray", articles);
        return "home";
    }
    
    @GetMapping("/login")
    public String loginGet(Model m) {
        m.addAttribute("loginform", new LoginForm());
        return "login";
    }
    
    @PostMapping("/login") 
    public String loginPost(@Valid @ModelAttribute("loginform") LoginForm loginForm, BindingResult result, HttpServletRequest request, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("error",result);
            model.addAttribute("loginform", loginForm);
        } else {
            CustomerDto c = userController.findAllByMailAndPassword(loginForm.getEmail(), loginForm.getPassword());
            System.out.println(c);
            if(c != null) {
                model.addAttribute("user", c);
                model.addAttribute("isConnected", true);
                return "redirect:/";
            } else {
                model.addAttribute("error", "L'adresse mail ou le mot de passe est invalide.");
                model.addAttribute("loginform", loginForm);
                return "login";
            }
        }
        
        return "redirect:/login";
    }
    
    @GetMapping("/logout")
    public String logout(@ModelAttribute ("user") CustomerDto user ,@ModelAttribute ("isConnected") Boolean connected,Model model )
    {
        model.addAttribute("user",new CustomerDto());
        model.addAttribute("isConnected",false);
        return"redirect:/";
    }
    
    @GetMapping("/account")
    public String account(Model m) {
        return "profile";
    }
    
    @GetMapping("/showarticle")
    public String showArticle(@RequestParam long id, Model m) {
        ArticleDto article = adminController.getArticleById(id);
        if(article != null ) {
            m.addAttribute(article);            
            return "details";
        }
        m.addAttribute("error", "Article Introuvable");
        return "/";
    }
    
    @PostMapping("/addcart")
    public String addCart(@RequestParam long id, HttpServletResponse response, Model m) {
        List<ArticleDto> cart = (List<ArticleDto>) m.getAttribute("cart");
        cart.add(adminController.getArticleById(id));
        m.addAttribute("cart",cart);
        return "redirect:/";
    }
    
    @ModelAttribute("user")
    public CustomerDto initUser() {
        return new CustomerDto();
    }
    
    @ModelAttribute("isConnected")
    public boolean initIsConnected() {
        return false;
    }
    
    @ModelAttribute("cart")
    public List<ArticleDto> initCart() {
        return new ArrayList<ArticleDto>();
    }
    
}
