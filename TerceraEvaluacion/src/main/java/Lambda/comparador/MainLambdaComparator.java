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
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println(persona));

        //Java Stream: Resumidamente é uma API introduzida no Java 8 (fonte) que fornece uma maneira mais "funcional" e "expressiva" de lidar com coleções de objetos em Java. O que quero dizer com isso é que o Java Stream fornece uma maneira mais moderna, elegante e concisa de lidar com operações em coleções de objetos em Java.
        //
        //Usando o Java Stream, você pode fazer operações como filtrar, mapear, classificar, agrupar e reduzir elementos de uma coleção de objetos em uma única linha de código. Isso torna o código mais conciso, legível e fácil de entender. Além disso, a utilização das Java Streams geralmente resulta em código mais eficiente e escalável.

        //Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pan",0.99));
        productos.add(new Producto ("Leche",1.1));
        productos.add(new Producto("Jamon",1));
        productos.add(new Producto("Estropajo",2.15));
        productos.add(new Producto("Donuts",1.5));
        productos.add(new Producto("Doritos",1.25));
        productos.add(new Producto("Coca-cola",1.25));
        productos.add(new Producto("Aceite",10.5));

        Ejercicio8 e8 = lista8 -> {
            double total = 0;
            for (Producto item : lista8){
                total = total + item.getPrecio(); //preço mais o total antigo;
            }
            return total; //RETORNA O TOTAL FINAL.
        };

        double resultado = e8.calcularTotal(productos);
        System.out.println("\nEJERCICIO 8");
        System.out.printf("%.2f",resultado);

        resultado = productos.stream()
                .mapToDouble(producto -> producto.getPrecio())
                .sum();

        System.out.printf("\nOtra forma: %.2f\n ", resultado);


        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        productos.sort((p1,p2) -> (int) (p2.getPrecio()*100 - p1.getPrecio()*100)); // para passar a decimais tem que multiplicar por 100;

        for (Producto precios : productos){
            System.out.println(precios);
        }



        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.

        System.out.println("ULTIMO EJERCICIO");
        productos.stream()
                .filter(producto -> producto.getPrecio() < 10)
                .forEach(producto -> System.out.println(producto));
        //o forEach tem que ser dentro do codigo de strem.

    }
}
