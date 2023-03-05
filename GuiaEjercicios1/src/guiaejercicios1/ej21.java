/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package guiaejercicios1;

/**
 *
 * @author Sebastian
 */
public class ej21 {

    public static void main(String[] args) {
        int[][] M = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] P = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int cont = 0, flag = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (M[i][j] == P[0][0]) {

                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (P[k][l] == M[i + k][j + l]) {
                                cont++;
                            } else {
                                cont = 0;
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 1) {
                            flag = 0;
                            break;
                        }
                    }
                    if (cont == 9) {
                        System.out.println("La submatriz P se encontró dentro de la matriz M y el primer elemento se encuentra en M[" + i + "][" + j + "]");
                        flag = 1;
                        break;
                    }
                }

            }
            if (flag == 1) {
                break;
            }
        }
    }
}
