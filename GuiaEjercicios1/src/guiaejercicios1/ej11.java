/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        String conf = " ";

        do {
            System.out.println("Ingrese primer numero entero positivo:");
            num1 = leer.nextInt();
        } while (num1 < 0);
        do {
            System.out.println("Ingrese segundo numero entero positivo:");
            num2 = leer.nextInt();
        } while (num2 < 0);

        //menu
        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
                    System.out.println("");
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta);
                    System.out.println("");
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("La multiplicación de " + num1 + " x " + num2 + " = " + mult);
                    System.out.println("");
                    break;
                case 4:
                    double div = (double)num1 / (double)num2;
                    System.out.println("La división de " + num1 + " / " + num2 + " = " + div);
                    System.out.println("");
                    break;
                case 5:
                    do {
                    System.out.println("¿Está seguro de que desea salir del programa (S/N)?");
                    conf = leer.next();
                    } while (!"S".equals(conf.substring(0, 1).toUpperCase()) && !"N".equals(conf.substring(0, 1).toUpperCase()));
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    System.out.println("");
            } 
        } while (!"S".equals(conf.substring(0, 1).toUpperCase()));
    }
}
