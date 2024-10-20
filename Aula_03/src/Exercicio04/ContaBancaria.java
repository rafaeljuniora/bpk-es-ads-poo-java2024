package Exercicio04;

public class ContaBancaria {
    public Integer numeroConta;
    public Integer saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numeroConta, Integer saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
