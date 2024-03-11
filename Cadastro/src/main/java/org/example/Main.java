package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa empresa;
        Contato[] contato = new Contato[5];
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

        for(int i = 0; i<5; i++){
            System.out.println("Digite o nome de um dos contatos:");
            nome = scanner.nextLine();
            System.out.println("Digite o email de um dos contatos:");
            email = scanner.nextLine();
            System.out.println("Digite o telefone de um dos contatos:");
            telefone = scanner.nextLine();
            System.out.println("Digite o dataNascimento de um dos contatos:");
            dataNascimento = scanner.nextLine();
            contato[i] = new Contato(nome, email, telefone, dataNascimento);
            empresa = new Empresa(contato[i]);
        }

        endereco.exibirInfos();

        scanner.close();
    }
}