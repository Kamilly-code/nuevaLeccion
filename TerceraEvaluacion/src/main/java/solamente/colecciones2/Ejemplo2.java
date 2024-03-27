package solamente.colecciones2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Creating HashMap with default initial capacity and load factor
        HashMap<String,Integer> map1 = new HashMap<>();
        ////Inserindo pares de valores-chave para mapear usando o método put()
        map1.put("One",1);
        map1.put("Two",2);
        map1.put("Three",3);
        map1.put("Four",4);
        map1.put("Five",5);
        //Imprimindo pares chave-valor
        for (Map.Entry<String,Integer> cadaUno: map1.entrySet()){
            System.out.println(cadaUno);
        }
        System.out.println("=======================================");
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Six",6);
        map2.put("Seven",7); //se colocar a letra maiuscula muda a ordem.

        map2.putAll(map1); //colocando todos esses elementos no primeiro mapa
        Set<Map.Entry<String,Integer>> cadaUno = map2.entrySet(); //isso serve para separar cada elemento que estava agrupado, ja que eu agrupei tudo quando coloquei putAll que significa colocar tudo no mesmo bloco.
        for (Map.Entry<String,Integer> separar: cadaUno){
            System.out.println(separar);
        }




    }
}
