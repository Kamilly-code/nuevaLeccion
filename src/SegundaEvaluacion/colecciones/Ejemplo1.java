package SegundaEvaluacion.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        // mapas
        // servem para armazenar pares da variavél de valores da forma chave - valor
        // se declaram colocando entre <> primeiro o tipo de chave e depois o tipo de valor.
        HashMap<String, String> mapa = new HashMap<>();

        // para acrescentar os datos: tem que colocar em pares:
        mapa.put("11111111A", "A. Arribas");
        mapa.put("22222222B", "B. Blazquez");
        mapa.put("33333333C", "C. Calvo");
        mapa.put("44444444D", "D. Diaz");

        System.out.println(mapa);

        //  para recuperar valores, basta con darle la clave;
        Scanner teclado = new Scanner(System.in);
        System.out.println("DNI: ");
      //  String dni = teclado.nextLine();
       // System.out.println(mapa.get(dni));

        // Primeiro o tipo de chave, depois o valor:
        HashMap<Integer, String> numerosIngles = new HashMap<>();
        numerosIngles.put(1, "One");
        numerosIngles.put(2, "Two");
        numerosIngles.put(3, "Three");
        numerosIngles.put(4, "Four");
        numerosIngles.put(5, "Five");
        numerosIngles.put(6, "Six");
        numerosIngles.put(10, "Ten");

        System.out.println(numerosIngles);
        int numero = 0;
        do {
            System.out.println("¿Cómo se dice en inglês? 1 - 10 (0 para salir)");
            numero = teclado.nextInt(); teclado.nextLine();
            // recupera la traducción (si está) en el mapa y la imprimo
            if (numerosIngles.containsKey(numero)) {
                System.out.println(numerosIngles.get(numero));
            } else {
                if (numero != 0) {
                    System.out.println("Esa no me la sé. ¿Quieres enseñármelo?\nDime la traducción");
                    String traduccion = teclado.nextLine();
                    numerosIngles.put(numero, traduccion);
                    break;
                }
            }
        } while (numero != 0);

        // Recorrer un mapa no es tan sencillo como un simple for, tiene su truco
        // hay varias formas, vamos a ver aqui la que utiliza Map. Entry
        // cada uno de los pares clave-valor es una entrada (Entry)
        // para referirnos a una entrada utilizamos Map. Entry (Entrada del mapa)
        // vamos a recorrer todas las entradas con un foreach

        for (Map.Entry<Integer , String> entrada : numerosIngles.entrySet()) {
            int clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + " en inglês es " + valor);
        }

    }
}
