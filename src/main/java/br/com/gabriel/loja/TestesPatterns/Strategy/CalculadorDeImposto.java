package br.com.gabriel.loja.TestesPatterns.Strategy;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
        double imposto = impostoQualquer.calcula(orcamento);
        System.out.println(imposto);
    }
}
