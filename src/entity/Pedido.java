package entity;

public class Pedido {
    protected int id;
    protected Medicamento medicamento;
    protected int cantidad;

    public Pedido(int id, Medicamento medicamento, int cantidad) {
        this.id = id;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
