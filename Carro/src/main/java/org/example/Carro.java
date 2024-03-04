package org.example;

public class Carro {

    public String cor;
    public String marca;
    public String modelo;
    public double velMax;
    public double velAtual;
    public int potencia;
    public String tipo;

    public Motor motor = new Motor(potencia, tipo);

    public Carro(String cor, String marca, String modelo, double velMax, double velAtual, Motor motor) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
        this.velAtual = velAtual;
        this.motor = motor;
    }

    public void ligar(){
        System.out.println("ligar o carro");
    }

    public void acelerar(){
        System.out.println("acelerar o carro");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velMax=" + velMax +
                ", velAtual=" + velAtual +
                ", motor=" + motor +
                '}';
    }
}
