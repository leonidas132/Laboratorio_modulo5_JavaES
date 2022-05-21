package entidades;

import java.time.LocalDate;

public class Director extends Empleado {
    private String carrera;

    public Director() {
    }

    public Director(String nombre, String apellido, Documento ID, String fechaNacimiento, String fechaCargo, float sueldo, String carrera) {
        super(nombre, apellido, ID, fechaNacimiento, fechaCargo, sueldo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Director: nombre " + getNombre() +
                " apellido: " + getApellido() +
                getID() + " " + " fecha nacimiento: " + getFechaNacimiento() +
                " fecha cargo: " + getFechaCargo() +
                " sueldo: " + getSueldo() +
                "carrera: " + carrera ;
    }

    @Override
    public void tipoPersona() {
        System.out.println(getNombre() + " " + getApellido() + " es un director");
    }
    @Override
    public void guardar() {
        System.out.println(" se guardo un director");
    }

    @Override
    public void modificar() {
        System.out.println(" se modifico un director");
    }

    @Override
    public void eliminar() {
        System.out.println(" se elimino un director");
    }
}
