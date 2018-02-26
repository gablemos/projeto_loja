package br.com.gabriel.loja.Version2.model.payment;

public abstract class PaymentOption {
    private final PaymentType paymentType;
    private final double shopValue;

    public PaymentOption(final PaymentType paymentType, final double shopValue){
        this.paymentType = paymentType;
        this.shopValue = shopValue;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public double getShopValue() {
        return shopValue;
    }
}
