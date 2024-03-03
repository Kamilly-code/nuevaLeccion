package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
*8.	Realizar un programa que pida un tamaño de array por teclado y a continuación cree un array formado por elementos aleatorios pares entre 1 y 50.
 * */
public class ejercicio8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un número para ser el ancho de tu array :)");
        int tamaño = teclado.nextInt();
        int [] numberRandom = new int[tamaño];
        Random generador = new Random();

        for (int i = 0; i < numberRandom.length ; i++) {
                numberRandom[i] = generador.nextInt(1, 51);
            if (!(numberRandom[i] % 2 == 0)) {
                numberRandom [i] --; // exclue el número que no es par
            }
        }

        System.out.println(Arrays.toString(numberRandom));

    }


}
