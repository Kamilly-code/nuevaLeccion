package examenSegunda.ejercicio1;

/*
* @Kamilly Brito da Mata
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] numeros = new int[6];
        numeros = generarNumeros();
        System.out.println(Arrays.toString(numeros));

    }

    public static HashMap<Integer,Character> hexaDec() { //Esta ao contrario, igual tinha no exercicio
        //HEXADECIMAL É ABCDEF

    //  HEXaDEC(): HashMap<Integer, Character>
    //    • Significa: hexadecimal para decimal. Retorna um mapa com os números decimais de 0 a 15 como chaves e os números hexadecimais correspondentes como valores.

        HashMap<Integer,Character> hexaDec = new HashMap<>(); //ao contrario, o chama de mapa
        hexaDec.put(0,'0'); //ao contrario
        hexaDec.put(1,'1'); //ao contrario
        hexaDec.put(2,'2'); //ao contrario
        hexaDec.put(3,'3'); //ao contrario
        hexaDec.put(4,'4'); //ao contrario
        hexaDec.put(5,'5'); //ao contrario
        hexaDec.put(6,'6'); //ao contrario
        hexaDec.put(7,'7'); //ao contrario
        hexaDec.put(8,'8'); //ao contrario
        hexaDec.put(9,'9'); //ao contrario
        hexaDec.put(10, 'A'); //ao contrario
        hexaDec.put(11, 'B'); //ao contrario
        hexaDec.put(12, 'C'); //ao contrario
        hexaDec.put(13, 'D'); //ao contrario
        hexaDec.put(14, 'E'); //ao contrario
        hexaDec.put(15, 'F'); //ao contrario

        return hexaDec; // return mapa
    }

    public static HashMap<Character,Integer> decaHex () { //AO CONTRARIO
        //DECIMAL CARA, DECIMAL É NUMERO
        // Significa: decimal para hexadecimal. Retorna um mapa com os números hexadecimais como chaves ('0' a 'A') e com os números decimais correspondentes (0 a 15) como valores.

        HashMap<Character,Integer> decaHex = new HashMap<>();
        decaHex.put('A',10); //ao contrario
        decaHex.put('B',11); //ao contrario
        decaHex.put('C',12); //ao contrario
        decaHex.put('D',13); //ao contrario
        decaHex.put('E',14); //ao contrario
        decaHex.put('F',15); //ao contrario
        decaHex.put('0',0);  //ao contrario
        decaHex.put('1',1); //ao contrario
        decaHex.put('2',2);  //ao contrario
        decaHex.put('3',3); //ao contrario
        decaHex.put('4',4); //ao contrario
        decaHex.put('5',5); //ao contrario
        decaHex.put('6',6); //ao contrario
        decaHex.put('7',7); //ao contrario
        decaHex.put('8',8); //ao contrario
        decaHex.put('9',9); //ao contrario

        return decaHex;
    }

    public static int[] generarNumeros () {
        int [] numeros = new int[6];
        Random generador = new Random();

        for (int i = 0; i < 6; i++) { // 0,1,2,3,4,5
            numeros[i] = generador.nextInt(0,15); // até 16 caraaa, lembra nao? que ele come 1
        }
        System.out.println(Arrays.toString(numeros));

        return numeros; //certo
    }

    public String colorHexadecimal (HashMap<Integer,Character> mapa,int [] numeros) {
        /*
        * # que é um string = # + mapa que criamos com pegando os arrays pelos indices, isso tudo tempo de um for, pq array fazemos por for.
        *
        * retorna a cor decimal depois
        *  */



        return colorHexadecimal(mapa, numeros);
    }

    public static String hexadecimalaRGB (HashMap<Character,Integer> mapa, String color) {
        int deca = Integer.parseInt(String.valueOf(decaHex()));

        return hexadecimalaRGB(mapa, color);
    }


}
