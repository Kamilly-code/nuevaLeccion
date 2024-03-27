package ejerciciosInsti.EjerciciosTestes.Figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    double area (){
        return base*altura/2;
    }

    @Override
    public String toString() {
        return "TRIANGULO: \nAltura: "+getAltura()+"\nBase del triangulo: "+getBase()+"\nArea: "+area()+"\nColor: "+getCor();
    }
}
