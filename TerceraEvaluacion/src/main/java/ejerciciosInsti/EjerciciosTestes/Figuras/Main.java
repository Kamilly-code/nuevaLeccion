package ejerciciosInsti.EjerciciosTestes.Figuras;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulos("blue",3);
        System.out.println(figura1);
        System.out.println();
        Figura figura2 = new Cuadrado("yellow",2,2);
        System.out.println(figura2);
        System.out.println();
        Figura figura3 = new Triangulo("pink",5,7);
        System.out.println(figura3);
        System.out.println();
        Figura figura4 = new Retangulo("verde",6,4);
        System.out.println(figura4);
    }
}
