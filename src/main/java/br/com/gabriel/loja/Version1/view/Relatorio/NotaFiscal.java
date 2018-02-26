package br.com.gabriel.loja.Version1.view.Relatorio;

import br.com.gabriel.loja.Version1.model.formapagamento.*;
import br.com.gabriel.loja.Version1.model.*;

public class NotaFiscal {

    public NotaFiscal(Cliente cliente, Pedido pedido){
        System.out.println("----------------------------------------------");

        System.out.println("--------------- NOTA FISCAL ------------------");
        System.out.println("----------------------------------------------");
        System.out.println("Data: " + pedido.getDataCompra());
        System.out.println("Cliente" + cliente.getNome());
        System.out.println("Email de cadastro: " + cliente.getEmail());
        System.out.println("----------------------------------------------");

        System.out.println("--------------- COMPRA -----------------------");
        for (Produto prod : pedido.produtosComprados().keySet()) {
            System.out.println("Produto: " + prod.getDescricao() + " - Qtd: " + pedido.produtosComprados().get(prod));
            System.out.println(String.format("Total item: R$%.2f",prod.getValor()*pedido.produtosComprados().get(prod)));
        }
        System.out.println(String.format("Total da compra: R$%.2f",pedido.getValorTotalCompra()));
        System.out.println("----------------------------------------------");


        System.out.println("--------------- PAGAMENTO --------------------");

        if (pedido.getPagamento().getTipoPagamentoFactory().equals(TipoPagamentoFactory.BOLETO)){
            imprimirBoleto((PagamentoBoleto) pedido.getPagamento());
        } else {
            imprimirFatura((PagamentoCartaoCredito) pedido.getPagamento());
        }
        System.out.println("----------------------------------------------");
        System.out.println("------------- Volte Sempre -------------------");
        System.out.println("----------------------------------------------");


    }

    private void imprimirFatura(PagamentoCartaoCredito pagamentoCartaoCredito) {
        System.out.println("Forma de pagamento cartão de crédito");
        System.out.println("Saldo dividido em: " + pagamentoCartaoCredito.getQuantidadeParcelas() + " parcelas");
        System.out.println("Cada uma no valor de: R$ " + pagamentoCartaoCredito.getValorParcela());
        System.out.println("Cartão final: ****" + pagamentoCartaoCredito.getNumeroCartaoCredito());
    }

    private void imprimirBoleto(PagamentoBoleto pagamentoBoleto) {
        System.out.println("Forma de pagamento boleto bancário");
        System.out.println("Código de barras |\\|" + pagamentoBoleto.getCodigoDeBarra() + "|/|");
    }
}
