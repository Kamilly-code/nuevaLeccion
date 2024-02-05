package SegundaEvaluacion.deLosVideosJava;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    // Atributos
   private String id, nombre, apellido, fechaNacimiento, direccion, telefono, email;
   private List<String> cursosinscritos = new ArrayList<>(); // Para hacer la instancia en el método.

    private Colegio colegio; // Campo encapsulado;

   // Constructores
    public Estudiante(String nombre, String apellido, String fechaNacimiento, String direccion, String telefono, String email, Colegio colegio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.colegio = colegio;
    }

    // Getters y setters

    public void setDatosContacto (String direccion, String telefono, String email) { // A diferencia del get, el set no retorna nada porque es la configuración, sirve para sí queremos cambiar después los datos.
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDatosContacto () { // Get retorna por el significado de la palabra get:pegar/obtener
        return "ID: " +id+ "Nombre: " +nombre + apellido+ "Fecha de nacimiento" +fechaNacimiento+ "Dirección" +direccion+ "Teléfono" +telefono+ "Email: " +email ;
    }

    // Métodos
    public void inscribirCurso (String curso) { // Son de tipos void, para indicar que el método no retornará ningún valor
    if (colegio.obtenerCurso().contains(curso)) {
        cursosinscritos.add(curso);
    }else {
        System.out.println("El curso no se imparte en el colegio");
    }
    }
    public void abandonarCurso () {

    }
    public int obtenerEdad ()  { //Aquí sería diferente porque queremos que retorne algo, que sería la edad

        return 0; // Con eso siempre adicionamos el return, y retorna la variable que ponemos en el método
    }

    public List<String> obtenerCursosInscritos () {

        return cursosinscritos;
    }


}
