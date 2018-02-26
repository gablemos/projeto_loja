package br.com.gabriel.loja.Version2.view;

import br.com.gabriel.loja.Version2.model.payment.*;

public class BilletView extends PaymentOptionView{

    @Override
    public PaymentOption getPayment(double shoppingValue){
        return new PaymentBillet(shoppingValue);
    }

}
