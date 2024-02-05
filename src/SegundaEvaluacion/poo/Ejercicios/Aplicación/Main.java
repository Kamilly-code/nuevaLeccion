package SegundaEvaluacion.poo.Ejercicios.Aplicación;

import SegundaEvaluacion.poo.Ejercicio3.Usuario1;

import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Usuario kamilly=crearUsuario();
     //   Usuario joao = new Usuario("Ca", "Jan", "KSjs13335");
        System.out.println(kamilly);

        kamilly.setEstado(Estado.ACTIVO); // get: me da o vamos / set: posso mudar o valor
        System.out.println(kamilly.getEstado());


        //Ahora probaremos.
        kamilly.mensajeEstado();

    }

    public static Usuario crearUsuario ( ) {
        System.out.println("Elija un nombre de usuario");
        String username = teclado.nextLine();

        System.out.println("Escriba tu email");
        String email = teclado.nextLine();

        System.out.println("Escriba tu contraseña");
        String password = teclado.nextLine();

        Usuario user = new Usuario (username,email,password);


        return user;
    }

}

