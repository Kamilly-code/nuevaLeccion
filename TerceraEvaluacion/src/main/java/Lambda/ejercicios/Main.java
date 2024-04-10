package Lambda.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("veinticuatro");



        /*Ejercicio1 e1 = (lista1) -> {
            for (String elemento : lista1) {
                System.out.println(elemento);
            }
        };*/

        Ejercicio2 ej2 = lista2 -> {
            int contador = 0;

                for (String strings: lista2){
                    if (strings.length() > 5){
                        contador++;
                    }
                }

            return contador ;
        };
        System.out.println(ej2.palabrasConMasDe5Caracteres(lista));

        List<Integer> numerosInteros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20 ; i++) {
            numerosInteros.add(generador.nextInt(0,11));
        }

        Ejercicio3 ej3 = lista3 -> {
            int mayor = lista3.get(0);
            for (int i = 1; i < lista3.size(); i++) {
                if (lista3.get(i) > mayor){
                    mayor = lista3.get(i);
                }
            }
            return mayor;
        };


        Ejercicio4 ej4 = lista4 -> {
            int suma = 0;
            for (Integer numero : lista4) {
                if (numero % 2 == 0){
                    suma += numero;
                }
            }
            return suma;
        };
        System.out.println(ej4.numerosPares(numerosInteros));

        System.out.println("EJERCICIO5");
        List<Persona> pessoa1 = new ArrayList<>();
        pessoa1.add(new Persona("Kamilly",20));
        pessoa1.add(new Persona("Gabriel",18));
        pessoa1.add(new Persona("Joao",25));
        pessoa1.add(new Persona("Alejandro",55));
        pessoa1.add(new Persona("Tijuca",22));
        pessoa1.add(new Persona("Nanaths",41));














    }
}
