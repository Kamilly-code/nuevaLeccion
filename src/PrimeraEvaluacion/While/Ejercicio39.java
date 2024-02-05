package PrimeraEvaluacion.While;

import java.util.Random;
import java.util.Scanner;

/*
* 39.	Escribe un programa que pida números al usuario entre 1 al 100 hasta que este adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
*/
public class Ejercicio39 {
    public static void main(String[] args) {
        Random generador = new Random (); // creamos números aleatorios
        int bingo = generador.nextInt(1,101); // Como creamos la variable de números aleatorios ahora tenemos que dar las características para funcionar

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 100. Si quieres parar el bucle pone 0.");
        int numeros = teclado.nextInt();

        //casos:
        while (numeros !=0 && numeros != bingo ) {
            if (numeros < 1 || numeros > 100) {
                System.out.println("Mal. Te has salido.");
            }else if (numeros < bingo){ // número menos do que el generador
                System.out.println(numeros + " es menor que el número a adivinar.");
            } else if (numeros > bingo) { // número mayor do que el generador
                System.out.println(numeros + " es mayor que el número a adivinar.");
            }
            // antes de salir tenemos que hacer un nuevo intento
            System.out.println("Intenta de nuevo. 0 para rendirte.");
            numeros = teclado.nextInt();

            if (numeros == bingo) {
                System.out.println("¡BINGO!");
            }
        }


        
    }
}
