package br.com.gabriel.loja.Version2.model.CodeGenerator;

import java.util.Random;

public class FourDigitCode {

    public int codeGenerate() {
        Random random = new Random();

        int min = 1000;
        int max = 9999;

        return random.nextInt((max - min) + 1) + min;
    }
}
