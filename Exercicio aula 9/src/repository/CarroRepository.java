package repository;

import model.Carro;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CarroRepository {

    private Map<Integer, Carro> carroBD;

    public CarroRepository() {
        this.carroBD = new TreeMap<>();
    }


    public List<Carro> buscarTodos() {
        return this.carroBD.values().stream().collect(Collectors.toList());
    }

    public void salvar(Carro carro) {
        this.carroBD.put(carro.getPlaca(), carro);
    }

    public void remover(Integer matricula) {
        this.carroBD.remove(matricula);
    }

    public Carro buscarPorMatricula(Integer placa) {
        return this.carroBD.get(placa);
    }

}
