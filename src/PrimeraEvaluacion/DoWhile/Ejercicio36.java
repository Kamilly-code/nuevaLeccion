package PrimeraEvaluacion.DoWhile;

/*
* 36.	Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
*/
public class Ejercicio36 {
    public static void main(String[] args) {
        int multiplos = 1;
        int contador = 0;
        do {
            if (multiplos % 5 == 0){
                contador++;
                System.out.println("5 * "+contador+ " = "+multiplos);

                if (contador % 10 == 0) {
                    System.out.println("*************************************************");
                }

            }
            multiplos++;

        }while (contador < 50);

    }
}
