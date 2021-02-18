package fr.dawan.discountomatic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/hello")
    public String testView() {
        return "helloworld";
    }
}
