package PrimeraEvaluacion.Arraylist.Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> pessoal = new ArrayList<>();
        ArrayList<Character> generoPessoal = new ArrayList<>();
        int capturarPessoas = 5;

        String adicionados;
        char genero;
        int edad;

        /*for (int i = 0; i < capturarPessoas ; i++) {
            System.out.println("adicione pessoas");
            adicionados = teclado.nextLine();
            pessoal.add(adicionados);
            System.out.println("qual é o genero dela(dele)?");
            genero = teclado.nextLine().charAt(0);
            generoPessoal.add(genero);

        }
        System.out.println(pessoal);
        System.out.println(generoPessoal);*/

        Persona pessoa = new Persona("Joana","camaro","amarelo",'f',12);
        pessoa.mostrar();

    }
}
