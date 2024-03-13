package SegundaEvaluacion.poo.Libreria;

public class Editorial  {
    int idEditorial;
    String nombre;

    public Editorial() {
    }

    public Editorial(int idEditorial, String nombre) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return (this.idEditorial+" "+this.nombre);
    }

}
