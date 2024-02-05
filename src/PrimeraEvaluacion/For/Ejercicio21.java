package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 21.	Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive. */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un número, siendo él el número a: ");
        int a = teclado.nextInt();
        System.out.print("Escriba un número, siendo él el número b: ");
        int b = teclado.nextInt();

        int suma = 0;
        if (a<b) {
            for (int i = a; i <= b; i++) {
                suma = suma + i; //// también se puede poner: suma += i;
                System.out.println("Suma del numero a:" +a+ " y del numero b:" +b+ "=" +suma );
            }
        } else if (b<a) {
            for (int i = b; i <= a; i++) {
                suma = suma + i;
                System.out.println("Suma del numero b:" +b+ " y del numero a:" +a+ "=" +suma);
            }
        }

    }
}
