package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {

    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
        int diac = currentDate.getDayOfMonth();
        int mesc = currentDate.getMonthValue();
        int añoc = currentDate.getYear();
        int edad = añoc - anno;
        
        if (mes > mesc || (mes == mesc && dia > diac)) {
            edad--;

        }

        return "Usted tiene " + edad + " años";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Dia:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();

        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
