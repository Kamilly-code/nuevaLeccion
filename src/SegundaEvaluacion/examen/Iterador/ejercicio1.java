package SegundaEvaluacion.examen.Iterador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1 {
    static Scanner teclado = new Scanner(System.in);



     public static ArrayList leerValores () {
       int numero = teclado.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();
        while (numero != -99) {
            System.out.println("Si quieres salir del bucle escriba -99");
            numeros.add(numero);
            numero = teclado.nextInt();

        }

        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numericos){
         int suma = 0;
        Iterator<Integer> iterator = numericos.iterator();
        while (iterator.hasNext()) {
            suma = suma + iterator.next();
        }

        return suma;
    }

    public static double calcularMedia (ArrayList<Integer> numericos) {
        int suma = 0;
        int contador = 0;
        Iterator<Integer> iterator = numericos.iterator();
        while (iterator.hasNext()) {
            suma = suma + iterator.next();
            contador++;
        }


         return (double) suma/contador;
    }

    public static void mostrarResultados (ArrayList<Integer> numericos, int suma, double media) {
        System.out.println(numericos);
        System.out.println(suma);
        System.out.println(media);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(leerValores());
        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros);
        mostrarResultados(numeros,suma,media);

    }

}
