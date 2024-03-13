package SegundaEvaluacion.poo.Herencia.banco;

public abstract class Cuenta_Bancaria {
    //Nao podemos criar um objeto aqui, só métodos.

    //Titular de la cuenta (un objeto de la clase Persona, la cual contendrá información
    Persona titular;

    //sobre el titular: nombre, apellidos y DNI).
    double saldo;

    //Saldo actual de la cuenta (número real).
    //Número de cuenta (IBAN).
    String iban;

    //Tipo de interés anual (si se trata de una cuenta de ahorro).

    boolean remuneradas;

    public Cuenta_Bancaria(Persona titular, double saldo, String iban, boolean remuneradas) {
        this.titular = titular;
        this.saldo = saldo;
        this.iban = iban;
        this.remuneradas = remuneradas;
    }

}
