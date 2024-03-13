package SegundaEvaluacion.examen.Iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//
//Escribe el método estático duplicate() que recibe una lista genérica list y devuelve una nueva lista con todos los elementos de list duplicados. Por ejemplo, si la lista de entrada es: [1, 2, 3], la salida sería: [1, 1, 2, 2, 3, 3].
public class Main {
   public static Scanner teclado = new Scanner(System.in);

    public static ArrayList duplicate (ArrayList<Integer> listaGenerica){
        int listaNumero = teclado.nextInt();
     listaGenerica = new ArrayList<>();

     while (listaNumero != -99){
         System.out.println("Escribe otro numero");
         listaGenerica.add(listaNumero);
         listaNumero = teclado.nextInt();
     }



        Iterator<Integer> iterador = listaGenerica.iterator();
        while (iterador.hasNext()) {
           listaGenerica.iterator();

        }

        return null;
    }
    public static void main(String[] args) {



    }
}
