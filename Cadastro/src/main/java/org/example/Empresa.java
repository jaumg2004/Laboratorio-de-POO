package org.example;

public class Empresa {

    public String cnpj;
    public String endereco;
    public Contato[] contatos; // Changed from contato[] to contatos

    public Empresa(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Empresa(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void exibirInfos(){
        System.out.println("CNPJ da empresa: "+ cnpj);
        System.out.println("Endereço da empresa: "+ endereco);
        System.out.println("Dados dos contatos");
        if (contatos != null) {
            for(int i = 0; i < contatos.length; i++){
                System.out.println("Nome: "+contatos[i].nome);
                System.out.println("Email: "+contatos[i].email);
                System.out.println("Telefone: "+contatos[i].telefone);
                System.out.println("Data de Nascimento: "+contatos[i].dataNascimento);
            }
        } else {
            System.out.println("Nenhum contato disponível.");
        }
    }

}
