package br.com.gabriel.loja.Version1.model;

public class Produto {

    private final String descricao;
    private final double valor;

    public Produto (final String descricao,  final double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
