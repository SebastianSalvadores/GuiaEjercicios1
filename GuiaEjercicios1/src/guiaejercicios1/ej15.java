/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package guiaejercicios1;

/**
 *
 * @author Sebastian
 */
public class ej15 {

    public static void main(String[] args) {
        //inicializa vector
        int[] vector = new int[100];
        //rellena vector
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        //muestra por pantalla en orden descendente (Con Paso -1)
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
