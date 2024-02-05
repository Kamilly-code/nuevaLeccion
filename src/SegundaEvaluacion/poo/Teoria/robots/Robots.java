package SegundaEvaluacion.poo.Teoria.robots;

public class Robots {
    private String nombre;
    private String modelo;
    private int duracion;

    //constructor
    // 1ª Sin parámetros
    public Robots() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";

    }

    public Robots(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    public Robots(String nombre, String modelo) {
      //  this.nombre = nombre; Esso nao faz falta, porque estamos chamando outros valores
      //  this.modelo = modelo;

        this(nombre,modelo,20); //Chamamos o constructor de 3 parametros
    }

    // toString


    @Override
    public String toString() {
        return "Robots{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
