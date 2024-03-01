package SegundaEvaluacion.eletrodomesticos;

public class Lavadora extends Electrodoméstico{
    private double precio;
    private boolean aguaCaliente;


    public Lavadora(String marca, Double potenciaConsumo) {
        super("Lavadora", marca, potenciaConsumo);
        this.aguaCaliente = false;
        precio = 0;
    }

    public Lavadora(String marca, Double potenciaConsumo, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potenciaConsumo);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potenciaConsumo=" + potenciaConsumo +
                '}';
    }


    // métodos
    public double getConsumo (int horas) {
        if (aguaCaliente == false ) {
          double consumoFrio =  horas * potenciaConsumo;
          return consumoFrio;
        } else {
            double consumoCaliente = horas * (potenciaConsumo + potenciaConsumo * 0.20);
            return consumoCaliente;
        }
    }

    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }

}
