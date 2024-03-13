package SegundaEvaluacion.Teste;

import java.util.ArrayList;
import java.util.Iterator;

public class Simples {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("morango");
        frutas.add("abacate");
        frutas.add("abacaxi");
        frutas.add("pera");
        frutas.add("Laranja");
        frutas.add("Limon");
        frutas.add("manzana");

        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // só pega iterador next, pq a gente ja vinculou o interador com a lista fruta.
        }
    }
}
