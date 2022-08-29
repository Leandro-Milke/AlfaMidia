import mode.Contador;
import mode.Funcionario;
import mode.Programador;

public class Main {
    public static void main(String[] args) {

        Programador programador1 = new Programador("Leandro", 10.00, 220.0);
        Funcionario contador1 = new Contador("Henrique", 30.0, 220.0);

        System.out.println(programador1.valorReceber());
        System.out.println(contador1.valorReceber());
    }
}