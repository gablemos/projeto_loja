package br.com.gabriel.loja.Version2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private final List<Artefact> artefacts;

    public ShoppingCart(){
        this.artefacts = new ArrayList<>();
    }

    public void addProduct(final Product product, final int quantity){
        for (Artefact a : artefacts){
            if (a.equals(product)){
                a.increment(quantity);
                break;
            }
        }
        artefacts.add(new Artefact(product, quantity));
    }

    public double getShoppingValue(){
        return artefacts.stream().mapToDouble(Artefact::getValue).sum();
    }

    public List<Artefact> getArtefacts(){
        return Collections.unmodifiableList(artefacts);
    }
}
