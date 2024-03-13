package SegundaEvaluacion.examen.Ejercicio1;

import java.util.Scanner;

public class Correción {
    public static Scanner teclado = new Scanner(System.in);

    // public static String teste;
    // public static String codigo;
    // public static boolean tamaño;
    // public static String país;
    // public static String localidad;

    // public static char salir;

    public static String introduzCodigo () {
        System.out.println("Introduce un código:");
        String codigo = teclado.nextLine();
        return codigo;
    }

    /* public static void verificaNumero (String c) {
         codigo = c;
         if (c.length() == 8 || c.length() == 11 ) {
             tamaño = true;
         }else {
             System.out.println("El número de caracteres introducidos ("+c.length()+") no es correcto");
             System.out.println("Un código SWIFT tiene 6 u 11 caracteres");
         }
     } */
    public static boolean comprobarSwift(String swift){
        int tamaño = swift.length();
        if (tamaño == 8 || tamaño == 11){
            System.out.println("Correcto");
            return true;
        } else {
            System.out.println("El número de carácteres introducido es " + tamaño + " no es correcto\nUn código SWIFT tiene 8 u 11 carácteres");
            return false;
        }
    }

    // public static String indicaCod (String c) {
    public static void indicaCod (String c) {
        /* System.out.println("CÓDIGO SWIFT "+c.substring(0,8)+":");
        System.out.println("======================="); */

        //codigo = c;

        String país = "";
        String localidad = "";
        // if (tamaño == true) {
        if (comprobarSwift(c)) {
            //System.out.println("CÓDIGO SWIFT "+c.substring(0,8)+":");
            System.out.println("CÓDIGO SWIFT " + c + ":");
            System.out.println("=======================");
            if(c.substring(4,6).equals("ES")){
                país = "ES";
                System.out.println("País: "+país);

                if (c.substring(6,8).equals("MM")) {
                    localidad = "Madrid";
                    System.out.println("Localidad: "+localidad);
                }
                // return país+"\n"+localidad;
            } else if (c.substring(4,6).equals("RU")) {
                país = "RU";
                System.out.println("País: "+país);

                if (c.substring(6,8).equals("MM")){
                    localidad = "Moscú";
                    System.out.println("Localidad: "+localidad);
                }
                // return país;
            } else {
                System.out.println("esté código bancário aún no está disponible en nuestro banco de datos.");
            }
        }
        // return codigo;
    }


    public static void main(String[] args) {
        String cod;
        cod = introduzCodigo();
        //verificaNumero(cod);
        // comprobarSwift(cod);
        indicaCod(cod);
        char salir = 'a';
        System.out.println("¿Quieres salir? (s/n)");
        salir = teclado.nextLine().charAt(0);
        while (salir == 'n') {
            cod = introduzCodigo();
           // comprobarSwift(cod);
            indicaCod(cod);
            System.out.println("¿Quieres salir? (s/n)");
            salir = teclado.nextLine().charAt(0);
  }

}

}


