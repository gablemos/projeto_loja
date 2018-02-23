package br.com.gabriel.loja.model;

import br.com.gabriel.loja.Relatorio.NotaFiscal;
import br.com.gabriel.loja.formapagamento.Pagamento;
import br.com.gabriel.loja.formapagamento.PagamentoCartaoCredito;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
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

    public NotaFiscal gerarNotaFiscal(Cliente cliente){
        return new NotaFiscal(cliente, this, this.pagamento);
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
