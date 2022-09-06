

import menu.Menu;
import repository.AdministradorRepository;
import repository.ClienteRepository;
import repository.VendedorRepository;


import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AdministradorRepository admRepository = new AdministradorRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        VendedorRepository vendedorRepository = new VendedorRepository();
        VendedorRepository veiculoRepository = new VendedorRepository();

        boolean continua = true;
        do {
            Menu.menu1();
            int opcao1 = sc.nextInt();
            switch (opcao1){
                case 1:
                    Menu.menuCliente1();
                    break;
                case 2:
                    Menu.menuVendedor1();
                    break;
                case 3:
                    Menu.menuAdministrador1();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Alternatva inválida. Tente novamente !!!");
                    break;
            }
        }while (continua);

    }
}