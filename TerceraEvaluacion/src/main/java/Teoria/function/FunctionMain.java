package Teoria.function;

import Lambda.comparador.Persona;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<Double,Double> funçãoQuadrada = x -> Math.pow(x,2);
        Double resultado = funçãoQuadrada.apply(1.25);
        System.out.println(resultado);

        List<Persona> pessoas = new ArrayList<>();
        Persona pessoa1 = new Persona("Mario",22,1.87);
        Persona pessoa2 = new Persona("Pepe",52,1.55);
        Persona pessoa3 = new Persona("Manuel",27,1.58);
        Persona pessoa4 = new Persona("David",25,1.64);
        Persona pessoa5 = new Persona("Alberto",80,1.74);


        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        System.out.println("UNO");


        Map<String,Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Mario",22);
        mapaEdades.put("Pepe",52);
        mapaEdades.put("Manuel",27);
        mapaEdades.put("David",25);
        mapaEdades.put("Alberto",80);

        Function<Integer,Integer> aumentarEdad = edad -> edad+1;
        mapaEdades.replaceAll((nombre,edad) -> aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre,edad) -> System.out.println(nombre+ " " + edad));


    }
    //O que vem nos diamantes é maiusculo

}
