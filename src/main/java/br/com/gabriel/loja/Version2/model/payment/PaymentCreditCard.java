package br.com.gabriel.loja.Version2.model.payment;

public class PaymentCreditCard extends PaymentOption {
    private final String creditCardNumber;
    private final int times;
    private final double timesValue;

    public PaymentCreditCard(final double shopValue, final String creditCardNumber, final int times){
        super(PaymentType.CREDIT_CARD, shopValue);
        this.creditCardNumber = creditCardNumber;
        this.times = times;
        this.timesValue = timesValueCalculate();
    }

    private double timesValueCalculate() {
        return times/getShopValue();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getTimes() {
        return times;
    }

    public double getTimesValue() {
        return timesValue;
    }
}
