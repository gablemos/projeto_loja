package br.com.gabriel.loja.model.formapagamento;

import java.util.Random;

public class PagamentoCartaoCredito extends Pagamento {

    public PagamentoCartaoCredito(final double valorCompra){
        super(valorCompra);
    }

    public int getPagamento() {
        Random random = new Random((long) valorCompra);

        int minimo = 2;
        int maximo = 9;

        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    private double getValorParcelas() {
        return valorCompra / getPagamento();
    }
}
