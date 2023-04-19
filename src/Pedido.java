import java.util.ArrayList;
import java.util.List;

public class Pedido extends Ingresso {

    private Cliente cliente;
    private List<Ingresso>ingressos = new ArrayList<>();
    //private double total;

    public double calcula(){
        return getValor() * getQuantidade();
    }

}
