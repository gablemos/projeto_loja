package br.com.gabriel.loja.Teste.SemStrategy;

public class Frete {
    private TipoFrete tipoFrete;

    public Frete(TipoFrete tipoFrete){
        this.tipoFrete = tipoFrete;
    }
    public double calcularPreco(int distancia) {
        double preco = 0;
        if(TipoFrete.NORMAL.equals(tipoFrete)){
            preco = distancia * 1.25 + 10;
        } else if (TipoFrete.SEDEX.equals(tipoFrete)){
            preco = distancia * 1.45 + 12;
        }
        return preco;
    }
}
