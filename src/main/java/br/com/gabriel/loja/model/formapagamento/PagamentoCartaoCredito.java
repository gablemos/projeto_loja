package br.com.gabriel.loja.model.formapagamento;

public class PagamentoCartaoCredito extends Pagamento{

    private String numeroCartaoCredito;
    private int quantidadeParcelas;
    private double valorParcela;

    public PagamentoCartaoCredito(final double valorDivida, final TipoPagamentoFactory tipoPagamentoFactory){
        super(valorDivida, tipoPagamentoFactory);
    }

    @Override
    public void efetuarPagamento(){
        this.valorParcela = super.valorDivida / this.quantidadeParcelas;
    }

    public void preencherDadosPagamento(final String numeroCartaoCredito, final int quantidadeParcelas){
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }
}