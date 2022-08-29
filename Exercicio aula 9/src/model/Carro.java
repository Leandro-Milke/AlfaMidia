package model;

public class Carro {

    private int placa;
    private String cor;
    private String marca;
    private String modelo;

    public Carro(Integer placa, String cor, String marca, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
