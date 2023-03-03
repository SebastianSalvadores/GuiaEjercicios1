/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de N:");
        int N = leer.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > 0 && i < N - 1) {
                    if (j > 0 && j < N - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");

        }
    }
}
