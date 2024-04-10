package Lambda.ejercicio02;

import java.util.Arrays;

public class Paciente {
    String nombre;
    int edad;
    String[] síntomas;

    // Constructor sin parámetros
    public Paciente(){
        this.nombre = "Desconocido";
        this.edad = 999;
        this.síntomas = new String[]{"Ninguno"};
    }
    // Constructor con parámetros
    public Paciente(String nombre, int edad, String[] síntomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.síntomas = síntomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.equals(null)){
            this.nombre = nombre;
        }
    }

    public int getEdad() {	return edad;	}

    public void setEdad(int edad) {	this.edad = edad;    }

    public String[] getSíntomas() {	return síntomas;	    }

    public void setSíntomas(String[] síntomas) {
        this.síntomas = síntomas;
    }

    @Override
    public String toString() {
        return nombre+ "|" +edad +"|"+ Arrays.toString(síntomas)+"\n";
    }
}

