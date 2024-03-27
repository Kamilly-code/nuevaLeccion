package solamente.teste1;

import java.util.Scanner;

public class Usuario {
    //ATRIBUTOS
    private String nombre, apellido;
    private int edad;
    public static Scanner teclado = new Scanner(System.in);

    public Usuario (){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void pedirDatos(){
        System.out.println("Escriba tu nombre: ");
        String nombre2 = teclado.nextLine();
        System.out.println("Escriba tu apellido: ");
        String ape2 = teclado.nextLine();
        System.out.println("Escriba tu edad: ");
        int edad2 = teclado.nextInt();

       this.setNombre(nombre2);
       this.setApellido(ape2);
       this.setEdad(edad2);
    }

    public String mostrarDatos (){
        return "Nombre: " +getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
       Usuario usuario1 = new Usuario();
       usuario1.pedirDatos();
       usuario1.mostrarDatos();
        System.out.println(usuario1.mostrarDatos());
        System.out.println(usuario1);
    }



}
