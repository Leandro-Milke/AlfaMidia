package mode;

public class Administrador extends Funcionario{

    private final double BONUS = 0.06;

    public Administrador(String nome, Double valorHora, Double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double valorReceber(){

        return  (super.valorHora * super.totalHoras * (1.0 + BONUS));

    }
}
