package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Random;

/*5.	Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor a mayor.*/
public class ejercicio5 {
    public static void main(String[] args) {
        Random generador = new Random();
        int [] valoresRandom = new int[10];
        for (int i = 0; i < valoresRandom.length ; i++) {
            valoresRandom [i] = generador.nextInt(1,11);
        }
        Arrays.sort(valoresRandom);
        System.out.println(Arrays.toString(valoresRandom)); //CERTO
    }
}
