package entity;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    protected List<Medicamento> medicamento;

    public Farmacia(List<Medicamento> medicamento) {
        this.medicamento = new ArrayList<>();
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
}
