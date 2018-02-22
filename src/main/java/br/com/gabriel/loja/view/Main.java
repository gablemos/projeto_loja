package br.com.gabriel.loja.view;

import br.com.gabriel.loja.dados.*;
import br.com.gabriel.loja.model.*;
import br.com.gabriel.loja.formapagamento.*;


import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {/*

        mostrarProdutosCarrinhoDeCompras(carrinhoDeCompra);

        while (cliente == null){
            System.out.println("Digite seu email de cadastro válido: ");
            cliente = clientes.getCliente(entrada.nextLine());
        }

        System.out.println("Qual o tipo de pagamento (1)cartão, (2)boleto: ");

        int op = entrada.nextInt();
        TipoPagamento tipoPagamento =  TipoPagamento.values()[op - 1];

        pagamento = tipoPagamento.getTipoPagamento();

        if(pagamento instanceof PagamentoCartaoCredito){
            System.out.println("Informar número do cartão: ");
            ((PagamentoCartaoCredito) pagamento).setNumeroCartaoCredito(entrada.next());

            System.out.println("Informar quantidade de parcelas: ");
            ((PagamentoCartaoCredito) pagamento).setQuantidadeParcelas(entrada.nextInt());
        }

        Pedido pedido = new Pedido(cliente, carrinhoDeCompra, pagamento);

        System.out.println("CUPOM FISCAL");
        System.out.println("-------------------------------------------------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Cliente identificador: " + cliente.getEmail());
        System.out.println("-------------------------------------------------");
        mostrarProdutosCarrinhoDeCompras(carrinhoDeCompra);
        System.out.println("Forma de pagamento: " + tipoPagamento);*/


    }
    private static void mostrarProdutosCarrinhoDeCompras(CarrinhoDeCompra carrinhoDeCompra){
        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println("Produto: " + prod.getDescricao() + " - Qtd: " + carrinhoDeCompra.getProdutosCompra().get(prod));
            System.out.println(String.format("Total: R$%.2f",prod.getValor()*carrinhoDeCompra.getProdutosCompra().get(prod)));
        }
    }

    private static void mostrarProdutosLoja(List<Produto> produtos){
        for (Produto prod : produtos) {
            System.out.println(prod.getDescricao());
        }
    }


}
