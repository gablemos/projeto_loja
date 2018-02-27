package br.com.gabriel.loja.Version2;

import br.com.gabriel.loja.Version2.data.*;
import br.com.gabriel.loja.Version2.model.*;
import br.com.gabriel.loja.Version2.model.payment.PaymentType;
import br.com.gabriel.loja.Version2.view.paymentView.PaymentViewDecision;
import br.com.gabriel.loja.Version2.view.report.Receipt;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner inputScreen = new Scanner(System.in);

    public static void main(String[] args) {
        Clients clients = new Clients();
        Products products = new Products();
        ShoppingCart shoppingCart = new ShoppingCart();
        Client client;
        PaymentType paymentType;
        Order order;


        System.out.println("Wellcome to FocusMarket: ");

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

        System.out.println("What's your e-mail: ");
        String clientEmail = inputScreen.next();
        client =  clients.getClientByEmail(clientEmail);

        System.out.println("Payment: (1) Credit Card or (2) Billet:");
        paymentType = PaymentType.values()[inputScreen.nextInt() -1];

        order = new Order(shoppingCart,
                PaymentViewDecision.getPayment(paymentType, shoppingCart.getShoppingValue()));

        client.addOrder(order);

        Receipt.reportGenerate(client,order);


    }

    private static void showProducs(List<Product> products){
        System.out.println("Produto\tValor");
        for (Product prod : products) {
            System.out.println(prod.getDescription() + "\t" + prod.getValue());
        }
    }
}
