package entity;

public class Compra {
    protected int id;
    protected Paciente paciente;
    protected Receta receta;

    public Compra(int id, Paciente paciente, Receta receta) {
        this.id = id;
        this.paciente = paciente;
        this.receta = receta;
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

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
