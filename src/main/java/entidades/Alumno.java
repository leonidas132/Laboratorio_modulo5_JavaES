package entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno extends Persona{
    private String  fechaIngreso;
    private String fecha;
    private Curso [] cursos;

    public Alumno( String fecha) {

    }

    public Alumno(String nombre, String apellido, Documento ID, String fechaNacimiento, String fechaIngreso, Curso[] cursos) {
        super(nombre, apellido, ID, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
        this.cursos = cursos;
    }



    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return   "ALUMNO:  nombre: " + getNombre() +
                 " apellido : " + getApellido() +
                 getID() + " fecha nacimiento: " + getFechaNacimiento() +
                " fechaIngreso: " + fechaIngreso +
                " " + Arrays.toString(cursos);
    }

    @Override
    public void tipoPersona() {
        System.out.println(getNombre()  + " " + getApellido() + " es un estudiante");
    }
    @Override
    public void guardar() {
        System.out.println(" se guardo un estudiante");
    }

    @Override
    public void modificar() {
        System.out.println(" se modifico un estudiante");
    }

    @Override
    public void eliminar() {
        System.out.println(" se elimino un estudiante ");
    }
}
