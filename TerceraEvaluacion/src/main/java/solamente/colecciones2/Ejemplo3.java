package solamente.colecciones2;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo3 {
    //Como colocar um valor chave se e somente se nao estiver presente no hashmap
    //USANDO putifAbsent();
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        //Adds key-value pair 'ONE-111' only if it is not present in map (somente se nao estiver presente no mapa)
        map.putIfAbsent("ONE",111);
        //Adds key-value pair 'ONE-111' only if it is not present in map (somente se nao estiver presente no mapa)
        map.putIfAbsent("TWO",222); // nao se executa se tiver outra chave.
        map.put("TWO",22);
        //Printing (mostrando) key-value pairs of map (par de valores chaves do mapa)
        for (Map.Entry<String,Integer> cadaUno : map.entrySet()){
            System.out.println(cadaUno);
        }

    }
}
