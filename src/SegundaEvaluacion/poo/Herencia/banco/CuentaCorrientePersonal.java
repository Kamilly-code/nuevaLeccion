package SegundaEvaluacion.poo.Herencia.banco;

public class CuentaCorrientePersonal extends CuentaCorriente {
    double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String iban) {
        super(titular, saldo, iban);
    }

    //no permire tener descubiertos;

}
