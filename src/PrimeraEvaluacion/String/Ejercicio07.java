package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Escribe un programa que lea una cadena
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena:"); //
        String cadena = teclado.nextLine();
        // y dos números enteros para indicar los límites inferior y superior respectivamente dentro de los índices de los caracteres de la cadena
        // tenemos que probar que los números introducidos están entre 0 y cadena.length() - 1
        int li = -1; // lo inicializo a -1 para poder entrar en el bucle la primera vez - esto también se resolvería con un do-while en vez de while
        while (li < 0 || li > cadena.length() - 1) { // mientras me salga del rango, sigo pidendo número
            System.out.print("Límite inferior: ");
            li = teclado.nextInt();
            if (li < 0 || li > cadena.length() - 1) { // si ha introducido un número que no vale, indico el error
                System.out.println("El número introducido no puede ser menor que 0 ni mayor que " + (cadena.length() - 1));
            }
        }

        int ls = -1; // lo inicializo a -1 para poder entrar en el bucle la primera vez - esto también se resolvería con un do-while en vez de while
        while (ls < li || ls > cadena.length() - 1) { // el límite superior no puede ser menor que el límite inferior, ni mayor que la última posición
            System.out.print("Límite superior: ");
            ls = teclado.nextInt();
            if (ls < li || ls > cadena.length() - 1) { // si ha introducido un número que no vale, indico el error
                System.out.println("El número introducido no puede ser menor que " + li + " ni mayor que " + (cadena.length() - 1));
            }
        }

        // Tenemos que imprimir los caracteres de cadena que estén entre li y ls -> método substring(li, ls)
        String subcadena = cadena.substring(li, ls);
        System.out.println(subcadena);
    }
}
