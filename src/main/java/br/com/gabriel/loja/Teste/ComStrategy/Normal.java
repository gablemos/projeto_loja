package br.com.gabriel.loja.Teste.ComStrategy;

public class Normal implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.25 + 10;
    }
}
