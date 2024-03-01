package SegundaEvaluacion.eletrodomesticos;

public class Electrodoméstico {
    protected String tipo;
    protected  String marca;
    protected Double potenciaConsumo;

    public Electrodoméstico(String tipo, String marca, Double potenciaConsumo) {
        this.tipo = tipo;
        this.marca = marca;
        this.potenciaConsumo = potenciaConsumo;


    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPotenciaConsumo() {
        return potenciaConsumo;
    }

    public void setPotenciaConsumo(Double potenciaConsumo) {
        this.potenciaConsumo = potenciaConsumo;
    }

    @Override
    public String toString() {
        return "electrodoméstico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potenciaConsumo=" + potenciaConsumo +
                '}';
    }



    //métodos

    public double getConsumo (int horas) { // Quantidade de kw que consume por hora, o eletrodomestico (Que gastou).

        double consumoTotal = horas * potenciaConsumo;

        return consumoTotal;
    }

    public double getCosteConsumo (int horas, double costeHora ) { // Seria o preço desse consumo.

        double costeTotal = getConsumo(horas) * costeHora;

        return costeTotal;

    }

}
