package br.com.gabriel.loja.Version1.model;

import br.com.gabriel.loja.Version1.model.formapagamento.Pagamento;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;

public class Pedido {
    private final Map<Produto, Integer> produtosComprados;
    private final Pagamento pagamento;
    private final LocalDateTime dataCompra;

    public Pedido(final CarrinhoDeCompra carrinhoDeCompra,
                  final Pagamento pagamento){
        this.produtosComprados = carrinhoDeCompra.getProdutosCompra();
        this.pagamento = pagamento;
        this.dataCompra = LocalDateTime.now();
    }

    public void finalizarPagamento(){
        this.pagamento.efetuarPagamento();
    }

    public Map<Produto, Integer> produtosComprados() {
        return Collections.unmodifiableMap(produtosComprados);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public double getValorTotalCompra(){
        double saldoDevedor = 0;

        for (Produto prod : produtosComprados.keySet()) {
            saldoDevedor += prod.getValor() * produtosComprados.get(prod);
        }

        return saldoDevedor;
    }
}
