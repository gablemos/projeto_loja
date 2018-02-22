package br.com.gabriel.loja.model.formapagamento;

public class PagamentoCartaoCredito implements Pagamento {

    private final String numeroCartaoCredito;
    private final int quantidadeParcelas;

    public PagamentoCartaoCredito(final String numeroCartaoCredito, final int quantidadeParcelas){
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getValorParcela(double valorCompra) {
        return valorCompra / quantidadeParcelas;
    }

    @Override
    public double getPagamento(double valorCompra) {
        return valorCompra / quantidadeParcelas;
    }
}