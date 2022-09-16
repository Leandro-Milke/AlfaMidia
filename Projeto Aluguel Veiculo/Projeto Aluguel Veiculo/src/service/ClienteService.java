package service;

import model.Cliente;
import model.Veiculo;
import repository.ClienteRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ClienteService {

    Scanner sc;
    ClienteRepository clienteRepository = new ClienteRepository();

    public ClienteService(Scanner sc){
        this.sc = sc;
    }

    public Cliente confereEmail(String email){

        List<Cliente> clientesCadastrados = clienteRepository.buscarTodos();

        for(Cliente cliente : clientesCadastrados){
            if(cliente.getEmail().equals(email)){
                return cliente;
            }
        }

        return this.cadastrarCliente();
    }

    public boolean conferirSenha(Cliente clienteParm, String senha){
        Cliente cliente = clienteRepository.buscarPorId(clienteParm.getId());
        return  cliente.getSenha().equals(senha);

    }

    private Cliente cadastrarCliente(){
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println("Digite sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, cidade, senha);

        this.clienteRepository.salvar(cliente);

        return cliente;
    }

    public void alugarVeiculo(Cliente cliente, Veiculo veiculo){
        cliente.getVeiculos().add(veiculo);
        this.clienteRepository.salvar(cliente);

    }


}
