package PrimeraEvaluacion.If;
//1.Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.

import java.util.Scanner;

public class primoConFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo");
        int numero = teclado.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }

        } if (numero == 0 || numero == 1) { // Nao precisa colocar isso no bucle pq nem vai entrar, se o bucle começa com 2
            System.out.println("Ese número no está dentro de la tabla de números primos");
        } else if (esPrimo){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }


    }
}
