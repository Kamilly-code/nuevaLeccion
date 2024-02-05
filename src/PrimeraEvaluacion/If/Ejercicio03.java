package PrimeraEvaluacion.If;

import java.util.Scanner;

//3.	Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba cinco números por teclado.\nEse es el primero:");
        int n1 = teclado.nextInt();
        int mayorTemporal= n1;
        int menorTemporal = n1;


        System.out.println("Ese es el segundo:");
        int n2 = teclado.nextInt();
        if (n2>mayorTemporal) { // Se o n2>n1
            mayorTemporal = n2; // Se eu quiser mudar o valor de n2, para maior eu coloco o mayorTemporal primeiro.
        } else if (n2<menorTemporal) {
            menorTemporal = n2;
        }

        System.out.println("Ese es el tercero:");
        int n3 = teclado.nextInt();
        if (n3>mayorTemporal) { // Se o n3>n2
            mayorTemporal = n3;
        } else if (n3<menorTemporal) {
             menorTemporal = n3;
        }

        System.out.println("Ese es el cuarto:");
        int n4 = teclado.nextInt();
        if (n4>mayorTemporal){ // Se o n4> n3
            mayorTemporal = n4;
        } else if (n4<menorTemporal) {
            menorTemporal = n4;
        }

        System.out.println("Ese es el quinto:");
        int n5 = teclado.nextInt();
        if (n5>mayorTemporal){ // se o n5> n4
            mayorTemporal = n5;
        } else if (n5<menorTemporal) {
            menorTemporal = n5;
        }

        System.out.printf("El mayor número es: %d El menor número es: %d%n",mayorTemporal,menorTemporal);


    }
}
