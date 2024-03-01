package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
* 7.	Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
* */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        int media = 0;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {


        }
        Arrays.sort(notas);


        System.out.println(Arrays.toString(notas));



    }

}
