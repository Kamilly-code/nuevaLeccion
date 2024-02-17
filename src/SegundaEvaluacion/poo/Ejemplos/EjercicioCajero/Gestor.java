package SegundaEvaluacion.poo.Ejemplos.EjercicioCajero;

public class Gestor {
    //Atributos
    private String nombre;
    private int teléfono;
    private double importeMáximo;

    // Constructores
    public Gestor(String nombre, int teléfono, double importeMáximo) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.importeMáximo = 10000;
    }
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public double getImporteMáximo() {
        return importeMáximo;
    }

    public void setImporteMáximo(double importeMáximo) {
        this.importeMáximo = importeMáximo;
    }

    //toString

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", teléfono=" + teléfono +
                ", importeMáximo=" + importeMáximo +
                '}';
    }
    // Métodos:

    // MODIFICAR
    public void tineCuenta () {
        System.out.printf("Nombre del gestor: %s", nombre);
        System.out.printf("Nombre del gestor: %s", teléfono );
    }

}
