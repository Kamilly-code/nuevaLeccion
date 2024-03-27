package Teoria.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Empleado {
    public Empleado (String n){
        this.nombre = n;
        this.sueldo = 2000;
    }

    private String nombre;
    private double sueldo;

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

}

class pruebaMapas {
    public static void main(String[] args) {
        HashMap<String,Empleado> personal = new HashMap<>();
        Empleado empleado1 = new Empleado("Alessandra");
        personal.put("145",empleado1);
        personal.put("146", new Empleado("Andrew"));
        personal.put("147", new Empleado("Rafinha"));
        personal.put("148",new Empleado("Joaquina"));

        for (Map.Entry<String,Empleado> cadaUno : personal.entrySet()){
            System.out.println(cadaUno);
        }
        System.out.println("Ahora removemos");
        personal.remove("147");

        for (Map.Entry<String,Empleado> cadaUno : personal.entrySet()){
            System.out.println(cadaUno);
        }
        System.out.println("Reemplazamos el valor al sobreescribirlo");
        personal.put("148",new Empleado("Natalia"));

        for (Map.Entry<String,Empleado> cadaUno: personal.entrySet()){
            System.out.println(cadaUno);
            //retorna una vista de todo lo que contiene el mapa
        }

        // personal.put("145", new Empleado("Alessandra"))


    }

}
