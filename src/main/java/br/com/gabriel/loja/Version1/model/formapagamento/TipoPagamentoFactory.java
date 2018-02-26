package br.com.gabriel.loja.Version1.model.formapagamento;

public enum TipoPagamentoFactory {
    CARTAO{
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoCartaoCredito(valorDivida, this);
        }
    },
    BOLETO{
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoBoleto(valorDivida, this);
        }
    };

    public abstract Pagamento getTipoPagamento(final double valorDivida);
}

