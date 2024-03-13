package examenSegunda.ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class DeNuevo {
    public static void main(String[] args) {
        HashMap<Integer,Character> mapa= DECaHEX();
        HashMap<Character,Integer> mapa2= HEXaDEC();
        int [] numeros = generarNumeros();
        System.out.println("Mostrando los hexadecimales para RGB:");
        String colorHEX = colorHexadecimal(mapa, numeros);
        String colorHEX2 = hexadecimalaRGB(mapa2,colorHEX);
        System.out.println(colorHEX2);


    }

    public static HashMap<Character,Integer> HEXaDEC() {
        HashMap<Character,Integer> mapa = new HashMap<>();
        mapa.put('A',10);
        mapa.put('B',11);
        mapa.put('C',12);
        mapa.put('D',13);
        mapa.put('E',14);
        mapa.put('F',15);
        mapa.put('0',0);
        mapa.put('1',1);
        mapa.put('2',2);
        mapa.put('3',3);
        mapa.put('4',4);
        mapa.put('5',5);
        mapa.put('6',6);
        mapa.put('7',7);
        mapa.put('8',8);
        mapa.put('9',9);

        return mapa;
    }

    public static HashMap<Integer,Character> DECaHEX(){
        HashMap<Integer,Character> mapa = new HashMap<>();
        mapa.put(0,'0');
        mapa.put(1,'1');
        mapa.put(2,'2');
        mapa.put(3,'3');
        mapa.put(4,'4');
        mapa.put(5,'5');
        mapa.put(6,'6');
        mapa.put(7,'7');
        mapa.put(8,'8');
        mapa.put(9,'9');
        mapa.put(10,'A');
        mapa.put(11,'B');
        mapa.put(12,'C');
        mapa.put(13,'D');
        mapa.put(14,'E');
        mapa.put(15,'F');

        return mapa;
    }

    public static int[] generarNumeros() {
        int[] numeros = new int[6];
        Random generador = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = generador.nextInt(0,16);

        }
        System.out.println(Arrays.toString(numeros));

        return numeros;
    }

    public static String colorHexadecimal (HashMap<Integer,Character> mapa, int[] numeros) {
        String hashtag = "#";
        for (int i = 0; i < numeros.length ; i++) { //PARA PEGAR OS VALORES DE UM ARRAY JA SABEMOS QUE É COM UM FOR
            hashtag = hashtag + mapa.get(numeros[i]);
            //transforma os valores que a gente fez no array para os valores que estao no mapa.

        }
        System.out.println(hashtag);

        return hashtag;
    }

    public static String hexadecimalaRGB(HashMap<Character,Integer> mapa, String colorHex) {
        int rojo = mapa.get(colorHex.charAt(1))*16 + mapa.get(colorHex.charAt(2));
        int verde = mapa.get(colorHex.charAt(3))*16 + mapa.get(colorHex.charAt(4));
        int azul = mapa.get(colorHex.charAt(5))*16 + mapa.get(colorHex.charAt(6));


        return "rgb(" +rojo+ "," +verde+ "," + azul+ ")";
    } 




}
