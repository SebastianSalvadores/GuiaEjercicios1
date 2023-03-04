/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño N de una matriz cuadrada:");
        int N = leer.nextInt();
        int[][] A = new int[N][N];
        int[][] mAT = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese elemento en la posicion [" + i + "][" + j + "]:");
                A[i][j] = leer.nextInt();
            }
        }
        //int[][] A = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mAT[j][i] = A[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == mAT[i][j] * -1) {
                    cont++;
                }
            }

        }
        if (cont == (N * N)) {
            System.out.println("Es una matriz anti-simetrica.");
        } else {
            System.out.println("No es una matriz anti-simetrica.");
        }

    }
}
