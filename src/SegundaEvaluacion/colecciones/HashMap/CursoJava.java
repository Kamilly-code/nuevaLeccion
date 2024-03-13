package SegundaEvaluacion.colecciones.HashMap;

import java.util.HashMap;

public class CursoJava {
    public static void main(String[] args) {
        // Para associar uma chave a um valor:
        // HashMap<chave,valor>
        HashMap<Integer, String> carros = new HashMap<Integer,String>(); // na segunda ja instanciamos.
        carros.put(1,"Polo");
        carros.put(2,"Mercedes");
        carros.put(3,"Bmw");
        carros.put(4,"Ferrari");
        carros.put(5,"Lamborguine");
        carros.put(6,"Hyundai");

        // COMO IMPRIMIR
        System.out.println(carros); //{1=Polo, 2=Mercedes, 3=Bmw, 4=Ferrari, 5=Lamborguine, 6=Hyundai}

    }
}
