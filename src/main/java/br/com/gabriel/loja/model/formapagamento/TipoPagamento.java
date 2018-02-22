package br.com.gabriel.loja.model.formapagamento;

public enum TipoPagamento {
    CARTAO(1) {
        public Pagamento getTipoPagamento() {
            return new PagamentoCartaoCredito();
        }
    },
    BOLETO(2) {
        public Pagamento getTipoPagamento() {
            return new PagamentoBoleto();
        }
    };

    public int op;

    TipoPagamento(int valor) {
        op = valor;
    }
    public abstract Pagamento getTipoPagamento();
}

