package Exercicio05;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;


    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " latindo");
    }

    public void correr() {
        System.out.println(nome + " correndo");
    }


}
