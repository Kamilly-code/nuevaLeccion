package PrimeraEvaluacion.DoWhile;

import java.util.Scanner;

/*
*1.	Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
*/
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba tus números favoritos, pero el programa dejará de ejecutar si pone 0.");
        int numero;

        double contador=0;
        double suma = 0;
        double media=0;

        do {
            numero = teclado.nextInt();
            if (numero!=0){
                contador++;
                suma = numero + suma;
                System.out.println("suma: "+suma+ " numero: "+numero);
            }

        }while (numero != 0);
        System.out.println("Has introducido "+contador+" números.");
        media = suma / contador;
        System.out.println("Esa es la média: "+media);


    }
}
