package PrimeraEvaluacion.While;

import java.util.Scanner;

public class otraManera33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número (0 para finalizar): ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (numero != 0) { // mientras el número introducido sea distinto de 0,
            contador++; // si el número introducido no es 0, incremento el contador
            // sigo pidendo números
            System.out.print("Introduce un número (0 para finalizar): ");
            numero = teclado.nextInt();
        }
        // cuente la cantidad de números que vamos introduciendo por teclado.
        System.out.println(contador + " números introducidos.");

    }
}

