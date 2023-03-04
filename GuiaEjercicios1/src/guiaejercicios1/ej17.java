/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux, cont, dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, dig5 = 0;
        
        System.out.println("Ingrese tamaño del vector:");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = (int)(Math.random() * 100000);
        }
        for (int i = 0; i < N; i++) {
            aux = vector[i];
            cont = 0;
            
            while (aux > 0){
                aux = (int)(aux / 10);
                cont++;
            }
            
            switch (cont){
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
            }
            
            
        }
        System.out.println("Se encontraron " + dig1 + " numeros de 1 digito, " + dig2 + " numeros de 2 digitos, " + dig3 + 
                " numeros de 3 digitos, " + dig4 + " numeros de 4 digitos y " + dig5 + " numeros de 5 digitos.");
    }
}
