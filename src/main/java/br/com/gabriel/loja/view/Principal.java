package br.com.gabriel.loja.view;

import br.com.gabriel.loja.dados.*;
import br.com.gabriel.loja.model.*;
import br.com.gabriel.loja.formapagamento.*;

import java.util.*;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cliente;
        Pedido pedido;
        Clientes clientes = new Clientes();
        Produtos produtos = new Produtos();
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        String opcao;
        String emailCliente;
        String nomeProduto;
        int quantidadeProduto;
        int formaDePagamento;

        System.out.println("Bem vindo a FocusMarket: ");

        System.out.println("Deseja continuar comprando? S/N");
        opcao = entrada.next();

        while(opcao.equals("S")){
            mostrarProdutosLoja(produtos.getProdutosDisponiveis());

            System.out.println("Entre com o nome do produto: ");
            nomeProduto = entrada.next();
            System.out.println("Entre com a quantidade do produto: ");
            quantidadeProduto = entrada.nextInt();

            carrinhoDeCompra.addProduto(produtos.getProduto(nomeProduto), quantidadeProduto);

            System.out.println("Deseja continuar comprando? S/N");
            opcao = entrada.next();
        }

        System.out.println("Digite seu email de cadastro válido: ");
        emailCliente = entrada.next();
        cliente = clientes.getCliente(emailCliente);

        System.out.println("Qual o tipo de pagamento (1)Cartão, (2)Boleto: ");
        formaDePagamento = entrada.nextInt();
        FormaDePagamentoView formaDePagamentoView = new FormaDePagamentoView();

        pedido = new Pedido(carrinhoDeCompra,
                formaDePagamentoView.setPagamento(formaDePagamento, carrinhoDeCompra.getValorTotalCarrinho()));

        cliente.addPedidos(pedido);
        System.out.println("Compra finalizada");
        pedido.finalizarPagamento();
        pedido.gerarNotaFiscal(cliente);


    }

    private static void mostrarProdutosLoja(List<Produto> produtos){
        for (Produto prod : produtos) {
            System.out.println(prod.getDescricao());
        }
    }
}
