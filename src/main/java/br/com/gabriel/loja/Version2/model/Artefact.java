package br.com.gabriel.loja.Version2.model;

public class Artefact {
    private final Product product;
    private int quantity;

    public Artefact(final Product product, final int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getValue(){
        return product.getValue() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public String getProductDescription(){
        return product.getDescription();
    }

    public double getProductValue(){
        return product.getValue();
    }

    public void increment(final int quantity){
        this.quantity += quantity;
    }
}
