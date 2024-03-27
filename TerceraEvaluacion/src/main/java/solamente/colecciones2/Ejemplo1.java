package solamente.colecciones2;

import java.util.HashMap;

public class Ejemplo1 {
    public static void main(String[] args) {
        //1. Creating HashMap with default initial capacity and load factor
        //1. Creación de HashMap con capacidad inicial(padrão) y factor de carga predeterminados(load factor)
        HashMap<String,Integer> map1 = new HashMap<>();

        //A medida que aumenta la cantidad de elementos en HashMap , se amplía la capacidad. El factor de carga es la medida que decide cuándo aumentar la capacidad del Mapa . El factor de carga predeterminado es el 75% de la capacidad.

        //2. Creating HashMap with 30 as initial capacity
        //2. Creando HashMap con 30 como capacidad inicial
        HashMap<String,Integer> map2 = new HashMap<>(30);

        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
        //3. Creando HashMap con 30 como capacidad inicial y 0,5 como factor de carga
        HashMap<String,Integer> map3 = new HashMap<>(30,0.5f);

        //4. Creating HashMap by copying another HashMap
        //4. Creando HashMap copiando otro HashMap
        HashMap<String,Integer> map4 = new HashMap<>(map1);


        //https://www.baeldung.com/java-hashmap-load-factor
    }
}
