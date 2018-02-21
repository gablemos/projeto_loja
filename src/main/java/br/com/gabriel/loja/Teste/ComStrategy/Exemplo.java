package br.com.gabriel.loja.Teste.ComStrategy;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a distância: ");
        int distancia = entrada.nextInt();
        System.out.println("Qual o tipo de frete (1)Normal, (2)Sedex: ");
        int opcaoFrete = entrada.nextInt();
        TipoFrete tipoFrete =  TipoFrete.values()[opcaoFrete - 1];

        Frete frete = tipoFrete.obterFrete();

        double preco = frete.calcularPreco(distancia);
        System.out.println(String.format("O valorCompra total é de R$%.2f", preco));
    }
}
