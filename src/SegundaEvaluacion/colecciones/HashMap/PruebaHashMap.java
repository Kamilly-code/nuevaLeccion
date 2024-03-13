package SegundaEvaluacion.colecciones.HashMap;

import java.util.HashMap;

public class PruebaHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(1,"Kamilly");
        mapaEmpleados.put(2,"Jhuly");
        mapaEmpleados.put(3,"Pedro(Pai)");
        mapaEmpleados.put(4,"Pedro Junior");
        mapaEmpleados.put(5,"Vania");
        mapaEmpleados.put(6,"Vovó linda");
        mapaEmpleados.put(7,"Vovô maravilhoso");

        boolean estasOno = mapaEmpleados.containsKey(2);
        boolean estasOvalue = mapaEmpleados.containsValue("kamilly");
        System.out.println(estasOno);

        /*if (estasOvalue == true) {
            System.out.println("la clave está");
        }else {
            System.out.println("la clave no está");
        }*/
        String nombre = mapaEmpleados.get(7);
        System.out.println("El empleado buscado es: " +nombre);
        mapaEmpleados.remove(1);

        for (int key : mapaEmpleados.keySet()) {
            System.out.println(key);
        }

        for (String values: mapaEmpleados.values()) {
            System.out.println(values);
        }

    }
}
