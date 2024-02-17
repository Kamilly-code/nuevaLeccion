package DudasAinara;

import java.util.Scanner;

/*
* 32.	Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido.
*
*/
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;


        do {
            System.out.println("Escribe un número entre 1 y 100");

            numero = teclado.nextInt();
            if (numero <= 1 || numero >=100){
                numero++;
                System.out.println("¡Error!");
            }else {
                System.out.println("bien");
            }


        }while (numero <= 1 || numero >= 100);
        if (numero <= 1 || numero >= 100) {
            System.out.println("¡Error!");
        }else {
            System.out.println("bien");
        }
        System.out.println(numero);


    }
}
