package Teoria.Practica;

public interface InterfazComTodo {
    // puede tener constantes
    int CONSTANTE = 0; // si fuera una clase normal que poner public static final

    // puede tener métodos abstractos: en vez de desarrollarlos aqui, los tendrán que dasarollar las clases NO ABSTRACTAS que implemente esa interfaz

    public void metodoAbstrato1 (); // a pesar de no poner la palabra abstract
    public int calcularSuma (int num1,int num2);

    // pouede tener métodospor defecto (defalult) : Y HAY QUE DESARROLLARLOS AQUÍ
    public default void metodoPorDefecto(){
        System.out.println("Este es un método por defecto normal y corriente que está desarrollado en la interfaz. Estará disponible en las clases que la implementen.");
        System.out.println("Y aqui llamamos al método privado "+metodoPrivado());
    }

    private String  metodoPrivado (){
        return "@Este método privado, no puedes salir de esta clase, es como si fuera un secreto que mantenemos aqui.";
    }

    public static void metodoEstatico() {
        System.out.println("Esto es un método estático está desarrollado en la interfaz. Estará disponible en las clases que lo implementen");
        System.out.println("y ahora voy a utilizar el método privado que tengo a continuación");
    }

}
