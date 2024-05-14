package entity;
import java.util.ArrayList;
import java.util.List;

public class Drogueria {
    protected List<Medicamento> medicamento;

    public Drogueria(List<Medicamento> medicamento) {
        this.medicamento = new ArrayList<>();
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
}
