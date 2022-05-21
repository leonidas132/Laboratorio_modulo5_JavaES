package entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Empleado {

    private Curso[] listaCursos;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, Documento ID, String fechaNacimiento, String fechaCargo, float sueldo, Curso[] listaCursos) {
        super(nombre, apellido, ID, fechaNacimiento, fechaCargo, sueldo);
        this.listaCursos = listaCursos;
    }

    public Curso[] getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Curso[] listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return "Profesor: nombre " + getNombre() +
                " apellido: " + getApellido() +
                 getID() + " fecha nacimento: " + getFechaNacimiento() +
                 " fecha cargo: " + getFechaCargo() +
                " sueldo :" + getSueldo() + " "+
                  Arrays.toString(listaCursos) ;
    }

    @Override
    public void tipoPersona() {
        System.out.println(getNombre() + " " + getApellido() + " es un profesor ");
    }
    @Override
    public void guardar() {
        System.out.println(" se guardo un profesor");
    }

    @Override
    public void modificar() {
        System.out.println(" se modifico un profesor");
    }

    @Override
    public void eliminar() {
        System.out.println(" se elimino un profesor");
    }
}
