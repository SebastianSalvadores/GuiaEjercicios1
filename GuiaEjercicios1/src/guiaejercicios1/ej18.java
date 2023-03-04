/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package guiaejercicios1;

/**
 *
 * @author Sebastian
 */
public class ej18 {

    public static void main(String[] args) {
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        //Inicializo matriz A con numeros aleatorios de 0 a 99
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = (int) (Math.random() * 100);
            }
        }
        //Matriz traspuesta B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = A[j][i];
            }
        }
        //Muestro ambas por pantalla
        System.out.println("A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + B[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
