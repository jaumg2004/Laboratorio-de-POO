package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cor = "prata";
        String marca = "Fiat";
        String modelo = "UNO";
        double velMax = 220.0;
        double velAtual = 90.0;
        int potencia = 600;
        String tipo = "mille";

        Motor motor = new Motor(potencia, tipo);

        Carro carro = new Carro(cor,marca,modelo,velMax,velAtual,motor);

        System.out.println(carro);

    }
}