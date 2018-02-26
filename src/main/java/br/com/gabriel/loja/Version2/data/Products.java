package br.com.gabriel.loja.Version2.data;

import br.com.gabriel.loja.Version2.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Products {
    private final List<Product> producstsAvaliable;

    public Products() {
        this.producstsAvaliable = new ArrayList<>();
        producstsAvaliable.add(new Product("Calça", 150.10));
        producstsAvaliable.add(new Product("Camisa", 250.20));
        producstsAvaliable.add(new Product("Tênis", 350.30));
        producstsAvaliable.add(new Product("Meia", 450.40));
    }

    public List<Product> getProducstsAvaliable() {
        return Collections.unmodifiableList(producstsAvaliable);
    }

    public Product getProductByDescription(String description){
        for (Product product : producstsAvaliable){
            if (product.getDescription().equals(description)){
                return product;
            }
        }
        return null;
    }
}
