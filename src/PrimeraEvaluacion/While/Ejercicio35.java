package PrimeraEvaluacion.While;
/*
*35.	Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
*/
public class Ejercicio35 {
    public static void main(String[] args) {
        int numero = 1;
        int contador = 0;
        while (numero <= 100) { // 100/5 dá 20 aí que vejo os 20 primeros números
            if (numero%5==0) {
                contador++;
                System.out.println(numero+ " bucle: "+contador);
            }
            numero++;
        }

    }
}
