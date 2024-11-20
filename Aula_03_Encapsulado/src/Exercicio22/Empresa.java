package Exercicio22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar() {
        numeroFuncionarios++;
        System.out.println("Um novo funcionário foi contratado. Na empresa: "+nome+" De CNPJ: "+CNPJ+" Número atual de funcionários: " + numeroFuncionarios);
    }

    public void demitir() {
        numeroFuncionarios--;
        System.out.println("Um funcionário foi demitido. Na empresa: "+nome+" De CNPJ: "+CNPJ+" Número atual de funcionários: " + numeroFuncionarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}
