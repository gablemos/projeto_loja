package br.com.gabriel.loja.model;

public class PagamentoCartaoCredito {

    private final String numeroCartao;
    private final int numeroParcelas;
    private final double valorParcelas;

    public PagamentoCartaoCredito(final String numeroCartao, final double valorCompra){
        this.numeroCartao = numeroCartao;
        this.numeroParcelas = CalculaNumeroParcelas(numeroCartao);
        this.valorParcelas = CalculaValorParcelas(numeroParcelas, valorCompra);
    }

    private int CalculaNumeroParcelas(final String numeroCartao) {
        String ultimoDigitoCartao = String.valueOf(numeroCartao.charAt(numeroCartao.length() - 1));
        return Integer.parseInt(ultimoDigitoCartao);
    }

    private double CalculaValorParcelas(final int numeroParcelas, final double valorCompra) {
        return valorCompra/numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double getValorParcelas() {
        return valorParcelas;
    }
}
