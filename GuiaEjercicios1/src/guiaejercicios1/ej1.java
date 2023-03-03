/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero:");
        int num2 = leer.nextInt();

        int suma = num1 + num2;
        System.out.println("El resultado de la suma es " + suma);

    }
}
