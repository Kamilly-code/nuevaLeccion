package SegundaEvaluacion.examen.Ejercicio1;

import java.util.Scanner;

public class Exercise1 {
    static Scanner teclado = new Scanner(System.in);

    //public static String teste;
    public static String codigo;
    //public static boolean tamaño;
    public static String país;
    public static String localidad;

    public static char salir;

    public static String introduzCodigo () {
            System.out.println("Introduce un código:");
            codigo = teclado.nextLine();
        return codigo;
    }

    public static boolean verificaNumero (String c) {
        codigo = c;
        if (c.length() == 8 || c.length() == 11 ) {
            return true;
        }else {
            System.out.println("El número de caracteres introducidos ("+c.length()+") no es correcto");
            System.out.println("Un código SWIFT tiene 6 u 11 caracteres");
            return false;
        }
    }

    public static void indicaCod (String c) {
        System.out.println("CÓDIGO SWIFT "+c+":");
        System.out.println("=======================");

        codigo = c;

        if (verificaNumero(c)) {
            if(c.substring(4,6).equals("ES")){
                país = "ES";
                System.out.println("País: "+país);

                if (c.substring(6,8).equals("MM")) {
                localidad = "Madrid";
                    System.out.println("Localidad: "+localidad);
                }
            } else if (c.substring(4,6).equals("RU")) {
                país = "RU";
                System.out.println("País: "+país);

                if (c.substring(6,8).equals("MM")){
                    localidad = "Moscú";
                    System.out.println("Localidad: "+localidad);
                }
            } else {
                System.out.println("esté código bancário aún no está disponible en nuestro banco de datos.");
            }
        }
    }


    public static void main(String[] args) {
        String cod;
        cod = introduzCodigo();
       //verificaNumero(cod);
        indicaCod(cod);

        System.out.println("¿Quieres salir? (s/n)");
        salir = teclado.nextLine().charAt(0);
        while (salir == 'n') {
            cod = introduzCodigo();
           // verificaNumero(cod);
            indicaCod(cod);
            salir = teclado.nextLine().charAt(0);
        }



    }

}
