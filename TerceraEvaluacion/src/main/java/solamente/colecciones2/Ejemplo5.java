package solamente.colecciones2;

import java.util.HashMap;

public class Ejemplo5 {
    public static void main(String[] args) {
        HashMap<Integer,Double> map = new HashMap<>();
        map.put(1, 1.1);
        map.put(2, 2.2);
        map.put(3, 3.3);
        map.put(4, 4.4);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(4.4));
        System.out.println(map.size()); //tamanho do mapa. 4, pq creamos 4 puts
        map.clear();
        System.out.println(map.size());//limpamos el mapa

    }
}
