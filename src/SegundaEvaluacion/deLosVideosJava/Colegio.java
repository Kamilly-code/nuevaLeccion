package SegundaEvaluacion.deLosVideosJava;

import java.util.*;

public class Colegio {
    //Atributos
    private String nombre, direccion, telefono, director;
    private int capacidad;


    /*Voy a necesitar alguna estructura que almacena colecciones, por cuenta del diagrama que es de uno a varios. Para eso utilizamos ArrayList*/
    private  List<Estudiante> estudiantes = new ArrayList<>();
    private  List<String> profesores = new ArrayList<>();
    private  List<String> cursos = new ArrayList<>();


    //Constructores

    public Colegio(String nombre, String direccion, String telefono, String director, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.capacidad = capacidad;
    }

    //Getters y Setters

    public String getDatosColegio () { // Get retorna por el significado de la palabra get:pegar/obtener
        return "Nombre:" +nombre+ "Dirección" +direccion+ "Teléfono" +telefono+ "Capacidad" +capacidad+ "Director" +director;
    }
    public void setDatosColegio (String nombre, String direccion, String telefono, int capacidad, String director) { //El this diferencia los atributos a la hora de la instancia. O sea, puedo poner los mismos nombres, pero hago referencia del objeto actual al cual estoy haciendo la instancia.  This/Colegio Colegio.nombre = nombre;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.director = director;
    }


    // Métodos
    // Ponemos los métodos como hicimos en StarUml
    public void matricularEstudiante(Estudiante estudiante) {
        if(estudiantes.size()< capacidad ) {
            estudiantes.add(estudiante); /*Ponemos ese if para poner un límite de estudiante */
        } else  {
            System.out.println("Capacidad máxima alcanzada");
        }
    }
                                        //1//
    public void expulsarEstudiante (Estudiante estudiante) {
       estudiantes.remove(estudiante); // Utilizando la propiedad ArrayLIst tenemos la capacidad de add y remove, en el caso anterior adicionamos hasta la capacidad máxima, en este caso tenemos que remover, por la cuestión de la expulsión del estudiante.
    }
                                        //2//
    public void contratarProfesor (String profesor) { // Si tuviera otra clase pondríamos (Profesor profesor), pero no están esas clases en el diagrama.
        profesores.add(profesor);
    }
                                        //3//
    public void despedirProfesor (String profesor) {
        profesores.remove(profesor);
    }
                                        //4//
    public void agregarCurso (String curso) {
        cursos.add(curso);
    }
                                        //5//
    public void eliminarCurso (String curso) {
        cursos.remove(curso);
    }

    // Métodos para obtener la lista del curso
    public List<String> obtenerCurso () {
        return cursos;
    }

    // Método para matricular a un estudiante en el curso
    public void matricularEstudiante (Estudiante estudiante, String curso){
        if (estudiantes.size()<capacidad) {
            if (cursos.contains(curso)) {//Tenemos que comprobar si el curso existe para escribir el alumno/estudiante en el
                estudiante.inscribirCurso(curso);
                estudiantes.add(estudiante);
            } else {
                // en el caso de que el curso no exista
                System.out.println("El curso no se imparte en el colegio");
            }
        } else {
            System.out.println("Capacidad máxima de estudiante alcanzadas");
        }
    }




}
