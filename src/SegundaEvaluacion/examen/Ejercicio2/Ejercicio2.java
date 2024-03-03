package SegundaEvaluacion.examen.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

         // Los metodos estaticos sirven para no instanciar los objetos y luego utilizar sus metodos, tienen muchos usos desde patrones de diseno hasta la funcionalidad de librerias. Sirven como esse caso, quando criamos métodos internos e queremos estanciarlos sem que seja necessario Crear Ejercicio2 numero1 = new Ejercicio 2.
        int edad = pedirEdad();
        String tipo = devolverTipo(edad);
        int precio = calcularPrecio(tipo);
        imprimirTicket(tipo,precio);

    }
    
   static int pedirEdad() {
       System.out.println("¿Edad?");
       int años = sc.nextInt();
        return años ;
   }
   
   static String devolverTipo(int edad) {
       if (edad >= 18) {
          return "Adulto";
        } else {
            return "Niño  ";
        }
   }
   
   static int calcularPrecio(String tipo) {
        if (tipo.equals("Adulto")){
            return 4;
        } else {
            return 2;
        }
   }
   
   static void imprimirTicket(String tipo, int precio){
       System.out.println("---------------------------------");
       System.out.println("|       TICKET DE ENTRADA        |");
       System.out.println("|    "+tipo+"       Precio: "+precio+"$     |");
       System.out.println("---------------------------------");
   }
   
}
