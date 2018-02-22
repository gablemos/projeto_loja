package br.com.gabriel.loja.model;

import br.com.gabriel.loja.formapagamento.Pagamento;

public class Pedido {
    private final Cliente cliente;
    private final CarrinhoDeCompra carrinhoDeCompra;
    private final Pagamento pagamento;
    private final double valorCompra;

    public Pedido(final Cliente cliente,
                  final CarrinhoDeCompra carrinhoDeCompra,
                  final Pagamento pagamento,
                  final double valorCompra){
        this.cliente = cliente;
        this.carrinhoDeCompra = carrinhoDeCompra;
        this.pagamento = pagamento;
        this.valorCompra = valorCompra;
    }
}
