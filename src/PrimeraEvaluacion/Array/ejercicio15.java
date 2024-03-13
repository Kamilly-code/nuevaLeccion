package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Random;

/*15.	Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar 15.	Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar  */
public class ejercicio15 {
    public static void main(String[] args) {
        // creamos un array de 10 enteros
        int[] numeros = new int[10];
        // creamos otro para meter el resultado: pares primero y luego los impares
        int[] resultado = new int[numeros.length];
        // creo una variable para ir avanzando en la posición del array
        int indice = 0;
        Random generator = new Random();

        // relleno el array de números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generator.nextInt(1, 21);
        }
        System.out.println(Arrays.toString(numeros));

        // voy recorriendo el array de aleatorios y cuando encuentro un nº par, lo guardo en donde me diga el índice y además, avanzo el índice una posición
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                resultado[indice] = numeros[i];
                indice++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                resultado[indice] = numeros[i];
                indice++;
            }
        }

        System.out.println(Arrays.toString(resultado));
    }
}
