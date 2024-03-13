package SegundaEvaluacion.examen.Ejercicio3;

public class CochesAutomático extends Coche{
    public CochesAutomático(String matricula) {
        super(matricula);
    }

    public void acelerar(int v) {
        velocidad = this.velocidad + v;
        System.out.println("acelerando");
        System.out.println(toString());

    }
    public void frenar (int v) {
        velocidad = this.velocidad - v;
        if (velocidad <= 0) {
            this.velocidad = 0;
        }
        System.out.println("frenando");
        System.out.println(toString());
    }

    @Override
    public  String toString() {
        return "El vehículo con matrícula "+getMatricula()+" va a "+velocidad+" km/h. Tiene "+getNumPuertas()+" puertas.\nCOCHE AUTOMÁTICO";
    }

    //MÉTODOS DE ESA CLASE


}
