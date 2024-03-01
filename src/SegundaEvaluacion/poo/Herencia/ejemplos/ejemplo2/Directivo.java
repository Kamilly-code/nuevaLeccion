package SegundaEvaluacion.poo.Herencia.ejemplos.ejemplo2;

import java.time.LocalDate;
import java.util.Scanner;

public class Directivo extends Empleado {
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechanacimiento, double sueldoBruto, Categoria categoria) {
        super(nombre, fechanacimiento, sueldoBruto);
        this.categoria = categoria;
    }



    @Override
    public void mostrar() {
        System.out.println("\n\n\"DATOS DEL DIRECTIVO:");
        super.mostrar();
        System.out.println(this.toString());
    }

    // LOS DIRECTIVOS COBRAN UN PLUS POR EL HECHO DE SERLO, ADEMÁS...
    public void asignarPlus () {
        double plus = pedirPlus();
        sueldoBruto = sueldoBruto + plus;
    }

    //PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE)
    public double pedirPlus () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce plus: ");
        double plus = teclado.nextDouble();
        return plus;
        /*
        * return teclado.nextDOuble ();*/
    }

    @Override
    public double calcularSalarioNeto() {
        double salarioNeto = sueldoBruto * 5 /100;
        return salarioNeto;
    }
}
