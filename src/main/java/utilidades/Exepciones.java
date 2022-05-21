package utilidades;

import entidades.Alumno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exepciones {
    static Scanner teclado = new Scanner(System.in);

    public static String getLocalDate( String fechaNaci ){

        boolean continuar;
        do {
            try {
                continuar = false;
                /*System.out.println("ingrese la fecha de cargo con el formato (dd/MM/yyyy)");
                fechaNaci = teclado.next();*/
                Fecha.getLocalDateString(fechaNaci);
                System.out.println("is correcto");

            } catch (DateTimeParseException e) {
                System.out.println("error en el formato " + e.getMessage());
                System.out.println("ingrese la fecha de Nacimiento con el formato (dd/MM/yyyy)");
                fechaNaci = teclado.next();
                continuar = true;
            }
        }while(continuar);
        return fechaNaci;
    }

    public static String getLocalDateFechaCargo( String fechaCrgo ){

        boolean continuar;
        do {
            try {
                continuar = false;
                /*System.out.println("ingrese la fecha de cargo con el formato (dd/MM/yyyy)");
                fechaNaci = teclado.next();*/
                Fecha.getLocalDateString(fechaCrgo);
                System.out.println("is correcto");

            } catch (DateTimeParseException e) {
                System.out.println("error en el formato " + e.getMessage());
                System.out.println("ingrese la fecha de cargo con el formato (dd/MM/yyyy)");
                fechaCrgo = teclado.next();
                continuar = true;
            }
        }while(continuar);
        return fechaCrgo;
    }
    public static String getLocalDateFechaIngreso( String fechaIngreso){

        boolean continuar;
        do {
            try {
                continuar = false;
                /*System.out.println("ingrese la fecha de cargo con el formato (dd/MM/yyyy)");
                fechaNaci = teclado.next();*/
                Fecha.getLocalDateString( fechaIngreso);
                System.out.println("is correcto");

            } catch (DateTimeParseException e) {
                System.out.println("error en el formato " + e.getMessage());
                System.out.println("ingrese la fecha de ingreso con el formato (dd/MM/yyyy)");
                fechaIngreso = teclado.next();
                continuar = true;
            }
        }while(continuar);
        return  fechaIngreso;
    }

}
