package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Metodos {
        
    public static boolean validarFecha(String stringFecha) {
        boolean correcto;
        try {
            //Formato de fecha (día/mes/año)
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false); 
//LO ENCONTRE EN STACK OVERFLOW: ES ALGO ASI COMO QUE NO PERMITA INDULGENCIA 
//SI PONGO 30 DE FEBRERO SIN EL SETLENIENT(FALSE) LO CAMBIA A 01 DE MARZO!!!
            //Comprobación de la fecha
            formatoFecha.parse(stringFecha);
            correcto = true;
        } catch (ParseException e) {
            //Si la fecha no es correcta, pasará por aquí
            correcto = false;
        }
        return correcto;
    }

    public static boolean validarDni(String text) {
        boolean correcto;
        try {
            //TRATO DE ASIGNAR EL TEXTO EN UNA VARIABLE INT
            int dni = Integer.parseInt(text);
            correcto = true;
        } catch (NumberFormatException e) {
            //SI NO ES NUMERICO PASA POR AQUI
            correcto = false;
        }
        return correcto;
    }
}
