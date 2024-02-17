package SegundaEvaluacion.poo.Ejemplos.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Una instancia (un objeto) de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
        Usuario1 propietario = new Usuario1("deli", "Ale", "Chim Pom");
        //Una instancia de la clase Cuenta (“123456”, 1000, propietario).
        Cuenta cuenta = new Cuenta("123456", 1000,propietario);

        //System.out.println(cuenta);
        mostrarCuenta(cuenta);




    }
    //Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
    public static void mostrarCuenta ( Cuenta cuenta ) { /*Quando nao devolve nada: void*/
        System.out.println(cuenta);
    }
}
