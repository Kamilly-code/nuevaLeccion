package SegundaEvaluacion.colecciones.HashMap.EjercicioTeste;

public class Boneca {
    public String nome;
    public String pertenecer;
    public int edad;

    public Boneca(String nome, String pertenecer, int edad) {
        this.nome = nome;
        this.pertenecer = pertenecer;
        this.edad = edad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPertenecer() {
        return pertenecer;
    }

    public void setPertenecer(String pertenecer) {
        this.pertenecer = pertenecer;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Boneca{" +
                "nome='" + nome + '\'' +
                ", pertenecer='" + pertenecer + '\'' +
                ", edad=" + edad +
                '}';
    }

}
