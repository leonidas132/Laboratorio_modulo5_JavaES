package entidades;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
    private String fechaCargo;
    private float sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Documento ID, String fechaNacimiento, String fechaCargo, float sueldo) {
        super(nombre, apellido, ID, fechaNacimiento);
        this.fechaCargo = fechaCargo;
        this.sueldo = sueldo;
    }

    public String getFechaCargo() {
        return fechaCargo;
    }

    public void setFechaCargo(String fechaCargo) {
        this.fechaCargo = fechaCargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return
                "fechaCargo=" + fechaCargo +
                ", sueldo=" + sueldo ;
    }
}
