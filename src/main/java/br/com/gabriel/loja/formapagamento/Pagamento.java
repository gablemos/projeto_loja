package br.com.gabriel.loja.formapagamento;

public abstract class Pagamento {
    protected final double valorDivida;

    protected Pagamento(final double valorDivida){
        this.valorDivida = valorDivida;
        efetuarPagamento();
    }

    protected abstract void efetuarPagamento();

}
