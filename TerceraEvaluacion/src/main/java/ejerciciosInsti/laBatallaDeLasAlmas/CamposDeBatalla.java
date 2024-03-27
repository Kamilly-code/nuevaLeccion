package ejerciciosInsti.laBatallaDeLasAlmas;

public class CamposDeBatalla {
    public CamposDeBatalla() {
    }
    public static void luchar (Humano humano){

        int bondadAngel = 0;
        int maldadAngel = 0;


        for (Anjos angel : humano.angeles) { //PARA PEGAR OS ELEMENTOS DO ARRAYLIST TEMOS QUE USAR OU UM FOR OU UM FOREACH
           bondadAngel = bondadAngel + angel.bondad;
            System.out.println("BONDAD: "+angel.bondad);


        }
        for (Monstros monstros: humano.mostros){
           maldadAngel = maldadAngel + monstros.getMaldad();
            System.out.println("MALDAD: "+monstros.getMaldad());

        }

        if (bondadAngel > maldadAngel){
            humano.rezar();
            System.out.println("Reza");
            System.out.println("Bondad de los angeles: "+bondadAngel);
        } else {
            humano.pecar();
            System.out.println("sino");
            System.out.println("Maldad de los monstros: "+maldadAngel);
        }


    }

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
        int bondad = anjo.bondad;
        int maldad = mostro1.getMaldad();
        System.out.println("BONDAD DE LOS ANGELES:" +bondad);
        System.out.println("MALDAD DE LOS MONSTROS:" +maldad);

        CamposDeBatalla batalla1 = new CamposDeBatalla();
        luchar(pessoa1);

    }
}
