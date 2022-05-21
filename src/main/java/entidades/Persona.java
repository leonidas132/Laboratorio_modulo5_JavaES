package entidades;

import interfaces.Tipo;

import java.time.LocalDate;

public abstract class Persona implements Tipo {
    private String nombre;
    private String apellido;
    private Documento ID;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Documento ID, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.fechaNacimiento = fechaNacimiento;
    }

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

    public Documento getID() {
        return ID;
    }

    public void setID(Documento ID) {
        this.ID = ID;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona" +
                "nombre: " + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", ID :"  + ID +
                ", fechaNacimiento: " + fechaNacimiento ;
    }
}
