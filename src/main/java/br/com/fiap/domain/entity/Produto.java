package br.com.fiap.domain.entity;

import java.math.BigDecimal;

public class Produto {

    private Long id;

    private String name;

    private String descricao;

    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Produto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Produto setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Produto() {
    }

    public Produto(Long id, String name, String descricao, BigDecimal valor) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
