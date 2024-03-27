package solamente.teste8FAILED;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colegio {
    //Atributos
    static Scanner teclado = new Scanner(System.in);

    private HashMap<String,Alumno> mapa;
    private int contador;

    //Constructor

    public Colegio() {
        this.mapa = new HashMap<>();
    }

    // Métodos
    public void addAlumno (String nacionalidad){
        if (!mapa.containsKey(nacionalidad)){
            contador++;

            System.out.println("Escriba el nombre del alumno que deseas adicionar: ");
           String nombre1 = teclado.nextLine();

            System.out.println("Escriba el apellido del alumno que deseas adicionar: ");
           String apellido1 = teclado.nextLine();
            System.out.println("Escriba cuál será el codigo del nuevo alumno");
            int codigo = teclado.nextInt();teclado.nextLine();

            Alumno alumno1 = new Alumno(nombre1,apellido1,codigo);
            mapa.put(nacionalidad,alumno1);

        }
    }

    public void showAll (String nacionalidad){
        int contador = 0;
        for (Map.Entry<String,Alumno> nacionalidades : mapa.entrySet() ){
            String naci = nacionalidades.getKey();
            if (nacionalidad.equals(naci)){
                contador++;
                System.out.println(nacionalidades.getKey()+ "\n"+nacionalidades.getValue());

            }
        }
    }

}
