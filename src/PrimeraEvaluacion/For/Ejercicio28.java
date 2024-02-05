package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 28.	Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
* */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int n = teclado.nextInt();

        for (int i = 1; i <= n ; i++) {
            if (i % 5 == 0) {
                System.out.println("Números multiplos de 5: " +i);
            }


        /* OTRA FORMA DE HACER
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        // recorremos con un for todos los enteros entre 0 y n
        // vamos a considerar que incluimos n
        for (int i = 5; i <= n; i = i + 5) { // hago que la i salte de 5 en 5
        System.out.print(i + " ");
        */

        }
    }
}
