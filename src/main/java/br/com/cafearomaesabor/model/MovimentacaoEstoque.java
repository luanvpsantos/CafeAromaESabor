package br.com.cafearomaesabor.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private Integer quantidade;

    private LocalDateTime dataHora;

    private String responsavel;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    // adaptações para integrar com o serviço que usa setUsuario / setDataMovimentacao
    public void setUsuario(Usuario usuario) {
        if (usuario != null) {
            this.responsavel = usuario.getNome();
        }
    }

    public void setDataMovimentacao(LocalDateTime now) {
        this.dataHora = now;
    }

    // Standard getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}