package SegundaEvaluacion.poo.Abstractas.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura2D {
     int lados;
     final int DIMENSIONES = 2;

     Figura2D(int lados) {
        this.lados = lados;
    }




    // este método devolve rectangulo ou triangulo segundo o lado da figura
     public String nombreFigura() {
         if (lados == 3) {
             return "triangulo";
         } else if (lados == 4){
             return "rectangulo";
         } else {
             return "gracias por la sugerencia, añadiremos figuras " + lados + "lados en el futuro";
         }
     }

    public abstract ArrayList<Línea> crearLíneas ();

     protected abstract double calcularPerímetro ();

     protected abstract double calcularÁrea ();



}
