package br.com.gabriel.loja.Version1.model;

import java.util.*;

public class CarrinhoDeCompra {

    private final Map<Produto, Integer> produtosCompra;
    private final List<Mercadoria> mercadorias;

    public CarrinhoDeCompra(){
        this.produtosCompra = new LinkedHashMap<>();
        this.mercadorias = new ArrayList<>();
    }

    public Map<Produto, Integer> getProdutosCompra() {
        return Collections.unmodifiableMap(produtosCompra);
    }

    public void addProduto(final Produto produto, final int quantidade){
        if (produtosCompra.containsKey(produto)){
            int novaQuantidade = produtosCompra.get(produto) + quantidade;
            produtosCompra.put(produto, novaQuantidade);
        } else {
            produtosCompra.put(produto, quantidade);
        }
    }

    public double getValorTotalCarrinho(){
        double saldoDevedor = 0;

        for (Produto prod : produtosCompra.keySet()) {
            saldoDevedor += prod.getValor() * produtosCompra.get(prod);
        }

        return saldoDevedor;
    }
}
