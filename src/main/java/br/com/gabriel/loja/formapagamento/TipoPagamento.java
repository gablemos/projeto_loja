package br.com.gabriel.loja.formapagamento;

public enum TipoPagamento {
    CARTAO(1) {
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoCartaoCredito(valorDivida);
        }
    },
    BOLETO(2) {
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoBoleto(valorDivida);
        }
    };

    public int op;

    TipoPagamento(int valor) {
        op = valor;
    }

    public abstract Pagamento getTipoPagamento(final double valorDivida);
}

