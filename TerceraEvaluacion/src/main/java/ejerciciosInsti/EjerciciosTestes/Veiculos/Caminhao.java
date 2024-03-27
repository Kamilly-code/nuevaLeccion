package ejerciciosInsti.EjerciciosTestes.Veiculos;

public class Caminhao extends Veiculo {
private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "eixos=" + eixos +
                '}';
    }

    @Override
    public void exibirDatos() {
        System.out.println(toString());
    }

}
