package PrimeraEvaluacion.If;

import java.util.Scanner;

//4.	Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "Kamilly";
        String contraseña = "Naosei123";

        System.out.println("Escriba tu nombre de usuario:");
        String user = teclado.next();
        System.out.println("Escriba tu contraseña:");
        String password = teclado.next();

        // && = E/Y/AND
        // || = OU/O/OR

        /*
        Es igual ==

        Es distinto !=

        Menor < ,
        menor o igual <= ,
        mayor >,
        mayor o igual >=

        Operador and (y) &&

        Operador or (o) ||

        Operador not (no) !
         */

        if (user.equals(usuario) && contraseña.equals(password)) {
            System.out.println("Has entrado al sistema");
        } else  { //en caso contrario
            System.out.println("Usuario y/o contraseña son incorrectos");
        }
    }
}
