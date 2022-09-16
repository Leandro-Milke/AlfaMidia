package service;

import model.Administrador;
import model.Veiculo;
import repository.AdministradorRepository;
import repository.VeiculoRepository;

import java.util.Scanner;

public class AdminService {

    Scanner sc;
    VeiculoService veiculoService;
    AdministradorRepository repository = new AdministradorRepository();


    public AdminService (Scanner sc, VeiculoService veiculoService){
        this.veiculoService = veiculoService;
        this.sc = sc;
        this.repository.salvar(new Administrador("Admin", "admin@admin.com.br", "poa","1111"));

    }

    public void confereEntrada (int entrada){
        if (entrada == 1) veiculoService.cadastrarVeiculo();
    }




}
