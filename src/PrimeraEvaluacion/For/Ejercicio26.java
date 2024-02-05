package PrimeraEvaluacion.For;
/*
* 26.	Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
* */
public class Ejercicio26 {
    public static void main(String[] args) {

        int N = 30;



        // For Suma
        for (int i = 1; i <= N ; i++) {

            System.out.print("N("+i+") --> ");
            int suma = 0;

            for (int j = 1; j <= i ; j++) {
                suma = suma + j;
                System.out.print(j+ " ");
                if (j == i) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
            }
            System.out.println(suma);
            System.out.println("\n");
        }

        System.out.println("\n");


        // For Producto
        for (int i = 1; i <= N ; i++) {
            System.out.print("P("+i+") --> ");
            int producto = 1;

            for (int j = 1; j <= i ; j++) {
                producto = producto * j;

                System.out.print(j+ " ");
                if (j == i ) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println(producto);
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
