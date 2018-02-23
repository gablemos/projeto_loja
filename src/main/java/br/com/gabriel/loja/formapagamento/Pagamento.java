package br.com.gabriel.loja.formapagamento;

public abstract class Pagamento {
    protected final double valorDivida;
    private final PagamentoFactory pagamentoFactory;

    protected Pagamento(final double valorDivida, final PagamentoFactory pagamentoFactory){
        this.valorDivida = valorDivida;
        this.pagamentoFactory = pagamentoFactory;
    }

    public abstract void efetuarPagamento();

    public PagamentoFactory getPagamentoFactory() {
        return pagamentoFactory;
    }
}
