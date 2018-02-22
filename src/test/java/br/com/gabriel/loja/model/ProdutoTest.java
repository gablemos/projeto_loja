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
    public void testeAddPrimeiroProdutoCarrinhoDeCompra() throws IllegalAccessException {
        Produto produto1 = new Produto("Camisa", 100.90);
        Produto produto2 = new Produto("Calça", 300.10);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.addProduto(produto1,1);
        carrinhoDeCompra.addProduto(produto2,1);

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println(carrinhoDeCompra.getProdutosCompra().get(prod));
        }

        double saldoDevedor = 0;

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            saldoDevedor += prod.getValor() * carrinhoDeCompra.getProdutosCompra().get(prod);
        }
        System.out.println("Valor total = R$" + saldoDevedor);
    }

    @Test
    public void testeAddProdutoRepetidoCarrinhoDeCompra() throws IllegalAccessException {
        Produto produto1 = new Produto("Camisa", 100.90);
        Produto produto2 = new Produto("Calça", 300.10);

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.addProduto(produto1,1);
        carrinhoDeCompra.addProduto(produto1,1);
        carrinhoDeCompra.addProduto(produto1,1);

        carrinhoDeCompra.addProduto(produto2,1);
        carrinhoDeCompra.addProduto(produto2,1);

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            System.out.println(carrinhoDeCompra.getProdutosCompra().get(prod));
        }

        double saldoDevedor = 0;

        for (Produto prod : carrinhoDeCompra.getProdutosCompra().keySet()) {
            saldoDevedor += prod.getValor() * carrinhoDeCompra.getProdutosCompra().get(prod);
        }
        System.out.println("Valor total = R$" + saldoDevedor);
    }

    @Test
    public void testeCriarCliente(){
        Cliente cliente = new Cliente("Gabriel", "abc@d.com");
        System.out.println("Cliente " + cliente.getNome() + "\nEmail: " + cliente.getEmail());
    }

}