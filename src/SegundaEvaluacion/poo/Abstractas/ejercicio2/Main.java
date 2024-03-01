package SegundaEvaluacion.poo.Abstractas.ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // creamos cuatro puntos
        Punto A = new Punto(4,4);
        System.out.println(A);

        Punto B = new Punto(10,4);
        System.out.println(B);

        Punto C = new Punto(4,0);
        System.out.println(C);

        Punto D = new Punto(10,0);
        System.out.println(D);

        // crear líneas
        Línea AB = new Línea(A,B);
        System.out.println(AB);
        AB.dibujarLinea();

       Línea BC = new Línea(B,C);
        System.out.println(BC);
        BC.dibujarLinea();

        Línea BD = new Línea(B,D);
        System.out.println(BD);
        BD.dibujarLinea();

        Línea CD = new Línea(C,D);
        System.out.println(CD);
        CD.dibujarLinea();

        Línea AC = new Línea(A,C);
        System.out.println(AC);
        AC.dibujarLinea();

        //intento hacer un objeto a partir de la clase abstracta Figura 2D

        // creamos un rectangulo con el segundo constructor
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(A);
        puntos.add(B);
        puntos.add(C);
        puntos.add(D);

        Rectángulo rectángulo = new Rectángulo(puntos);
        System.out.println(rectángulo);



    }
}
