package solamente.teste4;

import java.util.Scanner;

public class Elevador {
    //4.-Elabore un método que simule el proceso de subir a un piso en un ascensor, donde el numero de piso es ingresado por teclado.
    //ATRIBUTOS
    public static Scanner teclado = new Scanner(System.in);
    public int numero;
    public String letra;

    public void subindoAscensor (){
        System.out.println("Estamos en el terreo, quieres ir para que piso?");
        System.out.println("Tenemos esas opciones\n1.Piso\n" +
                "2.Piso\n" +
                "3.Piso\n" +
                "4.Piso\n" +
                "-1.Garaje");
        numero = teclado.nextInt();
        switch (numero){
            case 1:
                mostrandoSubida(numero);
                System.out.println("Estás en el primero piso, cuál letra es tu apartamento?");
                System.out.println("En este piso tenemos los apartamentos: \nA.\nB.\nC.\nD.");
                letra = teclado.nextLine();
                pedindoLetra(letra);
                break;
            case 2:
                mostrandoSubida(numero);
                System.out.println("Estás en el segundo piso, cuál letra es tu apartamento?");
                System.out.println("En este piso tenemos los apartamentos: \nA.\nB.\nC.\nD.");
                letra = teclado.nextLine();
                pedindoLetra(letra);
                break;
            case  3:
                mostrandoSubida(numero);
                System.out.println("Estás en el tercero piso, cuál letra es tu apartamento?");
                System.out.println("En este piso tenemos los apartamentos: \nA.\nB.\nC.\nD.");
                letra = teclado.nextLine();
                pedindoLetra(letra);
                break;
            case 4:
                mostrandoSubida(numero);
                System.out.println("Estás en el cuarto piso, cuál letra es tu apartamento?");
                System.out.println("En este piso tenemos los apartamentos: \nA.\nB.\nC.\nD.");
                letra = teclado.nextLine();
                pedindoLetra(letra);
                break;
            case -1:
                System.out.println("Estás en la garaje, pillas tu coche");
                break;
            default:
                System.out.println("Ese piso no existe, sal de aquí");
        }
    }

    public void pedindoLetra (String letra1){
        this.letra = letra1;
        letra1 = teclado.nextLine();

        if (letra1.toLowerCase().equals("a")){
            System.out.println("estás dentro del apartamento A");
        } else if (letra1.toLowerCase().equals("b")) {
            System.out.println("estás dentro del apartamento B");
        } else if (letra1.toLowerCase().equals("c")) {
            System.out.println("estás dentro del apartamento C");
        } else if (letra1.toLowerCase().equals("d")) {
            System.out.println("estás dentro del apartamento D");
        } else {
            System.out.println("Apartamento inexistente.");
        }
    }

    public void mostrandoSubida (int num) {
        this.numero = num;
        for (int i = 1; i <= num ; i++) {
            System.out.println("Subindo... "+i+"º andar");
        }

    }

    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        elevador1.subindoAscensor();
    }

}
