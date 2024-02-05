package PrimeraEvaluacion.While;

import java.util.Random;
import java.util.Scanner;

/*
//* 39.	Escribe un programa que pida números al usuario entre 1 al 100 hasta que este adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
/*/
public class Ejercicio39dnv {
    public static void main(String[] args) {
        Random generador = new Random(); // primeiro eu crio o generador para generador os numeros aleatorios. Aqui eu nao posso colocar os parametros.
        int parametros = generador.nextInt(1,101); // aqui eu coloco os parametros, ou seja crio uma variavel do que eu quero generar aleatoriamemte e coloco o noraml que colocamos, só que limito dentro dos parenteses a caracteristica do numero que eu quero generar.

        Scanner teclado = new Scanner(System.in);
        int number = teclado.nextInt(); // numero pedido pelo teclado para ver se o usuario consegue adivinhar o numero que esta no generador.

        while (number !=0 && number !=parametros) {
            if (number<1 || number>100) {
                System.out.println("Has salido del rango");
            } else if (number< parametros) {
                System.out.println(number+" es menor de que el bingo");
            } else if (number > parametros) {
                System.out.println(number+ " es mayor de que el bingo");
            }
            System.out.println("Elige oto numero, o si ni quieres más jugar pone 0");
            number = teclado.nextInt();
            if (number == parametros) {
                System.out.println("Bingo");
            }
        }


    }
}
