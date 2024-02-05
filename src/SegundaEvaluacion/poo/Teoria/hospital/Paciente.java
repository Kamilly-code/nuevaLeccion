package SegundaEvaluacion.poo.Teoria.hospital;

import java.util.Arrays;

public class Paciente {
    // atributos
    private String nombre;
    private int edad; //Tanto faz colocar Integer, ou int
    private  String [] sintomas;

    // constructores

    public Paciente() { /*Sobrecarga de constructores, pq temos vários, um ou mais constructores cada um com diferentes valores de parametros.*/
    }

    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }

    // 3 ) Quiero un constructor para cuando tenga que crear un objeto de tipo paciente y solamente sepa el nombre.

    public Paciente(String nombre) {
        this.nombre = nombre;
        // además le puedo indicar valores para los otros parámetros
        //si no sé la edad, que valga 999 por defecto
        this.edad = 999; // automaticamenteee;
        this.sintomas = new String[] {"Desconocido"}; //New String sempre, ja que nao tinhamos inicializado o String
    }


    // getters y setters


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

    public String[] getSintomas(String[] strings) {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }


    // toString

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sintomas=" + Arrays.toString(sintomas) + //Já coloca o Arrays.toString para conseguirmos visualizarlo
                '}';
    }


    // métodos de usuario



}
