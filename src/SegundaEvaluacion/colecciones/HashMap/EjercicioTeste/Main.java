package SegundaEvaluacion.colecciones.HashMap.EjercicioTeste;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Boneca boneca1 = crearBoneca("Jana","Gab",201);
        System.out.println(boneca1);
    }

    public static Boneca crearBoneca (String nome, String per, int edad) {
        Boneca boneca = new Boneca(nome,per,edad);
        return boneca;
    }
}
