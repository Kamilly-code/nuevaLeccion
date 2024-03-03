package SegundaEvaluacion.POO_EU.Objetos1;

import SegundaEvaluacion.POO_EU.Objetos1.Caneta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Caneta 1");
        Caneta c1 = new Caneta();
        c1.cor = "Azul"; //INSTANCIANDO ATRIBUTO
        c1.ponta = 0.5f;
        c1.tampar(); // o tampar tampe sozinho
        c1.status(); //INSTANCIANDO MÉTODO
        c1.rabiscar();
        System.out.println("\n\n");


        System.out.println("Caneta 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Stabilo";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
