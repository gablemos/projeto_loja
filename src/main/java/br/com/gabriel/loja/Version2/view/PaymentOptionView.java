package br.com.gabriel.loja.Version2.view;

import br.com.gabriel.loja.Version2.model.payment.PaymentOption;

public abstract class PaymentOptionView {

    public abstract PaymentOption getPayment(double shoppingValue);
}
