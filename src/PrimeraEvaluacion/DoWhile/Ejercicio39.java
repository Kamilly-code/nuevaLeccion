package PrimeraEvaluacion.DoWhile;

import java.util.Random;
import java.util.Scanner;

/*
* 39.	Escribe un programa que pida números al usuario entre 1 al 100 hasta que este adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
*/
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero que esté entre 1 y 100, si te rindes y quiere sair del bucle digite 0");

        Random generador = new Random();
        int numeroUsu;
        int bingo = generador.nextInt(1,101);
        System.out.println(bingo);

        do {
            numeroUsu = teclado.nextInt();
            if (numeroUsu !=0){
                if (numeroUsu < 1 || numeroUsu >100){
                System.out.println("El numero introducido está fuera del rango");
                } else if (numeroUsu < bingo) {
                    System.out.println("el numero elegido es menor, intente un numero mayor para hacer ¡BINGO!");
                } else if (numeroUsu > bingo) {
                    System.out.println("el numero elegido es mayor, intente un numero menor para hacer ¡BINGO!");
                }
        }

        }while (numeroUsu != 0 && numeroUsu != bingo );
        if (numeroUsu == bingo) {
            System.out.println("¡BINGO!, en hora buena");
        } else {
            System.out.println("Te has rendido, que deception");
        }
    }
}
