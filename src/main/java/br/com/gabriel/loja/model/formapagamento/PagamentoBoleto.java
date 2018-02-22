package br.com.gabriel.loja.model.formapagamento;

import java.util.Random;

public class PagamentoBoleto implements Pagamento {

    private final int codigoDeBarra;

    public PagamentoBoleto(final double valorCompra){
        this.codigoDeBarra = gerarCodigoDeBarra(valorCompra);
    }

    private int gerarCodigoDeBarra(final double valorCompra){
        long milisigundosAgora = System.currentTimeMillis();
        long semente = (long) (valorCompra + milisigundosAgora);

        Random random = new Random(semente);

        int min = 1000;
        int max = 9999;

        return random.nextInt((max - min) + 1) + min;
    }

    @Override
    public double getPagamento(double valorCompra) {
        long milisigundosAgora = System.currentTimeMillis();
        long semente = (long) (valorCompra + milisigundosAgora);

        Random random = new Random(semente);

        int min = 1000;
        int max = 9999;

        return min + (max - min) * random.nextDouble();
    }
}