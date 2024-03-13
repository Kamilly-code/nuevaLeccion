package examenSegunda.ejercicio2;

import java.time.LocalDate;
import java.util.Iterator;

/*
 * @Kamilly Brito da Mata
 * */
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(LocalDate.of(2004,02,20));
        System.out.println(empleado1);
        empleado1.aumentarSueldo(5);
        System.out.println(empleado1);
        empleado1.setFechaContrato(LocalDate.of(2001,02,01));
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado(LocalDate.of(2004,02,20));
        empleado2.getNombreCompleto();
        empleado2.setNombreCompleto("Joana Dark Monclair");
        empleado1.asignarSupervisado(empleado2);
        empleado1.mostrarDatosEmpleados();

        //PEDIDO




    }
}
