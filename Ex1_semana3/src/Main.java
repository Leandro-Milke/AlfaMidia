import Model.Funcionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Leandro", "Tecnico", "Testes");
        Funcionario funcionario2 = new Funcionario("Lucas", "Tecnico", "Testes");
        Funcionario funcionario3 = new Funcionario("Pedro", "tes", "Testes");
        Funcionario funcionario4 = new Funcionario("Mara", "lim", "Testes");
        Funcionario funcionario5 = new Funcionario("su", "Tecnico", "Testes");
        Funcionario funcionario6 = new Funcionario("Henrique", "medico", "Testes");
        Funcionario funcionario7 = new Funcionario("Belle", "adm", "Testes");
        Funcionario funcionario8 = new Funcionario("mateus", "eng", "Testes");
        Funcionario funcionario9 = new Funcionario("joão", "Tecnico", "Testes");
        Funcionario funcionario10 = new Funcionario("Teu", "eng", "Testes");

        lista.add(funcionario1);
        lista.add(funcionario2);
        lista.add(funcionario3);
        lista.add(funcionario4);
        lista.add(funcionario5);

        for (Funcionario funcionario : lista) {
            System.out.println(funcionario);
        }
    }
}