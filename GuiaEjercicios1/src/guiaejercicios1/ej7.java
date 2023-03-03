/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave = "eureka";
        System.out.println("Ingrese frase:");
        String frase = leer.nextLine();
        if (frase.equals(clave)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
