package SegundaEvaluacion.examen.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        CochesAutomático carro1 = new CochesAutomático("123K");
        carro1.acelerar(12);
        CocheManual carro2 = new CocheManual("AUTO001");
        CocheManual carro3 = new CocheManual("MAN0001");
        carro2.setNumPuertas(2);
        carro3.setNumPuertas(4);
        carro2.acelerar(20);
        carro3.acelerar(20);


       while (carro3.velocidad < 100) {
           carro3.acelerar(10);
       }
       carro3.frenar(carro3.velocidad);






    }
}
