package br.com.gabriel.loja.Version2.model;

public class Product {
    private final String description;
    private final double value;

    public Product(final String description, final double value){
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }
}
