package br.com.gabriel.loja.Version2.view;

import br.com.gabriel.loja.Version2.model.payment.*;

import java.util.Scanner;

public class CreditCardView extends PaymentOptionView{

    @Override
    public PaymentOption getPayment(double shoppingValue){
        Scanner input = new Scanner(System.in);
        System.out.println("Numero cartão de crédito:");
        String creditCardNumber = input.next();
        System.out.println("Numero de parcelas:");
        int times = input.nextInt();
        return new PaymentCreditCard(shoppingValue, creditCardNumber, times);
    }
}
