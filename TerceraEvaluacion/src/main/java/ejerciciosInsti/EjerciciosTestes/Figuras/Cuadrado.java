package ejerciciosInsti.EjerciciosTestes.Figuras;

public class Cuadrado extends Retangulo {
    /*private double lado;

    public Cuadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }*/

    public Cuadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }

    @Override
    public String toString() {
        return "CUADRADO: \nLado1: "+getLado1()+"\nLado2: "+getLado2()+"\nArea: "+area()+"\nColor: "+getCor();
    }
}
