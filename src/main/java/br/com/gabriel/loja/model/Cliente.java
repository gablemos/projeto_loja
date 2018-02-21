package br.com.gabriel.loja.model;

public class Cliente {

    private final String nome;
    private final String email;

    public Cliente(final String nome, final String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
