package br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto;

import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.Orcamento;

public interface Imposto {
    double calcula(Orcamento orcamento);
}
