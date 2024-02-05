package PrimeraEvaluacion.Switch;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroMes = teclado.nextInt();

        String mes,estacion;
        mes="";
        estacion="";

        switch (numeroMes) {
            case 1:
                mes = "Enero";
                estacion = "Invierno";
                break;
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                mes = "Marzo";
                estacion = "Primavera";
                break;
            case 4:
                mes = "Abril";
                estacion = "Primavera";

                break;
            case 5:
                mes = "Mayo";
                estacion = "Primavera";

                break;
            case 6:
                mes = "Junio";
                estacion = "Verano";
                break;

            case 7:
                mes = "Julio";
                estacion = "Verano";
                break;

            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;
            case 9:
                mes = "Septiembre";
                estacion = "Otoño";
                break;
            case 10:
                mes = "Octubre";
                estacion = "Otoño";
                break;
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;
            case 12:
                mes = "Deciembre";
                estacion = "Invierno";
                break;
        }
        System.out.printf("Mes del año: %s  Estación del año: %s%n",mes,estacion);
    }
}
