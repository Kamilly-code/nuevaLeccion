package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Scanner;

/*2.	Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.*/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 5;
        double [] numerosDecimales = new double[n];

        for (int i = 0; i < numerosDecimales.length ; i++) {
            numerosDecimales[i] = teclado.nextDouble();
        }
        for (int i = numerosDecimales.length-1; i >= 0 ; i--) {
            System.out.print(numerosDecimales[i] + "  ");
            // criamos esse for para ficar invertido e colocamos em cada i, para que possamos velo de forma contraria
        }


    }
}
