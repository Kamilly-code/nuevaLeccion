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
        double suma = 0;
        double  media = 0;
        double contador = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = teclado.nextInt();
           if (notas[i] <0 || notas[i]>10) {
                notas[i] = i--; // eso sirve para quitar el número que la persona está acrecentando
                System.out.println("Ese número está fuera del rango, elige otro");
            } else {
               contador++;
               suma += notas[i];
           }
        }


            Arrays.sort(notas); // sirve para ordenador los números
        media = suma / contador;


        System.out.println(Arrays.toString(notas));
        System.out.println("suma: "+suma);
        System.out.println("média de las notas: "+media);
        System.out.println("nota más alta:"+ notas[4]);
        System.out.println("menor nota:"+ notas[0]);


        }

    }
