package br.com.gabriel.loja.Version1.model.formapagamento;

public abstract class Pagamento {
    protected final double valorDivida;
    private final TipoPagamentoFactory tipoPagamentoFactory;

    protected Pagamento(final double valorDivida, final TipoPagamentoFactory tipoPagamentoFactory){
        this.valorDivida = valorDivida;
        this.tipoPagamentoFactory = tipoPagamentoFactory;
    }

    public abstract void efetuarPagamento();

    public TipoPagamentoFactory getTipoPagamentoFactory() {
        return tipoPagamentoFactory;
    }
}
