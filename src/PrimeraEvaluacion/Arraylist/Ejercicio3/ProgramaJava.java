package PrimeraEvaluacion.Arraylist.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaJava {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
       ArrayList<Double> alt = new ArrayList<>();

        for (Double j: alt) {
            System.out.println(j);
        }





    }

    public static ArrayList<Double> pedirAltura () {
        System.out.println("a");
        ArrayList<Double> alt = new ArrayList<>();
        Double altura = 1.0;
        while (altura < 1.0){
            System.out.println("você é muito baixininho, escreve outra altura");
            altura  = teclado.nextDouble();
            alt.add(altura);
        }


        return alt;
    }

    public static Double  mostrarAltura () {
      return 0.0;

    }





}
