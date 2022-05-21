package entidades;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Administrativo extends Empleado {
    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, Documento ID, String fechaNacimiento, String fechaCargo, float sueldo) {
        super(nombre, apellido, ID, fechaNacimiento, fechaCargo, sueldo);
    }

    @Override
    public String toString() {
        return "Administrativo: nombre: "+getNombre() +
                " apellido: " + getApellido()+
                getID() +" " + " fecha nacimiento: " + getFechaNacimiento()+
                " fecha cargo: " +  getFechaCargo()  +  " sueldo: " +getSueldo();
    }

    @Override
    public void tipoPersona() {
        System.out.println(getNombre() +" "+ getApellido() + " es Administrativo");
    }

    @Override
    public void guardar() {
        System.out.println(" se guardo una persona administrativa");
    }

    @Override
    public void modificar() {
        System.out.println(" se modifico la persona administrativa");
    }

    @Override
    public void eliminar() {
        System.out.println(" se elimino la persona  administrativa");
    }
}
