/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        int suma = 0;
        do {
            System.out.println("Ingrese un valor limite positivo");
            limite = leer.nextInt();
        } while (limite <= 0);
        do {
            System.out.println("Ingrese numero entero");
            int num = leer.nextInt();
            suma += num;
        } while (suma <= limite);
    }
}
