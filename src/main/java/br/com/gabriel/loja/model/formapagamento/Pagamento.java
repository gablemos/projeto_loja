package br.com.gabriel.loja.model.formapagamento;

public abstract class Pagamento {

    protected final double valorCompra;

    public Pagamento(final double valorCompra){
        this.valorCompra = valorCompra;
    }

    protected abstract int getPagamento();
}
