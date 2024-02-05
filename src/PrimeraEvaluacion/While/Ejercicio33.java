package PrimeraEvaluacion.While;

import java.util.Scanner;

/*
*33.	Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
*/
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeros = teclado.nextInt(); // Se eu colocar introduzido o 0 ele vai contar a partir do 0 como arrays, inicializando com 1 do mesmo jeito.

        int contador = 0;
        while (numeros != 0) {
            contador++;
            numeros = teclado.nextInt();

        }
        System.out.println(contador);
    }
}
