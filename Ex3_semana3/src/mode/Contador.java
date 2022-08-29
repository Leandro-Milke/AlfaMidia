package mode;

public class Contador extends Funcionario{

    private final double BONUS = 0.03;

    public Contador(String nome, Double valorHora, Double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double valorReceber(){

        return  (super.valorHora * super.totalHoras * (1.0 + BONUS));

    }
}
