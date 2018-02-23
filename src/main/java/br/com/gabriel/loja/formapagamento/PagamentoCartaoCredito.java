package br.com.gabriel.loja.formapagamento;

public class PagamentoCartaoCredito extends Pagamento{

    private String numeroCartaoCredito;
    private int quantidadeParcelas;
    private double valorParcela;

    public PagamentoCartaoCredito(final double valorDivida){
        super(valorDivida);
    }

    @Override
    protected void efetuarPagamento(){
        this.valorParcela = super.valorDivida / this.quantidadeParcelas;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }
}