package br.com.gabriel.loja.Version2.model;

import br.com.gabriel.loja.Version2.model.payment.PaymentOption;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Order {
    private final List<Artefact> artefacts;
    private final PaymentOption payment;
    private final LocalDateTime shoppingDate;

    public Order(final ShoppingCart shoppingCart, final PaymentOption payment){
        this.artefacts = fillArtefacts(shoppingCart);
        this.payment = payment;
        this.shoppingDate = LocalDateTime.now();

    }

    public double getShoppingValue(){
        return artefacts.stream().mapToDouble(Artefact::getValue).sum();
    }

    public List<Artefact> getArtefacts(){
        return Collections.unmodifiableList(artefacts);
    }

    private List<Artefact> fillArtefacts(ShoppingCart shoppingCart) {
        return shoppingCart.getArtefacts();
    }


}
