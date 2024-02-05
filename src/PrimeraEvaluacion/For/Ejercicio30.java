package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 30.	Realizar un programa que pida números (al arrancar el programa se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
* */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador;

        int numero = 0;
        int mayor0 = 0; int menor0 = 0;  int igual0 = 0;

        System.out.println("El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
        System.out.println("Cuantos números quiere pedir:");
        contador = teclado.nextInt();
        do {
            if (contador <= 0) {
                System.out.println("El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
                contador = teclado.nextInt();
            }
        } while (contador <= 0);
        for (int i = contador ; i>0 ; i--) { // Aqui só funciona se for o i = contador e indo reducir, nao pode fazer incrementando pq se nao  nao poderia colocar a condiçao i maior que cero.
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            contador = contador -1;
            if (numero > 0) {
                mayor0++;
            } else if (numero < 0) {
                menor0++;
            } else  {
                igual0++;
            }

        }
        System.out.printf("Números introducidos. \nMayores que cero: %d\nMenores que cero: %d\nIguales a cero: %d",mayor0,menor0,igual0);
    }
}
