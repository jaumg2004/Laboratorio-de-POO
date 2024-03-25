package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        int cliente = 0;
        int menu = 0;
        String nome;
        String M = "";

        while (!M.equalsIgnoreCase("N")) {
            System.out.println("Digite o nome do cliente: ");
            nome = scanner.nextLine();

            System.out.println("Digite o CPF do cliente: ");
            long cpf = scanner.nextLong();
            scanner.nextLine();

            conta.cliente.setNome(nome);
            conta.cliente.setCpf(cpf);

            System.out.println("Adicionar mais cliente? (S/N)");
            M = scanner.nextLine();
            if (M.equalsIgnoreCase("S")) {
                cliente++;
                conta.setQtdClientes(cliente);
            }
        }

        while (menu != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver extrato");
            System.out.println("4. Sair");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.extrato();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
