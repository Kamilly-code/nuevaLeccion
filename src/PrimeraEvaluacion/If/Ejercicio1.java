package PrimeraEvaluacion.If;

//1.Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero entero positivo");
        int numero = teclado.nextInt();

        //Como calcular um número primo?
        /*
        Para identificar um número primo devemos dividi-lo sucessivamente por números primos como: 2, 3, 5. . . e verificar se a divisão é exata (em que o resto é zero) ou não exata (onde o resto é diferente de zero). Se o resto da divisão for zero o número não é primo. Se nenhum resto for zero, o número é primo.
         */


        boolean esPrimo = true;

        if (numero == 0 || numero == 1) {  //CORRECTO
            System.out.println("El número no es primo:1"); //CORRECTO
        } else { //ERROR, PARA ESE EJERCÍCIO SIEMPRE NECESITÁREMOS DEL FOR, PARA DIVIDIR EL NÚMERO POR EL MISMO.
            for (int i = 2; i < numero ; i++) {
                if (numero % i == 0) {
                    // Quando colocamos o sout aqui e o else aqui ele nao pega o 2 como número primo, fica confuso ja que o for começa com 2, e como o for faz o número se dividir por outros números antes, na primeira volta o número consegue sim se dividir por algum número e no outro nao.

                    esPrimo = false;
                    break;

                }
            }
        }
       if (numero == 0 || numero == 1) {
           // Esse aqui seria como o else, mostrando também para o usuario se o número seria primo ou nao.

        } else if (esPrimo) {
           // Aqui o 2 entra porque, 2/1 = 0, mas 2/2=1, entrando em números primos.
            System.out.println("Es primo");
            // Colocamos fora do bucle para ver se o número é capz de dividir só por ele mesmo.
        } else {
            System.out.println("No es primo");
        }


    }
}
