package service;

import model.Veiculo;
import repository.VeiculoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeiculoService {

    Scanner sc;
    VeiculoRepository repository = new VeiculoRepository();

    public VeiculoService (Scanner sc){
        this.sc = sc;
    }

    public void cadastrarVeiculo(){
        System.out.println("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.println("Digite a marca do veículo: ");
        String marca = sc.nextLine();
        System.out.println("Digite a cor do veículo: ");
        String cor = sc.nextLine();
        System.out.println("Digite a placa do veículo: ");
        String placa = sc.nextLine();
        System.out.println("Digite o segmento do veículo: ");
        String tipo = sc.nextLine();
        System.out.println("Digite o valor de locação do veículo: ");
        double valor = sc.nextDouble();

        Veiculo veiculo = new Veiculo(modelo,marca,cor,placa,tipo,valor);

        this.repository.salvar(veiculo);

        System.out.println("Você cadastrou o veículo!");

    }

    public void buscarTodosVeiculosLivres(){
        List<Veiculo> todosVeiculos = this.repository.buscarTodos();

        for (Veiculo veiculo : todosVeiculos){
            if (veiculo.getStatus() == Veiculo.Status.LIVRE){
                System.out.println(veiculo);
            }
        }
    }
    public Veiculo alugarVeiculoPorID(int id){

        Veiculo veiculo = this.repository.buscarPorId(id);
        veiculo.setStatus(Veiculo.Status.ALUGADO);
        this.repository.salvar(veiculo);
        return veiculo;
    }

    public void devolverVeiculo(int id){
        Veiculo veiculo = this.repository.buscarPorId(id);
        veiculo.setStatus(Veiculo.Status.LIVRE);
        this.repository.salvar(veiculo);
    }

}
