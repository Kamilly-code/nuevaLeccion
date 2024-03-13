package SegundaEvaluacion.poo.Herencia.banco;

public class CuentaCorrienteEmpresa  extends CuentaCorriente{
    //El tipo de interés es el precio del dinero, esto es, lo que se paga por emplear una cantidad de dinero durante un plazo determinado. En la práctica, el tipo o tasa de interés es el porcentaje que se abona por pedir prestado dinero o el que se recibe por invertir un capital o por mantenerlo en un depósito bancario. Se calcula como un porcentaje sobre la cantidad prestada, invertida o depositada.
    double tipoInteresDescubierto;
    double maxDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String iban) {
        super(titular, saldo, iban);
    }
}
