package br.com.gabriel.loja.model.formapagamento;

import java.util.Random;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(final double valorCompra){
        super(valorCompra);
    }

    public int getPagamento() {
        long milisigundosAgora = System.currentTimeMillis();
        long semente = (long) (valorCompra + milisigundosAgora);

        Random random = new Random(semente);

        int minimo = 1000;
        int maximo = 9999;

        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
