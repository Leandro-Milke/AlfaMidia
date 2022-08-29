import model.Carro;
import repository.CarroRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarroRepository repository = new CarroRepository();

        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        int tecla;

        do {

            System.out.println("Digite: \n" +
                    "[1] - Para cadastrar veículo \n" +
                    "[2] - Para buscar veículo \n" +
                    "[3] - Para buscar todos veículos \n" +
                    "[4] - Para remover veículo \n" +
                    "[0] - Para sair \n");
            tecla = sc.nextInt();
            if (tecla == 0) break;
            else if (tecla == 1) {
                System.out.println("Digite a placa");
                int placa = sc.nextInt();
                System.out.println("Digite a cor");
                String cor = sc.nextLine();
                System.out.println("Digite a marca");
                String marca = sc.nextLine();
                System.out.println("Digite e o modelo");
                String modelo = sc.nextLine();

                Carro carro = new Carro(placa,cor,marca,modelo);
                repository.salvar(carro);

            }
            else if (tecla == 2) {

            }
            else if (tecla == 3) {

            }
            else if (tecla == 4) {

            }
            else System.out.println("opção inválida");

        }while (continua != false);

        System.out.println("Até ....!");
    }
}