package br.com.gabriel.loja.Version1.model;

public class Mercadoria {
    private final Produto produto;
    private final int quantidade;

    public Mercadoria(final Produto produto, final int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
