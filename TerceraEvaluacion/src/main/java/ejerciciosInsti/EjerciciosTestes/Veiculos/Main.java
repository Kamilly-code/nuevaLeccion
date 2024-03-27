package ejerciciosInsti.EjerciciosTestes.Veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Onibus("Kami123",2004,100);
        veiculo1.exibirDatos();
        System.out.println();
        Veiculo veiculo2 = new Caminhao("jkp123",2001,5);
        veiculo2.exibirDatos();
    }
}
