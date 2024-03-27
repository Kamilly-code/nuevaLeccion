package solamente.colecciones2;

import java.util.HashMap;

public class Ejemplo4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THREE",3);
        map.put("FOUR",4);

        int value = map.get("TWO");
        System.out.println(value); //Como o valor é numerico, tem que criar um entero para conseguir o get.

    }
}
