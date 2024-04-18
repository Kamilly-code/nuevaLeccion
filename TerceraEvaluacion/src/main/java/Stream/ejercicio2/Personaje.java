package Stream.ejercicio2;

public class Personaje {
    private String nombre;
    private int edad;
    Arma arma;
    private boolean esHumano;

    public Personaje(String nombre, int edad, Arma arma, boolean esHumano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.esHumano = esHumano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public boolean isEsHumano(boolean b) {
        return esHumano;
    }

    public void setEsHumano(boolean esHumano) {
        this.esHumano = esHumano;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", arma=" + arma +
                ", esHumano=" + esHumano +
                '}';
    }
}
