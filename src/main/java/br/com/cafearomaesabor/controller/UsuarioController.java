package br.com.cafearomaesabor.controller;

import br.com.cafearomaesabor.model.Usuario;
import br.com.cafearomaesabor.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public String listarUsuarios(Model model, @org.springframework.web.bind.annotation.RequestParam(value = "search", required = false) String search) {
        model.addAttribute("usuarios", usuarioService.buscarPorNome(search));
        model.addAttribute("search", search);
        return "usuario/listagem";
    }

    @GetMapping("/usuario/form-inserir")
    public String formInserirUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario/form-inserir";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(Usuario usuario) {
        usuarioService.salvar(usuario);
        return "redirect:/usuario";
    }

    @GetMapping("/usuario/form-alterar")
    public String formAlterarUsuario(@RequestParam("id") Long id, Model model) {
        Usuario u = usuarioService.buscarPorId(id);
        model.addAttribute("usuario", u != null ? u : new Usuario());
        return "usuario/form-alterar";
    }
    
    @GetMapping("/usuario/delete")
    public String deletarUsuario(@org.springframework.web.bind.annotation.RequestParam("id") Long id) {
        usuarioService.deletar(id);
        return "redirect:/usuario";
    }
}