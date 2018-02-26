package br.com.gabriel.loja.Version2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    private final String name;
    private final String email;
    private final List<Order> orders;

    public Client(final String name, final String email){
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void addOrder(final Order order){
        this.orders.add(order);
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
