package org.example;

public class Carrinho {

    public double total = 0;
    public Produto[] produtos = new Produto[5];

    public void exibirInfos(){
        for(int i = 0; i < 5; i++){
            if (produtos[i] != null) {
                System.out.println("Nome: " + produtos[i].nome + ";" + "Descricao: " + produtos[i].descricao + ";" + "Fabricante: " + produtos[i].fabricante + ";" + "Preco: " + produtos[i].preco + "\n");
            }
        }
    }

    public double calculaTotal(){
        for(int i = 0; i < 5; i++){
            if (produtos[i] != null) {
                total += produtos[i].preco;
            }
        }
        return total;
    }
}
