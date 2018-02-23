package br.com.gabriel.loja.formapagamento;

import java.util.Random;

public class PagamentoBoleto extends Pagamento{

    private int codigoDeBarra;

    public PagamentoBoleto(final double valorDivida, final PagamentoFactory pagamentoFactory){
        super(valorDivida, pagamentoFactory);
    }

    @Override
    public void efetuarPagamento() {
        this.codigoDeBarra = gerarCodigoDeBarra(valorDivida);
    }

    private int gerarCodigoDeBarra(final double valorCompra){
        long milisigundosAgora = System.currentTimeMillis();
        long semente = (long) (valorCompra + milisigundosAgora);

        Random random = new Random(semente);

        int min = 1000;
        int max = 9999;

        return random.nextInt((max - min) + 1) + min;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }
}