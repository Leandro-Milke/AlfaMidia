package repository;

import model.Administrador;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AdministradorRepository {


    Map<Integer, Administrador> administradorBD;

    public AdministradorRepository (){
        this.administradorBD = new TreeMap<>();
    }

    public void salvar(Administrador administrador){
        this.administradorBD.put(administrador.getId(), administrador);
    }

    public List<Administrador> buscarTodos(){
        return this.administradorBD.values().stream().collect(Collectors.toList());
    }

    public Administrador buscarPorId(Integer id){
        return this.administradorBD.get(id);
    }

    public void removePorId(Integer id){
        this.administradorBD.remove(id);
    }


}