package PrimeraEvaluacion.If;

//9.	Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no. Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12. Y el día según el mes que sea estará entre 1 y 31, o entre 1 y 30, o entre 1 y 28.

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esctiba una data. Ejemplo 1-1-2001");
        String fecha = teclado.nextLine(); //1-1-2001 // Para string es nextLine

        String[] arrayFecha = fecha.split("-") ; // [1,1,2001]

        int dia = Integer.parseInt(arrayFecha[0]); //Integer.parseInt (Convierte una cadena de texto en un número entero);
        int mes = Integer.parseInt(arrayFecha[1]);
        int año = Integer.parseInt(arrayFecha[2]);

        if (año >= 0 ) {
            if (mes>=1 && mes <=12) {
                if ((mes ==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) &&  dia >=1 && dia <=31 ) {
                    System.out.println("Fecha correcta");
                } else if ((mes ==4 || mes==6 || mes==9 || mes==11) && dia >=1 && dia <=30) {
                    System.out.println("Fecha correcta");
                } else if ((mes ==2) && (dia >=1 && dia <=28)) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            } else {
                System.out.println("Fecha incorrecta");
            }
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
