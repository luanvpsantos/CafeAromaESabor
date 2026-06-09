package br.com.cafearomaesabor.service;

import br.com.cafearomaesabor.model.MovimentacaoEstoque;
import br.com.cafearomaesabor.model.Produto;
import br.com.cafearomaesabor.model.Usuario;
import br.com.cafearomaesabor.repository.MovimentacaoEstoqueRepository;
import br.com.cafearomaesabor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovimentacaoEstoqueService {

    @Autowired
    private MovimentacaoEstoqueRepository repo;

    @Autowired
    private ProdutoRepository produtoRepository;

    public MovimentacaoEstoqueRepository getRepo() {
        return repo;
    }

    public void setRepo(MovimentacaoEstoqueRepository repo) {
        this.repo = repo;
    }

    public ProdutoRepository getProdutoRepository() {
        return produtoRepository;
    }

    public void setProdutoRepository(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void entrada(Long produtoId, Integer qtd, Usuario usuario) {

        Produto p = produtoRepository.findById(produtoId).orElseThrow();

        p.setQuantidade(p.getQuantidade() + qtd);

        MovimentacaoEstoque mov = new MovimentacaoEstoque();
        mov.setProduto(p);
        mov.setQuantidade(qtd);
        mov.setTipo("ENTRADA");
        // popular diretamente os campos gerados pelo Lombok
        mov.setResponsavel(usuario != null ? usuario.getNome() : null);
        mov.setDataHora(LocalDateTime.now());

        repo.save(mov);
        produtoRepository.save(p);
    }

    public void saida(Long produtoId, Integer qtd, Usuario usuario) {

        Produto p = produtoRepository.findById(produtoId).orElseThrow();

        p.setQuantidade(p.getQuantidade() - qtd);

        MovimentacaoEstoque mov = new MovimentacaoEstoque();
        mov.setProduto(p);
        mov.setQuantidade(qtd);
        mov.setTipo("SAIDA");
        mov.setResponsavel(usuario != null ? usuario.getNome() : null);
        mov.setDataHora(LocalDateTime.now());

        repo.save(mov);
        produtoRepository.save(p);
    }

    public List<MovimentacaoEstoque> listar() {
        return repo.findAll();
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}