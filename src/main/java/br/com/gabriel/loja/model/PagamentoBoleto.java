package br.com.gabriel.loja.model;

import java.util.Random;

public class PagamentoBoleto {

    private final int boleto;

    public PagamentoBoleto(final double valorCompra){
        this.boleto = GerarBoleto(valorCompra);
    }

    private int GerarBoleto(final double valorCompra) {
        long milisigundosAgora = System.currentTimeMillis();
        long semente = (long) (valorCompra + milisigundosAgora);

        Random random = new Random(semente);

        int minimo = 1000;
        int maximo = 9999;

        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    public int getBoleto() {
        return boleto;
    }
}
