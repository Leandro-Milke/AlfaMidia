import pedido.Pedido;

public class Main {
    public static void main(String[] args) {

        Pedido pedido01 = new Pedido();

        pedido01.setItens("maca", 3.0);
        pedido01.setItens("pera", 4.60);
        pedido01.setItens("ceva", 2.30);


        System.out.println(pedido01.getItens());
        System.out.println(pedido01.getValor());

    }
}