package entity;
import java.util.ArrayList;
import java.util.List;

public class Drogueria {

    private static Drogueria instance;
    private Drogueria() {
    }
    //patron singleton
    public static Drogueria getInstance() {
        if (instance == null) {
            instance = new Drogueria();
        }
        return instance;
    }

    public int enviarStock(Pedido pedido) {
        return pedido.getCantidad();
    }
}

