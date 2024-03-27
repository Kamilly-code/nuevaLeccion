package solamente.colecciones2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejemplo6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");
        map.put(4, "DDD");
        map.put(5, "EEE");

        Set<Integer> cadaUno = map.keySet();
        for (Integer key : cadaUno) {
            System.out.println(key);
        }

        for (String cadaValor : map.values()) {
            System.out.println(cadaValor);
        }
        // Collection<String> values = map.values();
        //
        //        for (String value : values)
        //        {
        //            System.out.println(value);
        //        }
        map.remove(1);
        map.replace(2,"KAm");
        for (Map.Entry<Integer,String> unidades : map.entrySet()){
            System.out.println(unidades);
        }
    }
}
