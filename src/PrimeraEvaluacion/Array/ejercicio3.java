package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Scanner;

/*3.	Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2.*/
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // declarar três Arrays.
        int [] a1 = new int[5];
        int [] a2 = new int[5];
        int [] a3 = new int[5];

        for (int i = 0; i < a1.length ; i++) {
            System.out.println("Rellene el a1");
            a1 [i] = teclado.nextInt(); // coloco [i] isso para preencher cada índice do array com um inteiro

        }
        for (int i = 0; i < a2.length ; i++) {
            System.out.println("Rellene el a2");
            a2 [i] = teclado.nextInt();
        }
        for (int i = 0; i < a3.length; i++) {
            a3 [i] = a1[i] + a2 [i];

        }

        System.out.println("Resultado do a1");
        System.out.println(Arrays.toString(a1));
        System.out.println("Resultado do a2");
        System.out.println(Arrays.toString(a2));
        System.out.println("Resultado do a3:");
        System.out.println(Arrays.toString(a3));

    }
}
