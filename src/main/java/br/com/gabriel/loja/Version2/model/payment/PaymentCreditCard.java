package br.com.gabriel.loja.Version2.model.payment;

public class PaymentCreditCard extends PaymentOption {
    private final String creditCardNumber;
    private final int times;

    public PaymentCreditCard(final double shopValue, final String creditCardNumber, final int times){
        super(PaymentType.CREDIT_CARD, shopValue);
        this.creditCardNumber = creditCardNumber;
        this.times = times;
    }

    public double getTimesValue() {
        return times/super.getShopValue();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getTimes() {
        return times;
    }
}
