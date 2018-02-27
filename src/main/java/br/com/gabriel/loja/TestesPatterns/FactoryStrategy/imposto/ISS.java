package br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto;

import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.Orcamento;

public class ISS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
