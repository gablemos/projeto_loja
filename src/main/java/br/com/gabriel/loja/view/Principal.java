package br.com.gabriel.loja.view;

import br.com.gabriel.loja.dados.*;
import br.com.gabriel.loja.model.*;
import br.com.gabriel.loja.formapagamento.*;

import java.util.*;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        Produtos produtos = new Produtos();
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        String opcao;
        String emailCliente;
        String nomeProduto;
        int quantidadeProduto;

        System.out.println("Bem vindo a FocusMarket: ");

        System.out.println("Deseja continuar comprando? S/N");
        opcao = entrada.next();
        while(opcao.equals("S")){
            mostrarProdutosLoja(produtos.getProdutosDisponiveis());

            System.out.println("Entre com o nome do produto: ");
            nomeProduto = entrada.next();
            System.out.println("Entre com a quantidade do produto: ");
            quantidadeProduto = entrada.nextInt();

            try {
                carrinhoDeCompra.addProduto(produtos.getProduto(nomeProduto), quantidadeProduto);
                System.out.println("Adicionado ao Carrinho com sucesso");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Deseja continuar comprando? S/N");
            opcao = entrada.next();
        }

        mostrarProdutosCarrinhoDeCompras(carrinhoDeCompra);


        System.out.println("Digite seu email de cadastro válido: ");
        emailCliente = entrada.next();
        while (clientes.getCliente(emailCliente) == null){
            System.out.println("Digite seu email de cadastro válido: ");
            emailCliente = entrada.next();
        }

        System.out.println("Qual o tipo de pagamento (1)Cartão, (2)Boleto: ");


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
