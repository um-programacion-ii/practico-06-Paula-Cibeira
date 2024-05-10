package entity;

public class Drogueria {
    protected List<Medicamento> medicamento;

    public Drogueria(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
}
