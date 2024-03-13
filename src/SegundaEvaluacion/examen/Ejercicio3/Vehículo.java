package SegundaEvaluacion.examen.Ejercicio3;

public abstract class Vehículo {
    //ATRIBUTOS
    private String matricula;
    protected int velocidad;

    public Vehículo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula "+matricula+" va a "+velocidad+" km/h.";
    }
}
