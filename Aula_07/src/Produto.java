import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double valor;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void addProd(Produto produto){
        this.produtos.add(produto);
    }
}
