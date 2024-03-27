package solamente.teste6;

import java.util.Scanner;

public class Ciudadano {
    //Atributos
    static Scanner teclaod = new Scanner(System.in);
    private int edad;
    private String nombre;


    public Ciudadano() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void comprovacionEdad (){
        System.out.println("¿Cuál es tu nombre?");
        this.nombre = teclaod.nextLine();
        System.out.println("¿Cuál es tu edad?");
        this.edad = teclaod.nextInt();
        if (edad < 18 ){
            System.out.println("Eres menor de edad, sal de aquí");
        } else {
            System.out.println("Entra lindona");
        }
    }

}
