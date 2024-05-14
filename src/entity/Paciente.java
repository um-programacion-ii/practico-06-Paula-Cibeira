package entity;

public class Paciente {
    //1-atributos
    protected String nombre;;
    protected int dni;
    protected ObraSocial obraSocial;

    //2-constructores

    public Paciente(String nombre, int dni, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.dni = dni;
        this.obraSocial = obraSocial;
    }

    //getters y setters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}
