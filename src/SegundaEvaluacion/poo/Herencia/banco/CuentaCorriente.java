package SegundaEvaluacion.poo.Herencia.banco;

import java.util.ArrayList;

public class CuentaCorriente extends Cuenta_Bancaria{
    ArrayList<String> entidades;

    public CuentaCorriente(Persona titular, double saldo, String iban) {
        super(titular, saldo, iban,false);
    }
}
