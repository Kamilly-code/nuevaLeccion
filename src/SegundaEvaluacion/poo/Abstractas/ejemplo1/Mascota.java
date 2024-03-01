package SegundaEvaluacion.poo.Abstractas.ejemplo1;

public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //método abstracto: no lo desenvolvemos aqui só deixamos ele declarado, mas toas as subclases deverán ser desenvolvidas
    public abstract void dice();
    //public abstract String camina();
}
