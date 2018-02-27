package br.com.gabriel.loja.TestesPatterns.FactoryStrategy;

import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.ICMS;
import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.ISS;
import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.Imposto;
import br.com.gabriel.loja.TestesPatterns.FactoryStrategy.imposto.TipoImposto;

public class ImpostoFactory {
    public static Imposto criarImposto(TipoImposto tipoImposto){
        if(tipoImposto.equals(TipoImposto.ICMS)){
            return new ICMS();
        }else if(tipoImposto.equals(TipoImposto.ISS)){
            return new ISS();
        }
        throw new IllegalArgumentException("Nao existe esse imposto");
    }
}
