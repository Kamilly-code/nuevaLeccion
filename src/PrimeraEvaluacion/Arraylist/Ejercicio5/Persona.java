package PrimeraEvaluacion.Arraylist.Ejercicio5;

public class Persona {
    private String nombre, apellido1 , apellido2;
    private char genero;
    private int edad;

    public Persona(String nombre, String apellido1, String apellido2, char genero, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrar () {

        System.out.println("nome:" +this.getNombre());
        System.out.println("genero:"+this.getGenero());
        System.out.println("edad:"+this.getEdad());
    }

}
