package br.com.gabriel.loja.model;

import java.util.*;

public class Cliente {

    private final String nome;
    private final String email;
    private final List<Pedido> pedidos;

    public Cliente(final String nome, final String email){
        this.nome = nome;
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public void addPedidos(final Pedido pedido){
        this.pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
