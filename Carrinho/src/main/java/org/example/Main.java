package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        Carrinho carrinho = new Carrinho();
        String nome;
        String descricao;
        String fabricante;
        double preco;
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do produto:");
            nome = scanner.nextLine();
            System.out.println("Digite a descrição do produto:");
            descricao = scanner.nextLine();
            System.out.println("Digite o fabricante do produto:");
            fabricante = scanner.nextLine();
            System.out.println("Digite o preço do produto:");
            preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            produtos[i] = new Produto(nome, descricao, fabricante, preco);
        }

        carrinho.exibirInfos();
        total = carrinho.calculaTotal();
        System.out.println("Valor total: " + total);
    }
}
