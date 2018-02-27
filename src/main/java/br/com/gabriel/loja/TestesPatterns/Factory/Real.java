package br.com.gabriel.loja.TestesPatterns.Factory;

public class Real implements Moeda {
    @Override
    public String getSimbolo() {
        return "R$";
    }
}
