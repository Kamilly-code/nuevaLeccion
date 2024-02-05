package PrimeraEvaluacion.If;

import java.util.Scanner;

//6.	Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba tres números enteros positivos.\nEse es el primero:");
        int num1 = teclado.nextInt();

        /*
        Colocar primeiro o numero 1 introducido para comparar.
         */
        int mayor=0;
        int medio=0;
        int menor=0;

        /**/
        System.out.println("Ese es el segundo");
        int num2 = teclado.nextInt();
        /**/
        System.out.println("Ese es el tercero");
        int num3 = teclado.nextInt();

        if (num1>num2 && num1>num3) {
            mayor = num1;
            if (num2>num3){
                medio = num2;
                menor = num3;
            } else if (num3>num2) {
                medio = num3;
                menor = num2;
            }
        } else if (num2>num1 && num2>num3) {
            mayor = num2;
            if (num1>num3){
                medio = num1;
                menor = num3;
            } else if (num3>num1) {
                medio = num3;
                menor = num1;
            }
        } else if (num3>num1 && num3>num2) {
            mayor = num3;
            if (num1>num2) {
                medio = num1;
                menor = num2;
            } else if (num2>num1) {
                medio = num2;
                menor = num1;
            }
        } else {
            System.out.println("Los números son iguales");
        }


        System.out.printf("Mayor número: %d  Número médio: %d  Número menor: %d%n",mayor,medio,menor);
        //Ordenar os números do menor ao maior

        System.out.println("Mostrando os números de maneira ordenada:" +menor+ "," +medio+ "," +mayor);
    }
}
