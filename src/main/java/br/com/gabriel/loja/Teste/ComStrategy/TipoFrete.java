package br.com.gabriel.loja.Teste.ComStrategy;

public enum TipoFrete {
    NORMAL{
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX{
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();
}
