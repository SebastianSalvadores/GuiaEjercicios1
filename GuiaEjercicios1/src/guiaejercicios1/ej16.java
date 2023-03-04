/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingrese tamaño del vector;");
        int N = leer.nextInt();
        int vector[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Ingrese numero a buscar:");
        int num = leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            if (vector[i] == num) {
                cont++;
                System.out.println("El numero fue encontrado en la posicion " + i);
            }
        }
        
        System.out.println("El numero fue encontrado " + cont + " veces.");
    }
}
