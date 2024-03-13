package PrimeraEvaluacion.Array;

import java.util.Scanner;

/*
* 10.	Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos a suponer que febrero tiene 28 días.
* */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        int mes = 0;
        do {
            System.out.print("Introduce un número de mes: ");
            mes = teclado.nextInt();
        } while (mes < 1 || mes > 12);

        System.out.println(meses[mes - 1] + " tiene " + dias[mes - 1] + " días.");
    }
}
