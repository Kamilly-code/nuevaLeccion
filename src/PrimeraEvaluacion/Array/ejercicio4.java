package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*4.	Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.*/
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt(); //Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener

        int [] numeros = new int [tamaño];

        int suma = 0;

        Random generador = new Random();

        //Rellene con números aleatorios*INICIALIZANDO*
        for (int i = 0; i < numeros.length ; i++) {
            //continuación lo inicialice con números aleatorios comprendidos entre 1 y 10
            numeros [i] = generador.nextInt(1,11);

        }
        System.out.println(Arrays.toString(numeros));

        //suma
        for (int i = 0; i < numeros.length ; i++) {
            //Mostrar la suma de todos los números que se guardan en el array.
         suma += numeros[i]; // VocÊ pode colocar um array dentro de uma variavel normal, mas ai ele tem que estar inicializado e em um for

        }
        System.out.println(suma);

    }
}
