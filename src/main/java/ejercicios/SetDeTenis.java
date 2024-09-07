package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVA, int numVB) {
        if (numVA < 0 || numVB < 0 || numVA > 7 || numVB > 7
                || (numVA == 7 && numVB < 5) || (numVB == 7 && numVA < 5)) {
            return "Inválido";
        }

        if ((numVA >= 6 && numVA >= numVB + 2)
                || (numVA == 7 && numVB == 6)) {
            return "Ganó A";
        }

        if ((numVB >= 6 && numVB >= numVA + 2)
                || (numVB == 7 && numVA == 6)) {
            return "Ganó B";
        }

        return "Aún no termina";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVB = lector.nextInt();

        String respuesta = evaluar(numVA, numVB);
        System.out.println(respuesta);
    }
}
