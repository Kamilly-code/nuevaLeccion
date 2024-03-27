package ejerciciosInsti.EjerciciosTestes.Figuras;

public class Circulos extends Figura  {
    double raio;

    public Circulos(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public double area(){
        double calculo = Math.PI*Math.pow(raio,2);
        return calculo;
    }
    public double getDiametro(){
        return raio*2;
    }

    @Override
    public String toString() {
        return "CIRCULO\nDiametro:"+getDiametro()+"\nArea: "+area()+"\nRadio: "+this.raio+"\nColor: "+getCor();
    }


}
