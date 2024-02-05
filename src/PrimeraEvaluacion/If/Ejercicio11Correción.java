package PrimeraEvaluacion.If;

import java.util.Scanner;

public class Ejercicio11Correción {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlumnos;
// Solicitud de datos al usuario
        System.out.println("Este programa calcula el precio a pagar por alumno en "
                + "el viaje fin de curso, según la cantidad que se apunte.:");
        System.out.print("Número de alumnos: ");
        numeroAlumnos = scanner.nextInt();
// Realizamos Cálculos y mostramos en pantalla
        if (numeroAlumnos >= 100) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
                    + "euros y cada alumno debe pagar 65 euros");
        } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
                    + "euros y cada alumno debe pagar 70 euros");
        } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
                    + "euros y cada alumno debe pagar 95 euros");
        } else {
            System.out.println("El coste del autobús es de 4000 euros y cada alumno "
                    + "debe pagar " + (4000/numeroAlumnos) + " euros.");
        }
    }
}

