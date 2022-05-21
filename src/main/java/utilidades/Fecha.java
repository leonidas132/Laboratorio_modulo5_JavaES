package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha {

    public static final String FORMATO_FECHA= "dd/MM/yyyy";


    /**
     * CONVERTIR UNA CADENA EN UN OBJETO LOCALdATE
     * @param fecha dd/MM/yyyy
     * @return localDate java.time
     */

    public static String getStringLocalDate (LocalDate fecha){
        return fecha.format(DateTimeFormatter.ofPattern(FORMATO_FECHA));
    }

    /**
     * CONVERTIR UN OBJETO LOCALdATE en una cadena
     * @param fecha localDate
     * @return String  dd/MM/yyyy
     */
    public static LocalDate getLocalDateString(String fecha){
        return LocalDate.parse(fecha,DateTimeFormatter.ofPattern(FORMATO_FECHA));
    }


}
