/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma1 = 0, suma2 = 0, dec = 2, cont = 0;

        //Inicializamos matriz por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese entero entre 1 y 9 en la posición [" + i + "][" + j + "]:");
                    matriz[i][j] = scanner.nextInt();
                } while (matriz[i][j] > 9 || matriz[i][j] < 1); //do while comprueba rango de 1 a 9. 
            }
        }

        //suma1 hace la suma de la diagonal principal. Este valor luego se compara con el resto de sumas.
        for (int i = 0; i < 3; i++) {
            suma1 += matriz[i][i];
        }

        //Esta es la suma de la diagonal secundaria.
        for (int i = 0; i < 3; i++) {
            suma2 += matriz[i][dec];
            dec--;
        }

        //Compruebo que la suma de ambas diagonales es igual antes de continuar con el programa.
        if (suma1 == suma2) {
            suma2 = 0; //como suma1 y suma2 valen lo mismo, reciclo la variable suma2 para el resto de sumas de filas y columnas.

            //Primero hago la suma de las filas.
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    suma2 += matriz[i][j];
                }
                if (suma2 != suma1) {
                    System.out.println("No es un cuadrado magico.");
                    break;
                } else {
                    cont++; //cuento cuantas veces la suma de los elementos de la fila da igual a la suma de la diagonal principal(valor de referencia).
                    suma2 = 0;
                }
            }
            //Luego la suma de las columnas.
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    suma2 += matriz[i][j];
                }
                if (suma2 != suma1) {
                    System.out.println("No es un cuadrado magico.");
                } else {
                    cont++;
                    suma2 = 0;
                }
            }
            //Como es una matriz cuadrada de 3 filas y 3 columnas, la cantidad de sumas correctas tendra que ser de 6 (sin contar las diagonales, que ya fueron validadas antes(linea 44))
            if (cont == 6) {
                System.out.println("¡Es un cuadrado magico!");
            } else {
                System.out.println("No es un cuadrado magico.");
            }
        } else {
            System.out.println("No es un cuadrado magico.");
        }
    }
}

//Test pull request