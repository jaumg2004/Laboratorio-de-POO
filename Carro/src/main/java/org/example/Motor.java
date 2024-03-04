package org.example;

public class Motor {

    public int potencia;
    public String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
