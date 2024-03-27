package solamente.teste2;

import java.util.Scanner;

public class Usuario {
    public static Scanner informe = new Scanner(System.in);
    public String nombre;
    public String apellido;
    public int edad;

    public void datos (){
        System.out.println("Ingrese el nombre");
        nombre = informe.next();
        System.out.println("Ingrese el apellido"); apellido = informe.next();
        System.out.println("Ingrese su edad");
        edad = informe.nextInt();
        System.out.println("Los datos del usuario son "+nombre+" "+apellido+" y su edad es "+edad);

    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.datos();
    }
}
