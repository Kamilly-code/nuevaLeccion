package solamente.letrasLeatorias;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random generador = new Random();
        final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // value0: A // value1: B // value2: C // value3: D // value4: E // value5: F // value6: G // value7: H
        // value8: I // value9: J // value10: K // value11: L // value12: M // value13: N // value14: O // value15: P
        // value16: Q // value17:R // value18: S // value19: T // value21: U // value22: V // value23: W // value24: X
        // value25: Y // value26: Z


        int convertirEnLetra = 0;

        StringBuffer numeroForLetra = new StringBuffer();

        for (int i = 0; i < 4 ; i++) {
            convertirEnLetra  = generador.nextInt(LETRAS.length());
            System.out.println(convertirEnLetra);
            char randomChar = LETRAS.charAt(convertirEnLetra);
            System.out.println(randomChar);
            numeroForLetra.append(randomChar);
        }

        System.out.println("RESULTADO: ");
        System.out.print(numeroForLetra);
    }
}

class TesteDeNuevo {
    public static void main(String[] args) {
        Random generador = new Random();
        final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char percorrerLaCadena;
        int posicion = 0;

        StringBuffer juntandoLetras = new StringBuffer();

        for (int i = 0; i < 3 ; i++) {
            posicion = generador.nextInt(LETRAS.length());
            percorrerLaCadena = LETRAS.charAt(posicion);
            juntandoLetras.append(percorrerLaCadena);
        }
        System.out.println(juntandoLetras);
    }
}

class caçaPalavras {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int tamanhoPalavra = 0;
        final String LETRAS = "ABCnamoroDEFGHIJKLMNOcasamentoPQRSTUVapaixonadaWXYZ";
        final String POSICION = "0-A,1-B,2-C,3-n,4-a,5-m,6-o,7-r,8-o,9-D,10-E,11-F,12-G,13-H,14-I,15-J,16-K,17-L,18-M,19-N,20-O,21-c,22-a,23-s,24-a,25-m,26-e,27-n,28-t,29-o,30-P,31-Q,32-R,33-S,34-T,35-U,36-V,37-a,38-p,39-a,40-i,41-x,42-o,43-n,44-a,45-d,46-a,47-W,48-X,49-Y,50-Z";
        StringBuffer juntandoPalabras = new StringBuffer();


        System.out.println("Vamos jugar caça palavras: \nSe encontrar uma palavra escreva a posicion até escontrar a palavra desejada e o tamanho da palavra\n" +LETRAS+ "\n" +POSICION);
        System.out.println("Primero escriba el tamaño de la palabra");
        tamanhoPalavra = teclado.nextInt();
        System.out.println("Escriba donde está la palabra que quieres, para eso escriba la posicion inicial e la final: ");
        System.out.println("POSICION INICIAL");
        int posicionInicial = teclado.nextInt();
        System.out.println("POSICION FINAL (COLOCA UM NUMERO A MAIS NA POSICION FINAL)");
        int posicionFinal = teclado.nextInt();

        for (int i = 0; i < 1; i++) {
            String cualQuiero = LETRAS.substring(posicionInicial,posicionFinal);
            String convertirPosicionEnChar1 = cualQuiero;
            juntandoPalabras.append(convertirPosicionEnChar1+"\n");

        }
        System.out.println(juntandoPalabras);


    }
}
