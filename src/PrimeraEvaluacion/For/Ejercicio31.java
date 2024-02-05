package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 31.	[FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado, siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo, para n = 5:
* */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        char dentro = '@';

        System.out.println("Ese primero seria un triangulo rectángulo invertido porque puse decrementado ");
        for (int i = n; i > 0 ; i--) {
            System.out.println();
            for (int j = i; j > 0 ; j--) {
                System.out.print(dentro);
            }
        }
        System.out.println();
        System.out.println("\nEse primero seria un triangulo rectángulo de la manera que pidieran porque está incrementado ");

        for (int i = 0; i < n ; i++) {
            System.out.println();
            for (int j = 0; j < i ; j++) {
                System.out.print(dentro);
            }
        }System.out.println();
    }
}
