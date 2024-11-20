package Exercicio16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        System.out.println("A loja " + nome +" no endereco: "+endereco+" telefone: "+telefone+ " está aberta.");
    }

    public void fechar() {
        System.out.println("A loja " + nome +" no endereco: "+endereco+" telefone: "+telefone+ " está fechada.");
    }
}
