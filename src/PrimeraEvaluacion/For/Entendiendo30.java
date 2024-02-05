package PrimeraEvaluacion.For;

import java.util.Scanner;

public class Entendiendo30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;
        int numero = 0;
        contador = teclado.nextInt();
        for (int i = contador; i >0 ; i--) {
            System.out.println("O i:"+i);
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            System.out.println("Variavél numero:" +numero);
            contador = contador - 1;
        }
        System.out.println(contador);
    }
}
