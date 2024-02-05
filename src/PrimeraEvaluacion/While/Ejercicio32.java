package PrimeraEvaluacion.While;

import java.util.Scanner;

/*
* 32.	Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido.
*
*/
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número entre 1 y 100, ambos inclusive."); // Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive
        int numero = teclado.nextInt();

        //Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado
        if (numero >= 1 && numero <= 100) {

        } else {
            while (!(numero >= 1 && numero <= 100)) {
                System.out.println("Has introducido un número fuera del rango, favor introduzca otro número");
                numero = teclado.nextInt();
            }
        }
        System.out.println("Ese fue el número que introdujiste: "+numero);

    }
}
