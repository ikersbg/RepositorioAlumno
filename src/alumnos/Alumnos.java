package alumnos;

public class Alumnos {

    private String nia;
    private String dni;
    private String nombre;

    public Alumnos(String nia, String dni, String nombre) {
        this.nia = nia;
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getNia() {
        return nia;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
