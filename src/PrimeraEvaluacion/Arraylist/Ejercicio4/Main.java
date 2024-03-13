package PrimeraEvaluacion.Arraylist.Ejercicio4;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, nombreMayor = "";
        float cali, caliMayor = 0;
        ArrayList<Alumno> lista = new ArrayList<Alumno>();

        int n;
        n = teclado.nextInt();
        for (int i = 1; i <= n ; i++) {
            teclado.nextLine();
            System.out.println("ingresa tu nombre: ");
            nombre = teclado.nextLine();
            System.out.println("ingresa tu calificacion: ");
            cali = teclado.nextFloat();
            lista.add(new Alumno(nombre,cali));
        }

        for (Alumno j: lista) {
            j.mostrar();
        }

    }
}
