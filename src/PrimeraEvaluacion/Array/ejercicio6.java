package PrimeraEvaluacion.Array;

import java.util.Arrays;
import java.util.Random;

/*6.	Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.*/
public class ejercicio6 {
    public static void main(String[] args) {
        int [] randomNumbers = new int[20];
        int sumaMenor = 0;
        int contadorMenor=0;
        int sumaMayor = 0;
        int contadorMayor=0;
        int sumasCeros = 0;
        Random generador = new Random();

        for (int i = 0; i < randomNumbers.length ; i++) {
            randomNumbers [i] = generador.nextInt(-10,10);
            if (randomNumbers[i] < 0) {
              sumaMenor += randomNumbers [i];
              contadorMenor++;

            } else if (randomNumbers[i] > 0) {
            sumaMayor += randomNumbers[i];
            contadorMayor++;

            } else if (randomNumbers[i] == 0) {
                sumasCeros++;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Contabilizando los ceros: "+sumasCeros);
        System.out.println("Média de los números positivos: "+sumaMayor/contadorMayor);
        System.out.println("Média de los números negativos: "+sumaMenor/contadorMenor);


    }
}
