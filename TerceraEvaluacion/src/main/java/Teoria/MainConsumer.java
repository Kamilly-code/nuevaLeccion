package Teoria;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = nombre -> out.println(("Hola "+nombre));
        consumer1.accept("Iván");

        /*
        * A interface Consumer é usada em todos os contextos onde você precisa acessar um objeto de algum tipo e executar alguma operação nele. Por exemplo, você pode usá-lo em uma operação de forEach para iterar sobre uma coleção e fazer algo com cada elemento.  Aqui está um exemplo simples de como usar um Consumer:*/

        ArrayList<Integer>  numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 25 ; i++) {
            numeros.add(generador.nextInt(1,1001));
        }

        numeros.forEach(integer -> out.print(integer + " "));

        out.println("Ordenados de menor a mayor");
        out.println();
        numeros.sort((n1,n2) -> n1-n2);
        numeros.forEach(integer -> out.print(integer + " "));

        //quiero imprimir solamente los pares ordenados de mayor a menor

        out.println("\nNumeros pares de mayor a menor");
        numeros.stream().filter(numero -> numero % 2 == 0 ).sorted((n1,n2) -> n2 - n1).forEach(numero -> out.print(numero + " "));

        //pero queremos imprimirlos ordenados de menor a mayor

    }
}
