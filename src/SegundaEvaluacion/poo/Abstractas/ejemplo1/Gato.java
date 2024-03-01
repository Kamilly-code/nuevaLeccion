package SegundaEvaluacion.poo.Abstractas.ejemplo1;

public class Gato extends Mascota {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }


    //Se o método é abstrado a clase que hereda tem autotmaticamente herdar o método da outra clase, sem ser abstrata.
    @Override
    public void dice() {
        System.out.println("miau");
    }
}
