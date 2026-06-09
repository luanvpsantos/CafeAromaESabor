package br.com.cafearomaesabor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index"; // serve a página inicial disponível em templates/index.html
    }

    @GetMapping("/home")
    public String home() {
        return "principal"; // redireciona para a página principal disponível em templates/principal.html
    }
}