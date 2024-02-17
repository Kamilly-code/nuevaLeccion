package SegundaEvaluacion.poo.herencia.teoria.ejemplos.ejemplo2;

import java.time.LocalDate;

public class Empleado extends Persona {

    protected double sueldoBruto;


    public Empleado (String nombre, LocalDate fechanacimiento, double sueldoBruto) {
        super (nombre, fechanacimiento);
        if (sueldoBruto <= 0) {
            this.sueldoBruto = 15786;
        }else {
            this.sueldoBruto = sueldoBruto;
        }

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueltoBruto=" + sueldoBruto +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println("\n\n\"DATOS DEL EMPLEADO:");
        System.out.println("Esto de Persona:");
        System.out.println(super.toString());
        System.out.println("Esto de empleado:");
        System.out.println(this.toString());
        System.out.println("Sueldo neto:" + this.calcularSalarioNeto() + "$");
    }

    public double calcularSalarioNeto () {
        double salarioNeto = sueldoBruto * 15 /100;
        return salarioNeto;
    }

}
