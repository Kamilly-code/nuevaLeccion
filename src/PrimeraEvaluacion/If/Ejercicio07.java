package PrimeraEvaluacion.If;

import java.util.Scanner;

//7.	A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 taza(barra de chocolate), ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
//Escribe un programa que lea dos valores:
//●	El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
//●	El segundo es un booleano que indica si es fin de semana.
//El programa debe imprimir si la fiesta tiene éxito o no (true o false).
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe dos números,el primero número será de las tazas y el segundo número indica si es día de semana.\nPrimero número:");
        int tazas = teclado.nextInt();
        System.out.println("*Escriba true o false*\nEs fin de semana?:");
        boolean finde = teclado.nextBoolean();
        boolean suceso = false;
        //10 y 20 tazas (durante a semana):
        //15 a 25 tazas (siendo finde):
        if ((finde && tazas >= 15 && tazas <=25) || (!finde && tazas >=10 && tazas <=20)) {
            suceso = true;
        }

        System.out.println("La fiesta fue un éxito? : " +suceso);
    }
}
