package entity;

public class Paciente {
    //1-atributos
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int edad;
    protected String correo;
    private ObraSocial obraSocial;

    //2-constructores
    public Paciente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Paciente(String nombre, String apellido, int dni, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.correo = correo;
    }

    public Paciente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Paciente(String nombre, String apellido, int dni, int edad, String correo, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.correo = correo;
        this.obraSocial = obraSocial;
    }

    //3-metodos


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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}
