package ejerciciosInsti.EjerciciosTestes.Figuras;

public abstract class Figura {
    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

}
