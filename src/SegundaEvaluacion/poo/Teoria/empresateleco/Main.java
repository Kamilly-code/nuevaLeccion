package SegundaEvaluacion.poo.Teoria.empresateleco;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
       Programador programador = new Programador();

        programador.setAño(2000);
        programador.setNombre("Pika");
        programador.setDireccion("calle pez");

        programador.setFecha_inicio(LocalDate.of(2023,9,7));
        programador.setSalario(50000L);

        programador.setLenguajes(new String[] {"Java", "PHP", "Ruby"});
        System.out.println(programador);

        programador.añadirLenguaje("SQL");
        System.out.println(programador);


    }
}
