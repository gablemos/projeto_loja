package br.com.gabriel.loja.Version1.view;

import br.com.gabriel.loja.Version1.model.formapagamento.*;

import java.util.Scanner;

public class ConfiguraFormaDePagamentoView {
    static Scanner entrada = new Scanner(System.in);

    public Pagamento configurar(int formaDePagamento, double valorCompra){

        TipoPagamentoFactory tipoPagamentoFactory = TipoPagamentoFactory.values()[formaDePagamento -1];
        Pagamento pagamento = tipoPagamentoFactory.getTipoPagamento(valorCompra);

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
