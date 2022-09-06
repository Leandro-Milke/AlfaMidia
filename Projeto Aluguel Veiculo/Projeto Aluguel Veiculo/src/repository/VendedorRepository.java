package repository;

import model.Vendedor;
import model.Vendedor;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class VendedorRepository {


    Map<Integer, Vendedor> vendedorBD;

    public VendedorRepository (){
        this.vendedorBD = new TreeMap<>();
    }

    public void salvar(Vendedor vendedor){
        this.vendedorBD.put(vendedor.getId(), vendedor);
    }

    public List<Vendedor> buscarTodos(){
        return this.vendedorBD.values().stream().collect(Collectors.toList());
    }

    public Vendedor buscarPorId(Integer id){
        return this.vendedorBD.get(id);
    }

    public void removePorId(Integer id){
        this.vendedorBD.remove(id);
    }

}