package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {

    public static String evaluar(int peso, double estatura, int edad) {
        double IMC = peso / (estatura * estatura);
        if (edad < 45 && IMC < 22.0) {
            return "bajo";
        }
        if (edad < 45 && IMC >= 22.0) {
            return "medio";
        }
        if (edad >= 45 && IMC < 22.0) {
            return "medio";
        } else if (edad >= 45 && IMC >= 22.0) {
            return "alto";
    
        }
        return null;
    
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();

        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
