package entity;

public class Turno {
    protected int id;
    protected Paciente paciente;
    protected Medico medico;
    boolean usaObraSocial;
    boolean usaParticular;
    protected boolean estadoTurno;

    public Turno(int id, Paciente paciente, Medico medico, boolean usaObraSocial, boolean usaParticular, boolean estadoTurno) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.usaObraSocial = usaObraSocial;
        this.usaParticular = usaParticular;
        this.estadoTurno = estadoTurno;
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

    public boolean isUsaObraSocial() {
        return usaObraSocial;
    }

    public void setUsaObraSocial(boolean usaObraSocial) {
        this.usaObraSocial = usaObraSocial;
    }

    public boolean isUsaParticular() {
        return usaParticular;
    }

    public void setUsaParticular(boolean usaParticular) {
        this.usaParticular = usaParticular;
    }

    public boolean isEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(boolean estadoTurno) {
        this.estadoTurno = estadoTurno;
    }
}
