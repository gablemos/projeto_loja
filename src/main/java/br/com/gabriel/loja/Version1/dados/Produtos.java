package br.com.gabriel.loja.Version1.dados;

import br.com.gabriel.loja.Version1.model.Produto;

import java.util.*;

public class Produtos {
    private final List<Produto> produtosDisponiveis;

    public Produtos() {
        this.produtosDisponiveis = new ArrayList<>();
        produtosDisponiveis.add(new Produto("Calça", 150.10));
        produtosDisponiveis.add(new Produto("Camisa", 250.20));
        produtosDisponiveis.add(new Produto("Tênis", 350.30));
        produtosDisponiveis.add(new Produto("Meia", 450.40));
    }

    public List<Produto> getProdutosDisponiveis() {
        return Collections.unmodifiableList(produtosDisponiveis);
    }

    public Produto getProduto(String descricao){
        for (Produto produto : produtosDisponiveis){
            if (produto.getDescricao().equals(descricao)){
                return produto;
            }
        }
        return null;
    }
}
