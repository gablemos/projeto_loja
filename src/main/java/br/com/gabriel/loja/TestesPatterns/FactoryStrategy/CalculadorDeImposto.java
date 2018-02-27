package br.com.gabriel.loja.TestesPatterns.FactoryStrategy;

import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.Imposto;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
        double imposto = impostoQualquer.calcula(orcamento);
        System.out.println(imposto);
    }
}
