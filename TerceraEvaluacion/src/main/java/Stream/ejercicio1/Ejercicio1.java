package Stream.ejercicio1;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando streams, haz lo siguiente:ç
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20 ; i++) {
            numeros.add(generador.nextInt(1,16));
        }


        System.out.println("a.Imprime todos los elementos de la lista, sin ordenar.");
        numeros.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nb.Imprime todos los elementos de la lista, ordenados.");
        //Primeiro stream (sorted,filter) depois seus atributos e depois foreach
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nc.Imprime todos los elementos de la lista, sin repetir, ordenados.");
        numeros.stream()
                .distinct()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        //Podemos usar o distinct como em mysql para tirar os numeros duplicados.

        System.out.println("\n\nd.Imprime sólo los mayores o iguales a 5 distintos entre sí.");
        numeros.stream().filter(n -> n >= 5 ).distinct().forEach(n -> System.out.print(n+ " "));

        System.out.println("\n\ne.Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados.");
        numeros.stream()
                .filter(n -> n >= 5 )
                .distinct()
                .sorted()
                .forEach(n -> System.out.print(n+ " "));

        System.out.println("\n\nf.Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados inversamente.");
        numeros.stream()
                .filter(n -> n >= 5 )
                .distinct().sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n+ " "));

        //Este código irá filtrar os números que são maiores ou iguais a 5, remover duplicatas, ordená-los em ordem decrescente e, em seguida, imprimir cada número.

        System.out.println("\n\ng.Suma todos los elementos de la lista e imprime el resultado.");

        int soma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println("A soma de todos os elementos é: " + soma);

       int suma = numeros.stream()
               .reduce(0, (n1,n2) -> n1+n2);
        System.out.println("A soma de todos os elementos é: " + suma);

                //se voce quer que a suma empece por 0, coloca 0 no identify

        System.out.println("\n\nh.Suma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.");
        int suma2 = numeros.stream().filter(n -> n >= 5).mapToInt(n -> n).sum();
        System.out.println("Suma con 5: " + suma2);

        System.out.println("\n\ni.Calcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado. ");
       Double promedio = ((numeros.stream().mapToDouble(n -> n).average()).getAsDouble());
        System.out.println("Promedio: "+promedio);


    }
}
