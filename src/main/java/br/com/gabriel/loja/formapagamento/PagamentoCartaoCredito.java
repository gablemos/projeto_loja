package br.com.gabriel.loja.formapagamento;

public class PagamentoCartaoCredito{

    private final String numeroCartaoCredito;
    private final int quantidadeParcelas;

    public PagamentoCartaoCredito(final String numeroCartaoCredito, final int quantidadeParcelas){
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getValorParcela(double valorCompra) {
        return valorCompra / quantidadeParcelas;
    }
}