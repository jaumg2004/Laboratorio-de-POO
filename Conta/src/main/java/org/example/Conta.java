package org.example;

public class Conta {

    private static int qtdClientes = 0;
    private double saldo = 0;
    Cliente cliente = new Cliente();

    public static int getQtdClientes() {
        return qtdClientes;
    }

    public static void setQtdClientes(int qtdClientes) {
        Conta.qtdClientes = qtdClientes;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void extrato(){
        System.out.println("Saldo atual: " + saldo);
    }

}
