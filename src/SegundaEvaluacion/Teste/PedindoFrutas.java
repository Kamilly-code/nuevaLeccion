package SegundaEvaluacion.Teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PedindoFrutas {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        for (int i = 0; i < 3 ; i++) {
            System.out.println("escreva sua frutinha: ");
            frutas.add(teclado.nextLine());
        }


        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
