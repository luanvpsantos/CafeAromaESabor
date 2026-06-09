package br.com.cafearomaesabor.service;

import br.com.cafearomaesabor.model.Usuario;
import br.com.cafearomaesabor.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public List<Usuario> buscarPorNome(String termo) {
        if (termo == null || termo.isBlank()) return listarTodos();
        return repository.findByNomeContainingIgnoreCase(termo);
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void salvar(Usuario usuario) {
        repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}