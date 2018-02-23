package br.com.gabriel.loja.formapagamento;

public enum TipoPagamento {
    CARTAO{
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoCartaoCredito(valorDivida, this);
        }

        @Override
        public void executeViewPagamento() {
        }
    },
    BOLETO{
        @Override
        public Pagamento getTipoPagamento(double valorDivida) {
            return new PagamentoBoleto(valorDivida, this);
        }

        @Override
        public void executeViewPagamento() {
        }
    };

    public abstract Pagamento getTipoPagamento(final double valorDivida);

    public abstract void executeViewPagamento();
}

