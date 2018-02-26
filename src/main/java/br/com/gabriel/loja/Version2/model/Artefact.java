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

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increment(final int quantity){
        this.quantity += quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artefact)) return false;

        Artefact artefact = (Artefact) o;

        return getProduct().equals(artefact.getProduct());
    }

    @Override
    public int hashCode() {
        return getProduct().hashCode();
    }
}
