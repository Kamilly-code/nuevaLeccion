package SegundaEvaluacion.poo.Abstractas.ejemplo1;

public class Perro extends Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("Au au");
    }
}
