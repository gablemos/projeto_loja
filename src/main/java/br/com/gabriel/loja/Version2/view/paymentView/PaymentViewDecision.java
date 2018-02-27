package br.com.gabriel.loja.Version2.view.paymentView;

import br.com.gabriel.loja.Version2.model.payment.*;

public class PaymentViewDecision {

    public static PaymentOption getPayment(PaymentType paymentType, double shopValue){
        if(paymentType.equals(PaymentType.CREDIT_CARD)){
            return new CreditCardView().getPayment(shopValue);
        }else if(paymentType.equals(PaymentType.BILLET)){
            return new BilletView().getPayment(shopValue);
        }
        return null;
    }
}
