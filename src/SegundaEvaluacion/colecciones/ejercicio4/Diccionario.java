package SegundaEvaluacion.colecciones.ejercicio4;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }


    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }


    public void nuevoPar (String español, String inglés) {
        diccionario.put(español,inglés); /*español como clave:*/
    }

    public String traducaoIngles (String español) { // Cierto
        return diccionario.get(español);
    }

    // Provamos o método que traduce

    public String palabraAleatoria () {
        // necesitamos saber cuantos pares hay
      int tamaño =  diccionario.size();
      //  System.out.println(indice);
        // generamos un número aleatorio entre 0 y el índice de
        Random generador = new Random();
        int indice = generador.nextInt(0,tamaño);
      String español = (String) diccionario.keySet().toArray()[indice];
        return español;
    }

    public  String primeraLetraTraduccion ( String español ) {

        return diccionario.get(español).substring(0,1);
    }


}
