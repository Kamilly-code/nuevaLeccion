package PrimeraEvaluacion.Switch;

import javax.swing.*;
import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String tipoDia = "";
        String diaSemana = teclado.next();

        switch (diaSemana.toLowerCase()) { //toLowerCase, O toLowerCase()método retorna o valor da string convertido em minúsculas. toLowerCase()não afeta o valor da string strem si.
            case "lunes":
                tipoDia = "Inicio de la semana";
                break;
            case "martes":
            case "míercoles":
            case "jueves":
                tipoDia = "Medio de la semana";
                break;
            case "viernes":
                tipoDia = "Casi finde";
                break;
            case "sábado":
            case "domingo":
                    tipoDia = "Fin de semana, divirtase";
                    break;
            default:
                System.out.println("Dia de la semana inexistente");
        }
        System.out.printf("Dia de la semana: %s  Situación: %s%n",diaSemana,tipoDia);
    }
}
