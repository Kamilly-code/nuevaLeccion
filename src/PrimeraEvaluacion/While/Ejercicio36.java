package PrimeraEvaluacion.While;

/*
* 36.	Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
*/
public class Ejercicio36 {
    public static void main(String[] args) {
        int numero = 1;
        int contador = 0;
        while (numero <= 250) {
            if (numero % 5 == 0) {
                contador++;
                System.out.println(numero+ " bucle: "+contador);
                if (contador % 10 == 0) {
                    System.out.println("*************************************************");
                }
            }
            numero++;
        }
    }
}
