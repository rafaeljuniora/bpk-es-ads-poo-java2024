package Exercicio02;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;
    private boolean estadoCelular=false;

    public Celular() {
    }

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligarCelular(boolean celular){
        this.estadoCelular=true;
    }
    public void desligarCelular(boolean celular){
        this.estadoCelular=false;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                '}';
    }
}
