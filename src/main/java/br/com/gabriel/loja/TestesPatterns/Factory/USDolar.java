package br.com.gabriel.loja.TestesPatterns.Factory;

class USDolar implements Moeda{
    @Override
    public String getSimbolo() {
        return "USD";
    }
}
