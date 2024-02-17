package SegundaEvaluacion.colecciones.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Diccionario miDiccionario = new Diccionario();

        miDiccionario.nuevoPar("Perro","Dog");
        miDiccionario.nuevoPar("Gato","Cat");
        miDiccionario.nuevoPar("Mesa","Table");
        miDiccionario.nuevoPar("Silla","Chair");
        miDiccionario.nuevoPar("Programación","Programming");
        miDiccionario.nuevoPar("Pelo","Hair");
        miDiccionario.nuevoPar("Cara","Face");

        System.out.print("Perro: ");
        System.out.println(miDiccionario.primeraLetraTraduccion("Perro"));
        System.out.println("Indique la respuesta:");
        String respuesta = teclado.nextLine();
        if (respuesta.toLowerCase().equals("dog")) {
            System.out.println("¡CORRECTO!");
        }else {
            System.out.println("¡False!");
        }





    }

}
