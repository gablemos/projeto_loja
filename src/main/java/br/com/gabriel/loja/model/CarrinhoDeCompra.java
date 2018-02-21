package br.com.gabriel.loja.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarrinhoDeCompra {

    private final Map<Produto, Integer> produtosCompra;

    public CarrinhoDeCompra(){
        this.produtosCompra = new LinkedHashMap<Produto, Integer>();
    }

    private boolean isProdutoNoCarrinho(final Produto produto){
        return produtosCompra.containsKey(produto);
    }

    private int setMaisUmProduto(final Produto produto){
        return 1 + produtosCompra.get(produto) ;
    }

    public Map<Produto, Integer> getProdutosCompra() {
        return Collections.unmodifiableMap(produtosCompra);
    }

    public void addProduto(final Produto produto){
        if(isProdutoNoCarrinho(produto)){
            produtosCompra.put(produto, setMaisUmProduto(produto));
        } else {
            produtosCompra.put(produto, 1);
        }
    }
}
