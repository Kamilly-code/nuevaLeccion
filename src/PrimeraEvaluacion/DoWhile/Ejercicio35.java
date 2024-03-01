package PrimeraEvaluacion.DoWhile;
/*
*35.	Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
*/
public class Ejercicio35 {
    public static void main(String[] args) {
        int contador = 0;
        int multiplicar = 1;
        do {
            if (multiplicar % 5 == 0 ) {
                contador++; //
                System.out.println("5 * "+contador+ " = "+multiplicar);
            }
            multiplicar++;
        }while ( contador < 20);

    }
}
