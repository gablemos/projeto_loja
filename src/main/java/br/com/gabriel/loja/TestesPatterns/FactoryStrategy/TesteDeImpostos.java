package br.com.gabriel.loja.TestesPatterns.FactoryStrategy;

import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.TipoImposto;

public class TesteDeImpostos {
    public static void main(String[] args) {
        int opcao = 2;

        TipoImposto tipoImposto = TipoImposto.values()[opcao -1];

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.realizaCalculo(orcamento, ImpostoFactory.criarImposto(tipoImposto));

    }
}
