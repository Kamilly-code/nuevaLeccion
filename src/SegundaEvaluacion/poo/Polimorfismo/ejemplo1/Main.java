package SegundaEvaluacion.poo.Polimorfismo.ejemplo1;

import java.util.ArrayList;

public class Main {
    AnimalMitologico animalMitologico = new AnimalMitologico();
   // animalMitologico1.saludar;
    // superclasse = new subclase

    AnimalMitologico quimera = new Quimera();

     //Quimera animal = (Quimera) new AnimalMitologico();
    // subclase = new superclase -> esto no funciona. (Salvo que hagamos un casting)
    AnimalMitologico dragon = new Dragon();

    ArrayList<AnimalMitologico> animalMitologicos = new ArrayList<>();
   // animalMitologicos.add(animalMitologico);

}
