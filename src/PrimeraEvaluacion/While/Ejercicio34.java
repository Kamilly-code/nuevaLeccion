package PrimeraEvaluacion.While;

import java.util.Scanner;

/*
*1.	Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
*/
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        double suma = 0; ; int contador = 0;

        while ( numero != 0) {
            contador ++;
            suma = suma + numero;
           // media = suma / numero;
            numero = teclado.nextInt();
        }
        double media = suma / contador;
        System.out.println(contador);
        System.out.println(suma);
        System.out.println(suma/contador);
    }
}
