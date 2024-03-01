package PrimeraEvaluacion.DoWhile;

import java.util.Scanner;

/*
*33.	Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
*/
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba tus números favoritos, pero el programa dejará de ejecutar si pone 0.");
        int numero;

        int contador=0;

        do {
        numero = teclado.nextInt();
        if (numero!=0){
            contador++;
        }

        }while (numero != 0);
        System.out.println("Has introducido "+contador+" números.");




    }
}
