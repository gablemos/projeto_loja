package br.com.gabriel.loja.model;

import br.com.gabriel.loja.model.formapagamento.Pagamento;

public class Pedido {
    private final Cliente cliente;
    private final CarrinhoDeCompra carrinhoDeCompra;
    private final Pagamento pagamento;

    public Pedido(final Cliente cliente,
                  final CarrinhoDeCompra carrinhoDeCompra,
                  final Pagamento pagamento){
        this.cliente = cliente;
        this.carrinhoDeCompra = carrinhoDeCompra;
        this.pagamento = pagamento;
    }

    public double calcularValorCompra() {
        double saldoDevedor = 0;

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            saldoDevedor += prod.getValor() * carrinhoDeCompra.getProdutosCompra().get(prod);
        }

        return saldoDevedor;
    }
}
