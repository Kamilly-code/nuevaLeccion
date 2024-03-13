package SegundaEvaluacion.poo.Herencia.banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // creo un cliente:
        Persona cliente1 = crearCliente();
        System.out.println(cliente1);

        //averiguo la cuenta que quiere
        int tipo = tipoCuenta();

        //saldo
        double saldo = preguntarSaldo();

        switch (tipo) {
            case 1:
                CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente1,saldo,"ES0012345678910");
            case 2:
                CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(cliente1,saldo,"ES0012345678910");
            case 3:
                CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(cliente1,saldo,"ES0012345678910");
            default:
                System.out.println("Elija otra opcion, esa es inexistente");
        }

    }

    public static Persona crearCliente () {
        System.out.println("Nombre, y apellidos y DNI, todos ellos separados por un espacio:");
        String datosPersonales = teclado.nextLine();
        String [] datos = datosPersonales.split(" ");
        System.out.println(Arrays.toString(datos));
        Persona persona = new Persona (datos[0],datos[1],datos[2],datos[3]);
        return persona;
    }

    public static int tipoCuenta () {
        System.out.println("Que tipo de conta vc quer abrir?\n1.Cuenta Ahorro.\n2.Cuenta Corriente personal.\n3.Cuenta corriente de empresa.\nElige una opcion (1-3)");
        int tipo = teclado.nextInt();teclado.nextLine();
        return tipo;
    }

    public static double preguntarSaldo () {
        System.out.println("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        return saldo;
    }

    public static int mostrarMenu () {
        int opcion = 0;
        System.out.println("1. Abrir una nueva cuenta.\n" +
                "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo\n" +
                "actual).\n" +
                "3. Obtener los datos de una cuenta concreta.Realizar un ingreso en una cuenta.\n" +
                "4. Retirar efectivo de una cuenta.\n" +
                "5. Consultar el saldo actual de una cuenta.\n" +
                "6. Salir de la aplicación.Elija una opción");
        opcion = teclado.nextInt();teclado.nextLine();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:

        }
        return 0;
    }
}
