package br.com.gabriel.loja.Version2.model.payment;

import br.com.gabriel.loja.Version2.model.CodeGenerator.FourDigitCode;

public class PaymentBillet extends PaymentOption {
    private final int billetCode;

    public PaymentBillet(final double shopValue){
        super(PaymentType.BILLET, shopValue);
        //if there is more than 1 type of code, use a stretegy
        FourDigitCode fourDigitCode = new FourDigitCode();
        this.billetCode = fourDigitCode.codeGenerate();
    }

    public int getBilletCode() {
        return billetCode;
    }
}
