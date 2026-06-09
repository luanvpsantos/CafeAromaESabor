package br.com.cafearomaesabor.controller;

import br.com.cafearomaesabor.model.Produto;
import br.com.cafearomaesabor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto")
    public String listarProdutos(Model model, @org.springframework.web.bind.annotation.RequestParam(value = "search", required = false) String search) {
        model.addAttribute("produtos", produtoService.buscarPorNome(search));
        model.addAttribute("search", search);
        return "produto/listagem";
    }

    @GetMapping("/produto/form-inserir")
    public String formInserirProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto/form-inserir";
    }

    @PostMapping("/produto")
    public String salvarProduto(Produto produto) {
        produtoService.salvar(produto);
        return "redirect:/produto";
    }

    @GetMapping("/produto/delete")
    public String deletarProduto(@org.springframework.web.bind.annotation.RequestParam("id") Long id) {
        produtoService.deletar(id);
        return "redirect:/produto";
    }

    @GetMapping("/produto/form-alterar")
    public String formAlterarProduto(@RequestParam("id") Long id, Model model) {
        Produto p = produtoService.buscarPorId(id);
        model.addAttribute("produto", p != null ? p : new Produto());
        return "produto/form-alterar";
    }
}