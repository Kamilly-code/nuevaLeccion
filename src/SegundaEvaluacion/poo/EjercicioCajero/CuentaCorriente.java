package SegundaEvaluacion.poo.EjercicioCajero;

import java.util.Scanner;

/*
* Crea un paquete cajero, con las siguientes clases:
CuentaCorriente, que almacena los datos: DNI, nombre del titular y saldo.
Las operaciones típicas con una cuenta corriente son:
Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
Ingresar dinero: se incrementa el saldo.
Mostrar información: muestra la información disponible de la cuenta corriente.
*/
public class CuentaCorriente { //Operacion:es un método

    // Atributos
    private String dni;
    private String nombreTitular;
    private double saldo;

    private Gestor gestor; //

    // Constructor

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0; //Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
    }

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    // Getter o Setters

    // toString

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacarDinero () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad a retirar");
        int retirada = teclado.nextInt();

        //Temos que ver se a conta tem saldo suficiente:
        if (saldo >= retirada) {
            saldo = saldo - retirada;
            System.out.println("Nuevo saldo:" +saldo);
        } else {
            System.out.println("Sentimos, pero el valor requerido no es correspondiente al valor que tiene en tu cuenta.");
        }
    }
    public void ingresarDinero () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad a ingresar:");
        int ingreso = teclado.nextInt(); teclado.nextLine();
        if (ingreso>5){
            saldo = saldo + ingreso;
            System.out.println("Nuevo saldo:" +saldo);
        } else {
            System.out.println("No puede ser");
        }
    }
    public void actualizarLibreta () {
        System.out.println("Títular: " +nombreTitular);
        System.out.println("Saldo: " +saldo);
        System.out.println("*** Libreta actualizada ***");
    }
}
