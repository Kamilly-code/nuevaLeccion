package PrimeraEvaluacion.DoWhile;

import java.util.Scanner;

/*
* 37.	Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
*/
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char vocalOno;

        do {
            vocalOno = teclado.nextLine().charAt(0);
            if (Character.toLowerCase(vocalOno) == 'a' || Character.toLowerCase(vocalOno) == 'e' || Character.toLowerCase(vocalOno) == 'i' || Character.toLowerCase(vocalOno) == 'o' || Character.toLowerCase(vocalOno) == 'u' ) {
                System.out.println("VOCAL");
            }else {
                if (vocalOno == ' '){
                    System.out.println("programa finalizado");
                }
                else {
                    System.out.println("NO VOCAL");
                }
            }

        }while (vocalOno != ' ');

    }
}
