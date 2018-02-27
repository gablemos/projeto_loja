package br.com.gabriel.loja.Version2.view.report;

import br.com.gabriel.loja.Version2.model.*;
import br.com.gabriel.loja.Version2.model.payment.*;

public class Receipt {

    public static void reportGenerate(Client client, Order order){
        System.out.println("----------------------------------------------");

        System.out.println("--------------- RECEIPT ----------------------");
        System.out.println("----------------------------------------------");
        System.out.println("Shopping Date: " + order.getShoppingDate());
        System.out.println("Client Name: " + client.getName());
        System.out.println("Client E-mail: " + client.getEmail());
        System.out.println("----------------------------------------------");

        System.out.println("--------------- PRODUCTS -----------------------");
        System.out.println("PRODUCT\t\tVALUE\t\tQUANTITY\t\tTOTAL");
        for (Artefact artefact : order.getArtefacts()) {
            System.out.println(artefact.getProductDescription() + " \t\t " +
                    artefact.getProductValue() + " \t \t \t \t" +
                    artefact.getQuantity() + " \t\t " +
                    artefact.getValue());
        }
        System.out.println(String.format("PURCHASE VALUE : R$%.2f", order.getShoppingValue()));
        System.out.println("----------------------------------------------");


        System.out.println("--------------- PAYMENT --------------------");

        if(order.getPayment().getPaymentType().equals(PaymentType.CREDIT_CARD)){
            printCreditCardBill((PaymentCreditCard) order.getPayment());
        }else if(order.getPayment().getPaymentType().equals(PaymentType.BILLET)){
            printBilletBill((PaymentBillet)order.getPayment());
        }

        System.out.println("----------------------------------------------");
        System.out.println("------------- Thanks for shopping here--------");
        System.out.println("----------------------------------------------");


    }

    //make this a strategy print
    private static void printCreditCardBill(PaymentCreditCard paymentCreditCard) {
        System.out.println("Credit Card Payment Option");
        System.out.println("Debt divided into: " + paymentCreditCard.getTimes() + " times");
        System.out.println(String.format("Each debt value: R$%.2f", paymentCreditCard.getTimesValue()));
        //Not usefull in real world, just beacuse credit card has not been used
        System.out.println("Credit Card Number: ****" + paymentCreditCard.getCreditCardNumber());
    }
    private static void printBilletBill(PaymentBillet paymentBillet) {
        System.out.println("Billet Payment Option");
        System.out.println("Bar code |\\|" + paymentBillet.getBilletCode() + "|/|");
    }
}
