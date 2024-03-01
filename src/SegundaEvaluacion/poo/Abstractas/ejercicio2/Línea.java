package SegundaEvaluacion.poo.Abstractas.ejercicio2;

public class Línea {
    final int DIMENSIONES = 1;
    Punto puntoInicio;
    Punto puntoFin;

    public Línea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
      //  this.DIMENSIONES= 2;
    }

    public double calcularLongitud(){
        double calculoDistanciaEntrePuntos = Math.sqrt(Math.pow(puntoFin.x - puntoInicio.x, 2 ) + Math.pow(puntoFin.y - puntoInicio.y, 2));
        return calculoDistanciaEntrePuntos;
    }

    public void dibujarLinea () {
        int logintud = (int) this.calcularLongitud(); //forzar a um inteiro

        for (int i = 0; i < logintud ; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return puntoInicio + " - " + puntoFin + " longitud: " +this.calcularLongitud();
    }
}
