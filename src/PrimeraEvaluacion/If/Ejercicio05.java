package PrimeraEvaluacion.If;

import java.util.Scanner;

//5.	Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "Kamilly";
        String contraseña = "Naosei123"; //Como colocar para nao interferir letras mayusculas o minusculas?

        System.out.println("Pone aquí el nombre tu usuario:");
        String user = teclado.next();
        System.out.println("Pone aquí tu contraseña:");
        String password = teclado.next();

        if ( usuario.equals(user) && contraseña.equals(password)) {
            System.out.println("Has entrado al sistema");
        } else if ( usuario.equals(user) && !contraseña.equals(password) ) {
            System.out.println("Contraseña Incorrecta");
        } else if ( contraseña.equals(password) && !usuario.equals(user)) {
            System.out.println("Usuario Incorrecto");
        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }


    }
}
