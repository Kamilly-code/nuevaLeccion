package PrimeraEvaluacion.For;

import java.util.Random;

/*
* 22.	Hacer un programa que genere 10 números aleatoriamente y calcule su media.*/
public class Ejercicio22 {
    public static void main(String[] args) {
        Random generador = new Random(); //CERTO
        int numeros = 0; //CERTO
        int suma = 0;

        for (int i = 1; i <= 10 ; i++) {
            numeros = generador.nextInt(1,11);  // O generador é sempre dentro da variavél
            suma = suma + numeros;
            System.out.println("Números aleatórios: "+numeros+ "\tEsa séria la suma: " +suma);
        }
        double media = suma/10.0;
        System.out.printf("Esa seria la média %.1f" ,media);

    }
}
