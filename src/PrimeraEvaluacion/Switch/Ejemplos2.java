package PrimeraEvaluacion.Switch;

import java.util.Scanner;

public class Ejemplos2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 4;

        switch(i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("i es menor que cinco");
                break;
            case 5:
                System.out.println("i es cinco");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("i es menor que diez y mayor a cinco");
                break;
            default:
                System.out.println("i es diez o mayor a diez");
        }

    }
}
