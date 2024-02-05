package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 29.	Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método  Math.pow().
* */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextInt();
        int exponente = teclado.nextInt();
        double potencia = 1;

        for (int i = 0 ; i < exponente ; i++) {
            potencia = potencia * base;
            System.out.println(potencia);
            // 0 (Primeira volta) = 1 a potencia começa com 1.  1 * 2 = 2
            // 1 (Segunda volta)  = 2 resultado da outra volta. 2 * 2 = 4
            // 2 (Terceira volta) = 4                           4 * 4 = 8
        }
        System.out.println(base + " elevado a " + exponente + " = " + potencia);
    }
}
