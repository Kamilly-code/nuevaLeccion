package PrimeraEvaluacion.If;

import java.util.Scanner;

/*
* 12.	Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
    ●	si es "gryffindor", salida "valentía";
    ●	si es "hufflepuff", salida "lealtad";
    ●	si es "slytherin", salida "astucia";
    ●	si es "ravenclaw", salida "intelecto";
    ●	de lo contrario, se muestra "no es una casa válida"
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu casa en Harry Potter? Dime tu casa y diremos la mejor característica que se encuadra a ella.");

        String casa = teclado.nextLine();
        if (casa.toLowerCase().equals("gryffindor")) {
            System.out.println("valentía");

        } else if (casa.toLowerCase().equals("hufflepuff")) {
            System.out.println("lealtad");

        } else if (casa.toLowerCase().equals("slytherin")) {
            System.out.println("astucia");
        } else if (casa.toLowerCase().equals("ravenclaw")) {
            System.out.println("intelecto");
        } else {
            System.out.println("No has inserido ninguna casa existente");
        }
    }


}
