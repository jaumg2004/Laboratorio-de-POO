package org.example;

public class Estoque {

    public int codigoSerie;
    public String codigoProduto;
    public String nome;
    public String categoria;
    public int quantidade;

    public Estoque(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Estoque{" +
                "codigoSerie=" + codigoSerie +
                ", codigoProduto='" + codigoProduto + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
