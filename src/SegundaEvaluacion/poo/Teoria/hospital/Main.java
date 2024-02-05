package SegundaEvaluacion.poo.Teoria.hospital;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        //como no tenemos el constructor, utiliza el constructor por defecto.
        System.out.println(paciente1);

        //CONSTRUINDO UM CONSTRUCTOR PQ NAO CRIAMOS
        paciente1.setEdad(12); /*Para colocar ou trocar valor set, para pegar algo get*/
        paciente1.setNombre("Ana Luiza");
        paciente1.setSintomas(new String[] {"Tos", "Cansancio", "Fiebre"}); /*pasa de String para Array con new*/
        System.out.println(paciente1); //Paciente{nombre='Ana Luiza', edad=12, sistomas=[Tos, Cansancio, Fiebre]}
        //****************************************************************************************************//

        // Segundo constructor, com los 3 atributos
        Paciente paciente2 = new Paciente("Janana",28,new String[] {"Dolor de cabeza", "Ansiedad"});
        System.out.println(paciente2);

        // Tercero constructor, com solo un parametro

        Paciente inconciente = new Paciente("Jovenilton");
        System.out.println(inconciente); // A edad ja tinhamos colocados automaticamente e os sistomas colocamos desconhecido/desconocido.
        inconciente.setEdad(25);
       // inconciente.getSintomas(new String[]{"Bolinha", "Stress"});
      //  System.out.println(inconciente);

    }
}
