package ejerciciosInsti.EjerciciosTestes.Veiculos;

public class Onibus extends Veiculo {
    private int asientos;

    public Onibus(String placa, int ano, int asientos) {
        super(placa, ano);
        this.asientos = asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "asientos=" + asientos +
                '}';
    }

    @Override
    public void exibirDatos() {
        super.exibirDatos();
    }
}
