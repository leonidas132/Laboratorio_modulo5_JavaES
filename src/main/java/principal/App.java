package principal;

import entidades.*;
import utilidades.Exepciones;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>() ;

        byte cantidadPersonas;
        System.out.println("ingrese la cantidad de personas a guardar ");
        cantidadPersonas = teclado.nextByte();
        for (int i = 0; i < cantidadPersonas; i++) {
            String nombre,apellido,tipoDocumento,numeroDocumento,fechaNacimiento = null,
            carrera,codigoCurso,descripcionCurso,fechaIngreso,fechaCargo = null;
            float sueldo;

            System.out.println("escoja el tipo de persona " +
                    "\n 1. Alumno" +
                    "\n 2. Profesor" +
                    "\n 3. Director" +
                    "\n 4. Administrativo");


            System.out.println("ingrese la opcion elegida");
            byte opc = teclado.nextByte();

            teclado.nextLine();
            System.out.println("ingrese el nombre");
            nombre = teclado.nextLine();
            System.out.println("ingrese el apellido");
            apellido = teclado.nextLine();
            System.out.println("ingrese el tipo de documento");
            tipoDocumento = teclado.nextLine();
            System.out.println("ingrese el numero de documento");
            numeroDocumento = teclado.nextLine();
            System.out.println("ingrese la fecha de nacimiento(dd/MM/yyyy)");
            fechaNacimiento = teclado.next();



          
            Persona persona = null;

            switch (opc){
                case 1 : // Alumno

                    System.out.println("digite la fecha del ingreso (dd/MM/yyyy)");
                    fechaIngreso = teclado.next();
                    teclado.nextLine();
                    System.out.println("digite codigo del curso");
                    codigoCurso = teclado.nextLine();
                    System.out.println("digite la descripcion del curso");
                    descripcionCurso = teclado.nextLine();
                    Curso [] cursos ={new Curso(codigoCurso,descripcionCurso)};
                    persona = new Alumno(nombre,apellido,new Documento(tipoDocumento,numeroDocumento), Exepciones.getLocalDate(fechaNacimiento),Exepciones.getLocalDateFechaIngreso(fechaIngreso),cursos);
                    personas.add(persona);
                    break;
                case 2: //Profesor

                    System.out.println("ingrese la fecha del cargo (dd/MM/yyyy)");
                    fechaCargo = teclado.next();
                    teclado.nextLine();
                    System.out.println("ingrese el sueldo");
                    sueldo = teclado.nextFloat();
                    teclado.nextLine();
                    System.out.println("ingrese el codigo del curso");
                    codigoCurso = teclado.nextLine();
                    System.out.println("ingrese la descripcion del curso");
                    descripcionCurso = teclado.nextLine();
                    Curso [] listCurso = {new Curso(codigoCurso,descripcionCurso)};
                    persona = new Profesor(nombre,apellido,new Documento(tipoDocumento,numeroDocumento),Exepciones.getLocalDate(fechaNacimiento),Exepciones.getLocalDateFechaCargo(fechaCargo),sueldo,listCurso);
                    personas.add(persona);
                    break;
                case 3: //Dirrector

                    System.out.println("ingrese la fecha del cargo (dd/MM/yyyy)");
                    fechaCargo = teclado.next();
                    teclado.nextLine();
                    System.out.println("ingrese la carrera");
                    carrera = teclado.nextLine();
                    System.out.println("ingrese el sueldo");
                    sueldo = teclado.nextFloat();
                    persona = new Director(nombre,apellido,new Documento(tipoDocumento,numeroDocumento),Exepciones.getLocalDate(fechaNacimiento),Exepciones.getLocalDateFechaCargo(fechaCargo),sueldo,carrera);
                    personas.add(persona);
                    break;
                case 4:// ADMINISTRADOR

                    System.out.println("ingrese la fecha del cargo (dd/MM/yyyy)");
                    fechaCargo = teclado.next();
                    teclado.nextLine();
                    System.out.println("ingrese el sueldo");
                    sueldo = teclado.nextFloat();
                    persona = new Administrativo(nombre,apellido,new Documento(tipoDocumento,numeroDocumento),Exepciones.getLocalDate(fechaNacimiento),Exepciones.getLocalDateFechaCargo(fechaCargo),sueldo);
                    personas.add(persona);
                    break;
            }
        }
        for (int i  = 0;i<personas.size();i++){
            System.out.println(personas.get(i));
            personas.get(i).tipoPersona();

            System.out.println("operaciones aejecutar ");
            System.out.println("1. guardar" +
                    "\n 2. eliminar" +
                    "\n 3. modificar");
            System.out.println("ingrese la opcion");
            byte opc = teclado.nextByte();
            switch (opc){
                case 1:
                    personas.get(i).guardar();
                    break;
                case 2:
                    personas.get(i).eliminar();
                    break;
                case 3 :
                    personas.get(i).modificar();
                    break;
                default:
                    System.out.println("opc incorrecta");
            }
        }
    }


}
