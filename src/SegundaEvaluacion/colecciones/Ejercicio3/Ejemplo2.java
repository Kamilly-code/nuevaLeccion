package SegundaEvaluacion.colecciones.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo2 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String lista = pedirTexto("Introduce una lista de palabras: ");
        System.out.print("Esto es lo ha devuelto el método en la primera llamada: " +lista +"\n");
        String[] palabras = lista.split(" ");
        System.out.println(Arrays.toString(palabras));

        int opcion = 0;
        do {
            System.out.println("1.Contar\n2.Modificar\n3.Eliminar\n4.Monstrar\n5.Salir");
            System.out.println("Selecciona una opción (1-5)");
            opcion = teclado.nextInt(); teclado.nextLine();

            switch (opcion) {
                case 1:
                    /*String palabra = pedirTexto("Introduce una palabra: ");
                    int contador =0;
                    for (int i = 0; i < palabras.length  ; i++) {
                        if (palabra.equals(palabras[i])) {
                            contador++;
                        }
                    }*/
                    //System.out.println("La palabra " +palabra+ " aparece " +contador+ " veces en la lista");
                    contar(palabras);
                    break;
                case 2:
                   modificar(lista);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);

    }

    private static String pedirTexto(String introduce) {
        System.out.print(introduce);
        return teclado.nextLine();
    }

    public static void contar (String[] palabras) {
        String palabra = pedirTexto("Introduce una palabra: ");
        int contador = 0;
        for (int i = 0; i < palabras.length ; i++) {
            if (palabra.equals(palabras[i])) {
                contador++;
            }
        }
        System.out.println("Tiene la palabra " +palabra+ " introducida " +contador + "veces");

    }

    public static void modificar(String lista) {
        String palabra1 = pedirTexto("Introduce una palabra de la lista: ");
        String palabra2 = pedirTexto("¿Por qué otra palabra la quieres sustituir?: ");
        lista = lista.replace(palabra1,palabra2);
        System.out.println(lista);
    }
}



