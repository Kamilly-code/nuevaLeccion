package PrimeraEvaluacion.Arraylist.Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            int cantidadPersonas = 5;
            List<Persona> personas = new ArrayList<>();

            for (int i = 0; i < cantidadPersonas; i++) {
                Scanner lectura = new Scanner (System.in);
                System.out.println("Ingrese los datos de la persona "+(i+1)+":");
                System.out.println("Nombre: ");
                String nombre = lectura.next();
                System.out.println("Apellido: ");
                String apellido = lectura.next();
                System.out.println("Genero (M/F): ");
                String genero = lectura.next().toUpperCase();
                System.out.println("Edad: ");
                int edad = lectura.nextInt();
                System.out.println("\n");

                Persona personaIngresada = new Persona(nombre,apellido,genero,edad);
                personas.add(personaIngresada);
            }

            retornarNombreGenero(personas);
            retornarPromedioEdades(personas);
            retornarPersonasMasculinas(personas);
            retornarPersonasFemeninas(personas);

        }

        public static void retornarNombreGenero(List<Persona> personas) {
            for (int i = 0; i < personas.size(); i++) {
                System.out.println("Persona "+(i+1)+" --> Nombre: "+personas.get(i).getNombre()+" "+personas.get(i).getApellido()+", Género:"+personas.get(i).getGenero());
            }
        }

        public static void retornarPromedioEdades(List<Persona> personas){

            double sumaEdades = 0.0;
            for (int i = 0; i < personas.size(); i++) {
                sumaEdades = sumaEdades + (double) personas.get(i).getEdad();
            }

            double promedio =  sumaEdades / personas.size();
            System.out.println("El promedio de las edades es: "+promedio);
        }

        public static void retornarPersonasMasculinas(List<Persona> personas){
            int cantidadMasculino = 0;
            for (int i = 0; i < personas.size(); i++) {
                if(personas.get(i).getGenero().equals("M")){
                    cantidadMasculino = cantidadMasculino + 1;
                }
            }

            System.out.println("La cantidad de personas masculinas es: "+cantidadMasculino);
        }

        public static void retornarPersonasFemeninas(List<Persona> personas){
            int cantidadFemenino = 0;
            for (int i = 0; i < personas.size(); i++) {
                if(personas.get(i).getGenero().equals("F")){
                    cantidadFemenino = cantidadFemenino + 1;
                }
            }

            System.out.println("La cantidad de personas femeninas es: "+cantidadFemenino);
        }
    }

