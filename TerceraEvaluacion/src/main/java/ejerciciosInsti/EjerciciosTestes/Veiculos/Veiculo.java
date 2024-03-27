package ejerciciosInsti.EjerciciosTestes.Veiculos;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }

    public void exibirDatos() {
        System.out.println(toString());
    }


}
