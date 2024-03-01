package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Scanner;

/*1.	Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.*/
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 5;
        double [] numerosDecimales = new double[n];
        for (int i = 0; i <= numerosDecimales.length-1 ; i++) {
            numerosDecimales [i] = teclado.nextDouble();

        }
        System.out.println(Arrays.toString(numerosDecimales));

    }
}
