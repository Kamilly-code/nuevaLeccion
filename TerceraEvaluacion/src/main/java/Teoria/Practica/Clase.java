package Teoria.Practica;

public class Clase implements  InterfazComTodo{

    @Override
    public void metodoAbstrato1() {
        System.out.println("Esse é o método que desarrollamos dentro de Clase");

    }

    @Override
    public int calcularSuma(int num1, int num2) {
        return num1+num2;
    }

}
