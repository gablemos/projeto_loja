package br.com.gabriel.loja.Relatorio;

import br.com.gabriel.loja.formapagamento.Pagamento;
import br.com.gabriel.loja.formapagamento.PagamentoBoleto;
import br.com.gabriel.loja.formapagamento.PagamentoCartaoCredito;
import br.com.gabriel.loja.formapagamento.TipoPagamento;
import br.com.gabriel.loja.model.CarrinhoDeCompra;
import br.com.gabriel.loja.model.Cliente;
import br.com.gabriel.loja.model.Produto;

import java.time.Instant;
import java.util.Date;

public class NotaFiscal {

    public NotaFiscal(Cliente cliente, CarrinhoDeCompra carrinhoDeCompra, Pagamento pagamento){
        System.out.println("----------------------------------------------");
        System.out.println("--------------- NOTA FISCAL ------------------");
        System.out.println("----------------------------------------------");
        System.out.println("Data: " + Date.from(Instant.now()));
        System.out.println("Cliente" + cliente.getNome());
        System.out.println("Email de cadastro: " + cliente.getEmail());
        System.out.println("----------------------------------------------");
        System.out.println("--------------- COMPRA -----------------------");
        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println("Produto: " + prod.getDescricao() + " - Qtd: " + carrinhoDeCompra.getProdutosCompra().get(prod));
            System.out.println(String.format("Total item: R$%.2f",prod.getValor()*carrinhoDeCompra.getProdutosCompra().get(prod)));
        }
        System.out.println(String.format("Total da compra: R$%.2f",carrinhoDeCompra.getValorTotalCarrinho()));
        System.out.println("----------------------------------------------");
        System.out.println("--------------- PAGAMENTO --------------------");
        if (pagamento instanceof PagamentoBoleto){
            imprimirBoleto((PagamentoBoleto) pagamento);
        } else {

        }
    }

    private void imprimirFatura(PagamentoCartaoCredito pagamentoCartaoCredito) {
        System.out.println("Forma de pagamento cartão de crédito");
        System.out.println("Saldo dividido em: " + pagamentoCartaoCredito.getQuantidadeParcelas() + " parcelas");
        System.out.println("Cada uma no valor de: R$ " + pagamentoCartaoCredito.getValorParcela());
        System.out.println("Cartão final: ****" + pagamentoCartaoCredito.getNumeroCartaoCredito());
    }

    private void imprimirBoleto(PagamentoBoleto pagamentoBoleto) {
        System.out.println("Forma de pagamento boleto bancário");
        System.out.println("Código de barras" + pagamentoBoleto.getCodigoDeBarra());
    }
}
