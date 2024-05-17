package entity;

import java.util.HashMap;
import java.util.Map;

public class Farmacia {
    private Map<Medicamento, Integer> stock;

    private static Farmacia instance;

    //singleton
    public static Farmacia getInstance() {
        if (instance == null) {
            instance = new Farmacia();
        }
        return instance;
    }

    private Farmacia() {
        this.stock = new HashMap<>();
    }

    public Map<Medicamento, Integer> getStock() {
        return stock;
    }

    public void agregarStock(Medicamento medicamento, int cantidad) {
        int cantidadActual = stock.getOrDefault(medicamento, 0);
        stock.put(medicamento, cantidadActual + cantidad);
    }

    public void restarStock(Medicamento medicamento) {
        int cantidadActual = stock.getOrDefault(medicamento, 0);
        stock.put(medicamento, cantidadActual - 1);
    }
    public boolean stockSuficiente(Medicamento medicamento) {
        return stock.getOrDefault(medicamento, 0) >= 1;
    }
}
