package br.com.gabriel.loja.view;

import br.com.gabriel.loja.formapagamento.*;

import java.util.Scanner;

public class FormaDePagamentoView {
    static Scanner entrada = new Scanner(System.in);

    public Pagamento setPagamento(int formaDePagamento, double valorCompra){

        TipoPagamento tipoPagamento = TipoPagamento.values()[formaDePagamento -1];
        Pagamento pagamento = tipoPagamento.getTipoPagamento(valorCompra);

        if (pagamento instanceof PagamentoCartaoCredito){
            System.out.println("Digite o numero do cartao de crédito");
            String numeroCartaoCredito = entrada.next();
            System.out.println("Digite o numero de parcelas: ");
            int quantidadeParcelas = entrada.nextInt();

            ((PagamentoCartaoCredito) pagamento).preencherDadosPagamento(numeroCartaoCredito, quantidadeParcelas);
        }
        return pagamento;
    }
}
