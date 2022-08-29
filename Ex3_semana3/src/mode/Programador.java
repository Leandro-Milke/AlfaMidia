package mode;

public class Programador extends Funcionario {

    private final double BONUS = 0.05;

    public Programador(String nome, Double valorHora, Double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double valorReceber(){

        return  (super.valorHora * super.totalHoras * (1.0 + BONUS));

    }

}
