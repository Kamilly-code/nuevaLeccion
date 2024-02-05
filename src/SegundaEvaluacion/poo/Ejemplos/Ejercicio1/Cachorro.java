package SegundaEvaluacion.poo.Ejemplos.Ejercicio1;

public class Cachorro {
    //Atributos só dizem se sao private, public
    private String nome;
    private int peso; // ou double
    private String corOlhos;
    private int quantPatas;

    int tamaño;

    // Constructor


    public Cachorro(String nome, int peso, String corOlhos, int quantPatas, int tamaño) {
        this.nome = nome;
        this.peso = peso;
        this.corOlhos = corOlhos;
        this.quantPatas = quantPatas;
        this.tamaño = tamaño;
    }

    void latir () {
        if (tamaño> 60) {
            System.out.println("Wooof, Wooof!");
        } else if (tamaño>14) {
            System.out.println("Ruff, Ruff!");
        }else {
            System.out.println("Yip!, Yip!");
        }
    }




}
