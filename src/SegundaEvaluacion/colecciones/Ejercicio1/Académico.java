package SegundaEvaluacion.colecciones.Ejercicio1;

public class Académico {
    // Atributos

    public String nombre;
    public int añoIngreso;

    // constructor

    public Académico(String nombre, int añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    // toString

    @Override
    public String toString() {
        return "Académico{" +
                "nombre='" + nombre + '\'' +
                ", añoIngreso=" + añoIngreso +
                '}';
    }

    // Métodos

}
