package br.com.gabriel.loja.view;

import br.com.gabriel.loja.formapagamento.*;

import java.util.Scanner;

public class ConfiguraFormaDePagamentoView {
    static Scanner entrada = new Scanner(System.in);

    public Pagamento configurar(int formaDePagamento, double valorCompra){

        PagamentoFactory pagamentoFactory = PagamentoFactory.values()[formaDePagamento -1];
        Pagamento pagamento = pagamentoFactory.getTipoPagamento(valorCompra);

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
