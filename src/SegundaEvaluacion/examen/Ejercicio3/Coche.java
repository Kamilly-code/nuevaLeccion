package SegundaEvaluacion.examen.Ejercicio3;

public abstract class Coche extends Vehículo{
    private int numPuertas;

    public Coche(String matricula) {
        super(matricula);
        System.out.println("Se ha creado el vehículo con mátricula: "+matricula);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula "+getMatricula()+" va a "+velocidad+" km/h. Tiene"+numPuertas+"puertas.";
    }

}
