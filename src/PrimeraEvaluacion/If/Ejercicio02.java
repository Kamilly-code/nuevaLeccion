package PrimeraEvaluacion.If;

import java.util.Scanner;

//2.	Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba dos números enteros y veremos cual es el mayor entre ellos.\nIntroduzca el primero número:");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número:");
        int numero2 = teclado.nextInt();

        if (numero1>numero2){
            System.out.println("El mayor número es el primero");
        } else if (numero2>numero1) {
            System.out.println("El mayor número es el segundo");
        } else if (numero2==numero1) {
            System.out.println("Los dos números son iguales");
        }


    }
}
