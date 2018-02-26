package br.com.gabriel.loja.Version2.view;

import br.com.gabriel.loja.Version2.data.*;
import br.com.gabriel.loja.Version2.model.*;
import br.com.gabriel.loja.Version2.model.payment.*;

import java.util.*;

public class ComponentsView {
    private static Scanner inputScreen = new Scanner(System.in);
    private Clients clients;
    private Products products;
    private ShoppingCart shoppingCart;
    private Map<Integer, PaymentType> paymentViews;

    public ComponentsView(){
        this.clients  = new Clients();
        this.products  = new Products();
        this.shoppingCart  = new ShoppingCart();
        this.paymentViews = new LinkedHashMap<>();
        paymentViews.put(1, PaymentType.CREDIT_CARD);
        paymentViews.put(2, PaymentType.BILLET);

    }

    private void showProducs(List<Product> products){
        System.out.println("Produto\tValor");
        for (Product prod : products) {
            System.out.println(prod.getDescription() + "\t" + prod.getValue());
        }
    }

    private void wellcome(){
        System.out.println("Wellcome to FocusMarket: ");
    }

    private void buy(){
        System.out.println("Start shopping? Y/N");
        String op = inputScreen.next();

        while(op.equals("Y")){
            showProducs(products.getProducstsAvaliable());

            System.out.println("Product's name: ");
            String productName = inputScreen.next();
            System.out.println("Product's quantity: ");
            int productQuantity = inputScreen.nextInt();

            shoppingCart.addProduct(products.getProductByDescription(productName), productQuantity);

            System.out.println("Keep shopping? Y/N");
            op = inputScreen.next();
        }
    }

    public Client getClient(){
        System.out.println("What's your e-mail: ");
        String clientEmail = inputScreen.next();
        return clients.getClientByEmail(clientEmail);
    }

    /*public PaymentOptionView paymentStrategy(){
        System.out.println("Payment: (1) Credit Card or (2) Billet:");
        int payment = inputScreen.nextInt();
    }*/


}
