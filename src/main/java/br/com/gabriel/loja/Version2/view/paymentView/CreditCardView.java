package br.com.gabriel.loja.Version2.view.paymentView;

import br.com.gabriel.loja.Version2.model.payment.*;

import java.util.Scanner;

public class CreditCardView{

    Scanner input = new Scanner(System.in);

    public PaymentOption getPayment(double shoppingValue){
        System.out.println("Numero cartão de crédito:");
        String creditCardNumber = input.next();
        System.out.println("Numero de parcelas:");
        int times = input.nextInt();
        return new PaymentCreditCard(shoppingValue, creditCardNumber, times);
    }
}
