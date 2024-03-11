package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa empresa;
        Contato[] contatos = new Contato[5]; // Renamed from contato to contatos
        Scanner scanner = new Scanner(System.in);

        String nome;
        String email;
        String telefone;
        String dataNascimento;
        String CNPJ;
        String endereco;

        System.out.println("Digite o CNPJ da empresa:");
        CNPJ = scanner.nextLine();
        System.out.println("Digite o endereco da empresa:");
        endereco = scanner.nextLine();

        empresa = new Empresa(CNPJ, endereco);

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome de um dos contatos:");
            nome = scanner.nextLine();
            System.out.println("Digite o email de um dos contatos:");
            email = scanner.nextLine();
            System.out.println("Digite o telefone de um dos contatos:");
            telefone = scanner.nextLine();
            System.out.println("Digite o dataNascimento de um dos contatos:");
            dataNascimento = scanner.nextLine();
            contatos[i] = new Contato(nome, email, telefone, dataNascimento);
        }

        empresa.contatos = contatos;
        empresa.exibirInfos();

        scanner.close();
    }
}
