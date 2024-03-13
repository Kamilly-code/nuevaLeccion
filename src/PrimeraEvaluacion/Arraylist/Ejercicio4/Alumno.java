package PrimeraEvaluacion.Arraylist.Ejercicio4;

public class Alumno {
    private String nombre;
    private float cali;

    public Alumno(String nombre, float cali) {
        this.nombre = nombre;
        this.cali = cali;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCali() {
        return cali;
    }


    public void mostrar() {
        System.out.println("nombre Aluno:" +this.getNombre());
        System.out.println("calificacion del alumno:" +this.getCali());
    }

}
