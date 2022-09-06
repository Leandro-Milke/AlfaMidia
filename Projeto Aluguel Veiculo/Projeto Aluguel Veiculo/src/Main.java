

import menu.Menu;
import model.Cliente;
import repository.AdministradorRepository;
import repository.VendedorRepository;
import service.ClienteService;


import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteService clienteService = new ClienteService(sc);

        boolean continua = true;
        do {
            Menu.menu1();
            int opcao1 = sc.nextInt();
            sc.nextLine();

            switch (opcao1){
                case 1:
                    Menu.menuCliente1();
                    String email = sc.nextLine();
                    Cliente cliente = clienteService.confereEmail(email);
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