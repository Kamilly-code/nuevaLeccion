package SegundaEvaluacion.colecciones.Ejercicio3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. */

        //perro:dog,gato:cat,mesa:table,silla:chair,clase:class,conseguir:get,establecer:set,encima:on.
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        System.out.println(linea);
        // lo siguiente es meter en un array los pares español:ingles
        String[] pares = linea.split(",");
        System.out.println(Arrays.toString(pares));

        //Crio um mapa - dicidionario em que a chave é a palavra em esoañol e o valor em ingles

        HashMap <String, String> traductor = new HashMap<>();

        for (int i = 0; i < pares.length ; i++) {
            //separo com split ":" as palavras de español e ingles
            String[] separador = pares[i].split(":");
            String español = separador[0];
            String ingles = separador[1];
            traductor.put(español, ingles);
        }

        //Pedir uma frase em español e utilizar o dicionario para traduzirla palavra por palavra a palavra. Se uma palavra nao está no dicionario sem traduzir.
        System.out.println(traductor);
        //El perro está encima de la mesa

        System.out.println("Introduce la frase a traducir: ");
        linea = teclado.nextLine();
        String [] palabrasFrase = linea.split(" "); // creo un array con palabras de la frase
        // recorremos este array de palabras para ir traduciéndolas una a una

        for ( String palabraEspañol : /*nombre del array*/ palabrasFrase ) {
            if (traductor.containsKey(palabraEspañol)) {
                System.out.print(traductor.get(palabraEspañol) + " "); // palabraEspañol es la clave (key) para obetener su traducción get(palabraEspañol)
            } else {
                System.out.print(palabraEspañol + " "); // Si no está esa clave en el mapa, que imprima la palabra tal cual
            }

        }



    }
}
