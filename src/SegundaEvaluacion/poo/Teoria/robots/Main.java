package SegundaEvaluacion.poo.Teoria.robots;

public class Main {
    public static void main(String[] args) {
        Robots robo1 = new Robots();
        System.out.println(robo1); //Robots{nombre='Anónimo', modelo='Desconocido', duracion=0}. Nao pode acrescentar nada, ja tem valor automatico

        // Com os 3 parametros
        Robots roboCOn3 = new Robots("Mazinger","Z",20000);
        System.out.println(roboCOn3);

        // COM OS 2 PARAMETROS
        Robots roboCon2 = new Robots("Monique","Xiaomi");
        System.out.println(roboCon2); // Os 20 de duración viene por defecto.
    }
}
