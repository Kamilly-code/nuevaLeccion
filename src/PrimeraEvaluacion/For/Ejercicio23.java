package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 23.	[FOR ANIDADO] Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado. Ejemplo:
* */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número para ser las dimensiones");
        int n = teclado.nextInt(); teclado.nextLine();
        System.out.println("Escriba un carácter para ser lo que está dentro del cuadrado");
        char dentro = teclado.nextLine().charAt(0); // Para caracter tem que começar sendo igual ao um String, com a diferença que tem que especificar que é um charAt(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dentro +"\t" ); // PARA FORMAR UM QUADRADO O PRIMEIRO TEM QUE SER SEM LINHA, E OS PROXIMOS COM LINHA PARA DAR AS COLUNAS
            }
            System.out.println();
        }




    }
}
