package solamente.teste10;

public class Main {
    public static void main(String[] args) {
        Persona pessoa1 = new Persona("Kamilly",20,'f',50.5,1.60);
        pessoa1.esMayorDeEdad();
        pessoa1.comprobarSexo('f');
        pessoa1.generarDNI();
        pessoa1.calcularIMC();
        System.out.println(pessoa1);


    }
}
