package br.com.gabriel.loja.formapagamento;

public abstract class Pagamento {
    protected final double valorDivida;
    private final TipoPagamento tipoPagamento;

    protected Pagamento(final double valorDivida, final TipoPagamento tipoPagamento){
        this.valorDivida = valorDivida;
        this.tipoPagamento = tipoPagamento;
    }

    public abstract void efetuarPagamento();

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
