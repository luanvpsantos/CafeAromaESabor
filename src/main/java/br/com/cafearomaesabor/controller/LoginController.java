package br.com.cafearomaesabor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        // mostra a página de login (template 'login.html')
        return "login";
    }
}