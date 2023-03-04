/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guiaejercicios1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String moneda;
        System.out.println("Ingrese cantidad de euros:");
        int euros = leer.nextInt();
        do {
            System.out.println("Ingrese moneda a convertir. (dolar/yen/libra):");
            moneda = leer.next();
        } while (!moneda.equalsIgnoreCase("dolar") && !moneda.equalsIgnoreCase("yen") && !moneda.equalsIgnoreCase("libra"));
        Convertir(euros, moneda);
    }

    public static void Convertir(int eu, String moneda) {
        double lib, us, yen;
        switch (moneda.toLowerCase()) {
            case "libra":
                lib = (double) eu * 0.86;
                System.out.println(eu + "€ son " + lib + " libras.");
                break;
            case "dolar":
                us = (double) eu * 1.28611;
                System.out.println(eu + "€ son " + us + " $");
                break;
            case "yen":
                yen = (double) eu * 129.852;
                System.out.println(eu + "€ son " + yen + " yenes.");
                break;
        }
    }
}
