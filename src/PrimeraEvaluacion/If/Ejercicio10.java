package PrimeraEvaluacion.If;

import java.util.Scanner;

//10.	La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: *A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:*
//
//a.	Preguntamos por el *precio inicial* del kilo de uva y el número de kilos que se van a cargar.
//b.	Si la uva es de tipo A, se le *cargan 20 céntimos* al *precio inicial* cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
// Entao de aordo com o que a gente prdiu podemos dizer se a uva é yipo A e o seu tamanho
//c.	Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kilos;
        double precioInicial;
        String tipo;
        int tamano;
// Solicitud de datos al usuario
        System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
        System.out.print("Introduce los Kg. de uva entregada: ");
        kilos = scanner.nextInt();
        System.out.print("Precio por Kg. inicial: ");
        precioInicial = scanner.nextDouble();
        System.out.print("Uva de valor \"A\" ó \"B\": ");
        tipo = scanner.next(); scanner.nextLine();
        System.out.print("Tipo de uva \"1\" ó \"2\": ");
        tamano = scanner.nextInt();
// Realizamos Cálculos y mostramos en pantalla
        if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && // Para cada caso quando for diferente
                (tamano == 1 || tamano == 2))) {
            System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
        } else {
            if (tipo.toUpperCase().equals("A") && tamano == 1) { // Distingue de mayuscula e minuscula
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
            } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
                System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
            } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
            } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
                System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
            }
        }
    }
}
