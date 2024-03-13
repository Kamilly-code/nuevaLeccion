package PrimeraEvaluacion.Arraylist.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer i = 1;

        while (i != 0) {
            System.out.println("Ingresa un numero: ");
            i = teclado.nextInt();
            numeros.add(i);
        }

        for (Integer j: numeros) {
            System.out.print(j+"-");
        }



    }
}
