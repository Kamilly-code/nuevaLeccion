package PrimeraEvaluacion.String;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        String cadena = teclado.nextLine();
        // convierto el String en un array de caracteres, y así es más fácil invertirlo
        char[] caracteres = cadena.toCharArray();
        System.out.println(Arrays.toString(caracteres));
        // ahora creamos un array de caracteres del mismo tamaño, y copiamos los caracteres en orden inverso
        char[] inverso = new char[caracteres.length];
        int index = 0; // con este índice vamos a ir llevando la posición de array de caracteres
        for (int i = caracteres.length - 1; i >= 0; i--) {
            inverso[i] = caracteres[index];
            index++;
        }

        String resultado = "";
        for (int i = 0; i < inverso.length; i++) {
            resultado += inverso[i]; // hacemos la operación inversa a la línea 15: convertimos el array de caracteres de nuevo en String
        }

        System.out.println(resultado);
    }
}
