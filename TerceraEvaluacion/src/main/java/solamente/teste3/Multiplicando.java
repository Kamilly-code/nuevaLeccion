package solamente.teste3;

import java.util.Scanner;

public class Multiplicando {
    //3.- En un método mostrar la tabla de multiplicar de cualquier numero ingresado por teclado.
    //ATRIBUTOS
    public static Scanner teclado = new Scanner(System.in);
    public int numero;
    public int multiplicacion;

    //MÉTODOS
    public void tablaMultiplicar (){
        System.out.println("Quieres la tabla de que número ?: ");
        numero = teclado.nextInt();


        for (int i = 1; i <= 10 ; i++) {
            multiplicacion = numero * i;
            System.out.println(numero+" X " +i+ " = " +multiplicacion);
        }
    }

    public static void main(String[] args) {
        System.out.println("Testando multiplicacion");
        Multiplicando multiplicando = new Multiplicando();
        multiplicando.tablaMultiplicar();
    }

}
