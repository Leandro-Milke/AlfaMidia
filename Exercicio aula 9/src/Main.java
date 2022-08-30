import model.Carro;
import repository.CarroRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarroRepository repository = new CarroRepository();

        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        int menu;

        do {

            System.out.println("Digite: \n" +
                    "[1] - Para cadastrar veículo \n" +
                    "[2] - Para buscar veículo \n" +
                    "[3] - Para buscar todos veículos \n" +
                    "[4] - Para remover veículo \n" +
                    "[0] - Para sair \n");
            menu = sc.nextInt();
            if (menu == 0) break;
            else if (menu == 1) {
                System.out.println("Digite a placa");
                int placa = sc.nextInt();
                String x = sc.nextLine();
                System.out.println("Digite a cor");
                String cor = sc.nextLine();
                System.out.println("Digite a marca");
                String marca = sc.nextLine();
                System.out.println("Digite e o modelo");
                String modelo = sc.nextLine();

                Carro carro = new Carro(placa,cor,marca,modelo);
                repository.salvar(carro);

            }
            else if (menu == 2) {
                System.out.println("Busca por veículo \n");
                System.out.println("Digite a placa \n");
                int placa = sc.nextInt();
                System.out.println(repository.buscarPorPlaca(placa));

            }
            else if (menu == 3) {
                System.out.println("\n Todos os carros cadastrados:");
                System.out.println(repository.buscarTodos());

            }
            else if (menu == 4) {
                System.out.println("\n Para remover o veículo digite a placa:");
                int placa = sc.nextInt();
                repository.remover(placa);

            }
            else System.out.println("opção inválida");

        }while (continua != false);

       // System.out.println(repository);

        System.out.println("Até ....!");
    }
}