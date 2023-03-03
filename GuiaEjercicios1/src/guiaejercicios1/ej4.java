/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos grados Centígrados hay?");
        double C = leer.nextInt();
        double F = 32 + (9 * C / 5);
        System.out.println("Su equivalente en Fahrenheit es: " + F);
    }
}
