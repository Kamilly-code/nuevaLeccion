package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 25.	[FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
* */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        int multiplica = 0;

        for (int i = 0; i < numero ; i++) { // altura // linea
            multiplica = multiplica + i;

            for (int j = 0; j < numero ; j++) { // base // columna

                System.out.print(multiplica+ "\t");
            }
            System.out.println();
        }
    }
}
