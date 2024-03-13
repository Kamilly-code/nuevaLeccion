package PrimeraEvaluacion.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> caracteres = new ArrayList<>();

        caracteres.add("Mercedes");
        caracteres.add("BMW");
        caracteres.add("Camaro");
        caracteres.add("Argo");
        caracteres.add("Ferrari"); //ultima insertion
        caracteres.add("Peugeot");
        caracteres.add("Golf");
        caracteres.add("Polo");

       /* Iterator<String> iterator = caracteres.iterator();
        while (iterator.hasNext()){
            String c = iterator.next();
            if (c == "Argo") {
                iterator.remove();
            }

        }
        System.out.println(caracteres);*/

        // for, foreach, iteradores.
/*
        for (String coches : caracteres) {
            System.out.println(coches);
        }
*/



        //Se int (Integer), se double (Double), se boolean (Boolean);

    }


}
