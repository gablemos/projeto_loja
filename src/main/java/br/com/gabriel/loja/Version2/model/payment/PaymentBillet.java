package br.com.gabriel.loja.Version2.model.payment;

import java.util.Random;

public class PaymentBillet extends PaymentOption {
    private final int billetCode;

    public PaymentBillet(final double shopValue){
        super(PaymentType.BILLET, shopValue);
        this.billetCode = codeGenerate();
    }

    private int codeGenerate() {
        Random random = new Random((long)getShopValue());

        int min = 1000;
        int max = 9999;

        return random.nextInt((max - min) + 1) + min;
    }

    public int getBilletCode() {
        return billetCode;
    }
}
