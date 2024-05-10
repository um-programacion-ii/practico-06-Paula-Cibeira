package entity;

public class Farmacia {
    protected List<Medicamento> medicamento;

    public Farmacia(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
}
