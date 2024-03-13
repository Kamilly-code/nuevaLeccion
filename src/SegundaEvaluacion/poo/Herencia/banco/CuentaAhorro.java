package SegundaEvaluacion.poo.Herencia.banco;

public class CuentaAhorro extends Cuenta_Bancaria{
    //Tipo de interés anual (si se trata de una cuenta de ahorro).
    double tia;

    public CuentaAhorro(Persona titular, double saldo, String iban) {
        super(titular, saldo, iban, true);
    }
    // no puede tener descubierto
}
