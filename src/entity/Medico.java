package entity;

import java.util.ArrayList;

public class Medico {
    protected String nombre;
    protected String apellido;
    protected int id;
    protected boolean particular;
    protected List<ObraSocial> obraSocial;
    protected Especialidad especialidad;


    //constructores
    public Medico(String nombre, String apellido, int id, boolean particular, List<ObraSocial> obraSocial, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.particular = particular;
        this.obraSocial = obraSocial;
        this.especialidad = especialidad;
    }
    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public List<ObraSocial> getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(List<ObraSocial> obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
