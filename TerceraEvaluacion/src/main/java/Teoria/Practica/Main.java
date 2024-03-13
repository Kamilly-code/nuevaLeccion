package Teoria.Practica;

public class Main {
    public static void main(String[] args) {
        // creamos aqui un objeto de tipo clase y vamos a interfaz y desarrollamos
        Clase clase = new Clase();
        //probemos el primero método abstracto que teniamos.
        clase.metodoAbstrato1();
        //Método abstrato de calcular suma.
        System.out.println(clase.calcularSuma(2,2));
        clase.metodoPorDefecto();// está por defecto, justamente por interfaz ser um acumulador de métodos.
        System.out.println("\n");
        InterfazComTodo.metodoEstatico();
    }
}
