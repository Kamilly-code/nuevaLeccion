package SegundaEvaluacion.examen.Ejercicio3;

public class CocheManual extends Coche{
    private int marcha;

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public CocheManual(String matricula) {
        super(matricula);
        this.marcha = 0;
    }

    public void acelerar(int v) {
        velocidad = this.velocidad + v;
        System.out.println("acelerando");
        cambiarMarcha(v);
        System.out.println(toString());


    }
    public void frenar (int v) {
        velocidad = this.velocidad - v;
        if (velocidad <= 0) {
            this.velocidad = 0;
        }
        System.out.println("frenando");
        cambiarMarcha(v);
        System.out.println(toString());

    }
    public void cambiarMarcha (int velocidad) {
        if (velocidad < 10) {
            this.marcha = 1;
        } else if (velocidad >= 10 && 30 <= velocidad) {
            this.marcha = 2;
        } else if (velocidad >= 31 && 50 <= velocidad) {
            this.marcha = 3;
        } else if (velocidad >= 51 && 80 <= velocidad) {
            this.marcha = 4;
        } else if (velocidad > 80) {
            this.marcha = 5;
        }
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula "+getMatricula()+" va a "+velocidad+" km/h. Tiene "+getNumPuertas()+" puertas.\nCOCHE MANUAL";
    }
}


