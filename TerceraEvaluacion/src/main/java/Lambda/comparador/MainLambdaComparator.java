package Lambda.comparador;

import java.util.ArrayList;
import java.util.List;

public class MainLambdaComparator {
    public static void main(String[] args) {
        //1.Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos",29,1.40));
        personas.add(new Persona("Oscar",15,1.40));
        personas.add(new Persona("Kamilly",18,1.40));
        personas.add(new Persona("Joao",13,1.40));
        personas.add(new Persona("Gabriel",8,1.40));
        personas.add(new Persona("Fernando",55,1.40));
        System.out.println("lista");
        System.out.println(personas);

        personas.sort((p1,p2) -> p1.getEdad() - p2.getEdad());
        System.out.println("\nOrdenamos por edad");
        System.out.println(personas);

                /*Comparator comparator = (o1, o2) -> {
            Persona p1 = (Persona) o1;
            Persona p2 = (Persona) o2;

            if (p1.getEdad() < p2.getEdad()){
                return -1;
            } else if (p1.getEdad() > p2.getEdad()) {
                return 1;
            } else {
                return 0;
            }
        };*/

        //removeIf
        //Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.

        personas.sort((p1,p2)-> p1.getEdad() - p2.getEdad());

        //Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        System.out.println("AAAAAAAAAAAAAAAAAAA");
        personas.stream().filter(persona -> persona.getEdad() > 30).forEach(persona -> System.out.println(persona));

        //Java Stream: Resumidamente é uma API introduzida no Java 8 (fonte) que fornece uma maneira mais "funcional" e "expressiva" de lidar com coleções de objetos em Java. O que quero dizer com isso é que o Java Stream fornece uma maneira mais moderna, elegante e concisa de lidar com operações em coleções de objetos em Java.
        //
        //Usando o Java Stream, você pode fazer operações como filtrar, mapear, classificar, agrupar e reduzir elementos de uma coleção de objetos em uma única linha de código. Isso torna o código mais conciso, legível e fácil de entender. Além disso, a utilização das Java Streams geralmente resulta em código mais eficiente e escalável.

        //Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.

        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.

        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.


    }
}
