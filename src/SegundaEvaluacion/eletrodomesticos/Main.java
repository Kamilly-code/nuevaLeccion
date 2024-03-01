package SegundaEvaluacion.eletrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodoméstico nevera = new Electrodoméstico("nevera", "eletrolux",2.0);
       double consumo = nevera.getConsumo(2);
       double coste = nevera.getCosteConsumo(2,3);

        System.out.println(nevera);
        System.out.println("consumo total: "+consumo);
        System.out.println("coste total: "+coste);

        Electrodoméstico lavadora1 = new Lavadora("eletrolux",2.0,3.0,true);
        double lavadoraConsumo = lavadora1.getConsumo(2) ;
        double lavadoraCoste = lavadora1.getCosteConsumo(2,3);

        System.out.println(lavadora1);
        System.out.println(lavadoraConsumo);
        System.out.printf("Consumo  %.2f",lavadoraCoste);
    }
}
