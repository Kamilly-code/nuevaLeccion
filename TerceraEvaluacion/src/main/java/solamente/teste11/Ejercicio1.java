package solamente.teste11;

import java.util.Scanner;

public class Ejercicio1 {
    //Escriba un método que reciba dos números enteros (a,b) y devuelva si -a- es mayor que -b-.
    public static Scanner teclado = new Scanner(System.in);
    private int a;
    private int b;
    public void esMayor (){
        System.out.println("Escriba el numero a:");
        a = teclado.nextInt();
        System.out.println("Escriba el numero b:");
        b = teclado.nextInt();
        while (a == 0 ){
            a = teclado.nextInt();
        }
        while (b == 0){
            b = teclado.nextInt();
        }
        if (a < b){
            System.out.println("el numero a es menor b");
        } else if (a > b) {
            System.out.println("el numero b es menor que a");
        } else if (a == b){
            System.out.println("son iguales");
        }

    }
}

class NumerosEntero {
    //ATRIBUTOS
    private String cadena1;
    private String cadena2;

    public boolean sonEquales (String cad1, String cad2){
        this.cadena1 = cad1;
        this.cadena2 = cad2;
        if (cad1.equals(cad2)){
            System.out.println("son iguales");
            return true;
        } else if (!cad1.equals(cad2)) {
            System.out.println("no son iguales");
            return false;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "NumerosEntero{" +
                "cadena1='" + cadena1 + '\'' +
                ", cadena2='" + cadena2 + '\'' +
                '}';
    }


}

//Escriba un método que reciba tres reales y devuelva el mayor de los tres.

class NumerosReales {
    public static Scanner teclado = new Scanner(System.in);
    private int numero1;
    private int numero2;
    private int numero3;

    public void mayorNumeroReal (){
        System.out.println("Escriba el primer numero real: ");
        numero1 = teclado.nextInt();
        System.out.println("Escriba el segundo numero real: ");
        numero2 = teclado.nextInt();
        System.out.println("Escriba el tercer numero real: ");
        numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El mayor numero es el numero uno");
        } else if (numero2 > numero3 && numero2 > numero1) {
            System.out.println("El mayor numero es el numero dos;");
        } else if (numero3 > numero1 && numero3> numero2) {
            System.out.println("El mayor numero es el numero tres");
        }

    }
}
