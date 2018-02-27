package br.com.gabriel.loja.Version2.view.paymentView;

import br.com.gabriel.loja.Version2.model.payment.*;

public class BilletView{

    public PaymentOption getPayment(double shoppingValue){
        return new PaymentBillet(shoppingValue);
    }

}
