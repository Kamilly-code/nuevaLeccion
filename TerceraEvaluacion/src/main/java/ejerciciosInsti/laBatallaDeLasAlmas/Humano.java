package ejerciciosInsti.laBatallaDeLasAlmas;

import java.util.ArrayList;
import java.util.Random;

public class Humano extends Ser implements Espiritual {
    static Random generador = new Random();
    //atributos
    ArrayList<Monstros> mostros;
    private double fe;
    ArrayList<Anjos> angeles;

    public Humano(double fe) {
        this.fe = fe;
        this.angeles = new ArrayList<Anjos>();
        this.mostros = new ArrayList<Monstros>();
        añadirAnjo();
        añadirMonstro();
    }

    // métodos
    public void añadirAnjo (){
        int bondad = generador.nextInt(0,101); // min 0 max 101; siempre uno más
        Anjos anjos = new Anjos(bondad);
        angeles.add(anjos); //siempre crea al final
    }
    public  void añadirMonstro (){
        int maldad = generador.nextInt(0,101);
        Monstros monstros1 = new Monstros(maldad);
        mostros.add(monstros1);

    }
    public void rezar (){
        fe++; //Só coloca o this quando tem outro atributo com o mesmo nome na clase.
        añadirAnjo();
    }

    public void pecar (){
        fe--;
        añadirMonstro();

    }

    public double getFe() {
        return fe;
    }
    public void setFe(double fe) {
        this.fe = fe;
    }

    @Override
    public String toString() {
        String cadena = "\n\nDatos del Humano: \nFe: "+fe+ "\nEl humano tiene "+ angeles.size()+ " ángeles.\nEL humano tiene " +mostros.size()+ " monstros.";
        return cadena;
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }
}
