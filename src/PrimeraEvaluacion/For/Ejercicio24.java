package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 24.	[FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
* */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorA,valorB;
        System.out.print("Valor A:");
        valorA = teclado.nextInt(); teclado.nextLine();

        System.out.print("Valor B:");
        valorB = teclado.nextInt(); teclado.nextLine();

        System.out.print("Character:");
        char c = teclado.nextLine().charAt(0);

        if (valorA>valorB) {
            for (int i = 0; i < valorB ; i++) { //altura

                for (int j = 0; j < valorA ; j++) { //base
                    System.out.print(c+"\t");
                }
                System.out.println();
            }
        } else if (valorB> valorA) {
            for (int i = 0; i < valorA  ; i++) {
                for (int j = 0; j < valorB; j++) {
                    System.out.print(c+"\t");
                }
                System.out.println();
            }
        }

    }
}
