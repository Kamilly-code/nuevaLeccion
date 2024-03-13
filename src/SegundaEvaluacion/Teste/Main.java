package SegundaEvaluacion.Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner tecla = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SegundaEvaluacion.Teste.Persona> lista = new ArrayList<>();
        String persona,apellido,genero;
        int edad;


        //b) Realizar un método que permita pedir y retornar el nombre y el género de 5 personas pedidas por teclado.
        //Pode fazer ou com for, ou com for each ou com iterator;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Qual é o seu nome?: ");
            persona = tecla.nextLine();
            System.out.println("Qual é o seu sobrenome?: ");
            apellido = tecla.nextLine();
            System.out.println("Qual é o seu genero?: ");
            genero = tecla.nextLine();
            System.out.println("Qual é a sua idade?");
            edad = tecla.nextInt();
            System.out.println("\n");

            Persona pessoa1 = new Persona(persona,apellido,genero,edad);
            lista.add(pessoa1);

        }
    }

    public static void promedioEdad (ArrayList<Persona> lista) {
        for (int i = 0; i < lista.size() ; i++) {

        }
    }



}
