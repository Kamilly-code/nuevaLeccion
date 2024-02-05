package PrimeraEvaluacion.If;

import java.util.Scanner;

//11.	El director de una escuela está organizando un viaje de estudios, y quiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//a.	si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
//b.	de 50 a 99 alumnos, el costo es de 70 euros,
//c.	de 30 a 49, de 95 euros,
//d.	y si son menos de 30, el costo del alquiler del autobús es de 4000 euros, sin importar el número de alumnos.
//Escribe un programa que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje, si nos dicen el número de alumnos que van de viaje.
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.print("Escriba la cantidad de alumnos que van en la viaje: ");
        Scanner teclado = new Scanner(System.in);
        int cantAlumnos = teclado.nextInt();
        int costo = 0;
        int total = 0;

        if ( !(cantAlumnos >= 100 || (cantAlumnos >= 50 || cantAlumnos <= 99) || (cantAlumnos >= 30 || cantAlumnos <= 49))) {
            System.out.println("Datos introducidos incorrectos, vulva a introducirlos");
        } else {

        } if (cantAlumnos >= 100 ) {
            costo = 65;
            total = cantAlumnos * costo;
            System.out.printf("Pago a la compañia: %d € \nLo que debe pagar cada alumno: %d € \nNúmero de alumnos que van de viaje: %d",total,costo,cantAlumnos);

        } else if (cantAlumnos >= 50 && cantAlumnos <= 99) {
            costo = 70;
            total = cantAlumnos * costo;
            System.out.printf("Pago a la compañia: %d € \nLo que debe pagar cada alumno: %d € \nNúmero de alumnos que van de viaje: %d",total,costo,cantAlumnos);

        } else if ( cantAlumnos >= 30 && cantAlumnos <= 49) {
            costo = 95;
            total = cantAlumnos * costo;
            System.out.printf("Pago a la compañia: %d € \nLo que debe pagar cada alumno: %d € \nNúmero de alumnos que van de viaje: %d",total,costo,cantAlumnos);

        } else if ( cantAlumnos < 30) {
            costo = 4000;
            total = cantAlumnos * costo;
            System.out.printf("Pago a la compañia: %d € \nLo que debe pagar cada alumno: %d€\nNúmero de alumnos que van de viaje: %d",total,costo/cantAlumnos,cantAlumnos);
        }

    }



}
