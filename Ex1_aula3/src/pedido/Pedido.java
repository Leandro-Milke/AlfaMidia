package pedido;

public class Pedido {
    private String[] itens = new String[10];
    private double[] valor = new double[10];
    private String status;
    private double valorTotal;


    public String getItens() {
        return verItens();
    }

    public String getValor() {
        return verValor();
    }

    public void setItens(String itens, double valor) {
        for (int i = 0; i < this.itens.length; i++) {
            if (this.itens[i] == null) {
                this.itens[i] = itens;
                this.valor[i] = valor;
                break;
            }
        }
    }

    public String verItens(){
            String itens = "";
            for(int i=0; i < this.itens.length; i++){
                if(this.itens[i] != null){
                    itens += this.itens[i] + "\n";
                }
            }
            return itens;
    }

    public String verValor(){
        String valorString = "";
        double valor;
        for(int i=0; i < this.valor.length; i++){
            if(this.itens[i] != null){
                valor = this.valor[i] ;
                valorString = toString().valor + "\n";
            }
        }
        return valorString;
    }

}
