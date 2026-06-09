package br.com.cafearomaesabor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstoqueController {

    @GetMapping("/estoque")
    public String movimentacaoEstoque() {
        // usa o template disponível gestao_estoque.html
        return "gestao_estoque";
    }
}