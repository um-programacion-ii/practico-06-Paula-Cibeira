package entity;

public class ObraSocial {
    protected int id;
    protected String nombre;

    public ObraSocial(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
