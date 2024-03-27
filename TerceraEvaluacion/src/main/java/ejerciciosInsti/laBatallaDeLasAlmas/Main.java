package ejerciciosInsti.laBatallaDeLasAlmas;

import java.util.Random;

public class Main {
    //criaçao do anjo lindo:
    public static void main(String[] args) {
        Anjos anjo = new Anjos(1000);
        anjo.mostrar();

        Monstros mostro1 = new Monstros(100);
        mostro1.mostrar();

        //Humano de prueba:
        Humano pessoa1 = new Humano(100);
        pessoa1.mostrar();
        pessoa1.rezar();
        pessoa1.mostrar();
        pessoa1.pecar();
        pessoa1.mostrar();
        pessoa1.rezar();
        pessoa1.rezar();
        pessoa1.rezar();
        pessoa1.rezar();
        pessoa1.rezar();
        pessoa1.mostrar();

        Random generador = new Random();
        for (int i = 0; i < 17; i++) {
            int num = generador.nextInt(1,101);
            //System.out.print(num+ " ");
            if ( i % 2 == 0){
                System.out.print(num+ " ");
                pessoa1.rezar();
            }else {
               // pessoa1.pecar();
            }

        } pessoa1.mostrar();




    }

}
