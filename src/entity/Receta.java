package entity;

public class Receta {
    protected int id;
    protected Paciente paciente;
    protected Medico medico;
    protected List<Medicamento> medicamento;

    public Receta(int id, Paciente paciente, Medico medico, List<Medicamento> medicamento) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
}
