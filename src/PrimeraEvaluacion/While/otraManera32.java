package PrimeraEvaluacion.While;

import java.util.Scanner;

public class otraManera32 {
    public static void main(String[] args) {
        //solicite al usuario un número entre 1 y 100, ambos inclusive.
        System.out.println("Introduce un número entre 1 y 100 (ambos inclusive):");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        // Si se introduce un número fuera del intervalo debe indicarlo mediante un error
        while (numero < 1 || numero > 100) {
            System.out.println("El número está fuera del rango.\nPor favor, introduce un número entre 1 y 100");
            numero = teclado.nextInt(); // esto viene a ser como la i++, pero adaptándola a este ejercicio
        }
        // y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. -> while
        // Al terminar debe imprimir por pantalla el número introducido.
        System.out.println(numero);
    }
}
