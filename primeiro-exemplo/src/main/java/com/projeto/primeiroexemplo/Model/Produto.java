package com.projeto.primeiroexemplo.Model;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Produto {
    
    //#region Atributos
    //atributos para modelos
    private Integer id; // numero de id retornado pelo BD

    private String nome; // nome do produto

    private Integer quantidade; // quantidade do produto

    private double valor; // valor do produto

    private String observacao; // observação ou descrição do produto
    //#endregion

    //#region Get in Setters
    // Get in Setters de todos os ATRIBUTOS definidos acima
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //#endregion
}
