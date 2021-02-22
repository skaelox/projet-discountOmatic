package fr.dawan.discountomatic.controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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

import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.forms.LoginForm;

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
    public String loginGet(Model m) {
        m.addAttribute("loginform", new LoginForm());
        return "login";
    }
    
    @PostMapping("/login") 
    public ModelAndView loginPost(@ModelAttribute("user") Customer userSession, @Valid @ModelAttribute("loginform") LoginForm loginForm, BindingResult result) {
        ModelAndView model = new ModelAndView();
        if(result.hasErrors()) {
            model.addObject("error",result);
            model.addObject("loginform", loginForm);
        } else {
            CustomerDto c = userController.findAllByMailAndPassword(loginForm.getEmail(), loginForm.getPassword());
            if(c != null) {
                model.addObject("user", c);
                model.addObject("isConnected", true);
                model.setViewName("redirect:/");
            } else {
                model.addObject("loginform", loginForm);
                model.setViewName("redirect:/login");
            }
        }
        
        return model;
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
    
    @ModelAttribute("user")
    public Customer initUser() {
        return new Customer();
    }
    
    @ModelAttribute("isConnected")
    public boolean initIsConnected() {
        return false;
    }

}
