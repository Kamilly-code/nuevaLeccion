package solamente.teste2;

import java.util.Scanner;

public class Usuario2 {
    //2.- Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es mayor o menor de edad.
    //ATRIBUTOS
    public static Scanner teclado = new Scanner(System.in);
    public String nombre;
    public int edad;

    //MÉTODOS


    @Override
    public String toString() {
        return "Usuario2{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void pedindoDatos (){
        System.out.println("Introduzca tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduzca tu edad: ");
        edad = teclado.nextInt();
        System.out.println(toString());
        if (edad < 18){
            System.out.println("ERES MENOR DE EDAD, no puedes entrar hasta completar 18");
        } else if (edad >= 18){
            System.out.println("Entra aí meu comparça(minha comparça)");
        }
    }

    public static void main(String[] args) {
        Usuario2 usuario2 = new Usuario2();
        usuario2.pedindoDatos();



    }

}
