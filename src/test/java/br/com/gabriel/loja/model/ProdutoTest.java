package br.com.gabriel.loja.model;

import junit.framework.TestCase;
import org.junit.Test;

public class ProdutoTest extends TestCase {

    @Test
    public void testeCriarProduto(){
        Produto produto = new Produto("Camisa", 100.90);

        System.out.println("Descrição: " + produto.getDescricao() + "\nValor: R$ " + produto.getValor());
    }

    @Test
    public void testeAddPrimeiroProdutoCarrinhoDeCompra(){
        Produto produto1 = new Produto("Camisa", 100.90);
        Produto produto2 = new Produto("Calça", 300.10);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.addProduto(produto1);
        carrinhoDeCompra.addProduto(produto2);

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println(carrinhoDeCompra.getProdutosCompra().get(prod));
        }
    }

    @Test
    public void testeAddProdutoRepetidoCarrinhoDeCompra(){
        Produto produto1 = new Produto("Camisa", 100.90);
        Produto produto2 = new Produto("Calça", 300.10);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.addProduto(produto1);
        carrinhoDeCompra.addProduto(produto1);
        carrinhoDeCompra.addProduto(produto1);

        carrinhoDeCompra.addProduto(produto2);
        carrinhoDeCompra.addProduto(produto2);

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println(carrinhoDeCompra.getProdutosCompra().get(prod));
        }
    }

    @Test
    public void testeCriarCliente(){
        Cliente cliente = new Cliente("Gabriel", "abc@d.com");
        System.out.println("Cliente " + cliente.getNome() + "\nEmail: " + cliente.getEmail());
    }

    @Test
    public void testeGerarPagamentoBoleto(){
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(399.80);
        System.out.println(pagamentoBoleto.getBoleto());
    }

    @Test
    public void testeGerarPagamentoCartaoCredito(){
        String numCartao = "124457";
        double valorCompra = 399.80;
        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito(numCartao, valorCompra);
        System.out.println("Compra feita pelo cartão: " + numCartao + "\nValor da compra: R$ " + valorCompra
                + "\nNumero de parcelas: " + pagamentoCartaoCredito.getNumeroParcelas()
                + "\nValor das parcelas: R$ " + pagamentoCartaoCredito.getValorParcelas());
    }

}