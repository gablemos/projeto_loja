package br.com.gabriel.loja.model;

import br.com.gabriel.loja.Relatorio.NotaFiscal;
import br.com.gabriel.loja.formapagamento.Pagamento;

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


    public NotaFiscal gerarNotaFiscal(){
        return new NotaFiscal();
    }
}
