package SegundaEvaluacion.poo.Abstractas.ejercicio2;

public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + " , " + y + ")";
    }

}
