package br.com.cafearomaesabor.service;

import br.com.cafearomaesabor.model.Produto;
import br.com.cafearomaesabor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public List<Produto> buscarPorNome(String termo) {
        if (termo == null || termo.isBlank()) return listarTodos();
        return produtoRepository.findByNomeContainingIgnoreCase(termo);
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public void salvar(Produto produto) {
        produtoRepository.save(produto);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

    public List<Produto> produtosAbaixoEstoque() {
        return produtoRepository.findAll()
                .stream()
                .filter(p -> p.getQuantidade() < p.getEstoqueMinimo())
                .toList();
    }
}