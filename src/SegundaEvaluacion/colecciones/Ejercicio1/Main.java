package SegundaEvaluacion.colecciones.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

/*Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y mayúsculas (en la práctica, las letras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso.
Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico. Para ello implementar el método estático:
static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra),
donde se lleva a cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del abecedario.
*/
public class Main {
    public static void main(String[] args) {



    Académico academico1 = crearAcademico("Pere-Reverte",2003);
    Académico academico2 = crearAcademico("Alvaro Pombo",2004);
    Académico academico3 = crearAcademico("José Manuel Blacus",2006);
    Académico academico4 = crearAcademico("Pedro R.García Borreno",2006);
    Académico academico5 = crearAcademico("José M-Merino",2009);

    HashMap<Character, Académico> mapa = new HashMap<>();
    /*Me piden que inserte los académicos con u método*/
       // boolean insertado = nuevoAcadémico(mapa, academico1, '5');
      //  if (insertado) {
      //      System.out.println("Academico insertado con éxito");
      //  } else {
      //      System.out.println("No se ha podido insertar el académico.");
      //  }
        nuevoAcadémico(mapa, academico1, 'T');
        nuevoAcadémico(mapa, academico1, 't');
        nuevoAcadémico(mapa, academico1, 'A');
        nuevoAcadémico(mapa, academico1, 'E');
        nuevoAcadémico(mapa, academico1, 'i');

    //mapa.put('T', academico1 ); /*Tanto faz, se coloca mapa.put ou academico.put*/
    //mapa.put('t', academico2 );
    //mapa.put('A', academico3 );
    //mapa.put('E', academico4 );
    //mapa.put('i', academico5 );

        imprimirAcademia(mapa);

    }

    /*Métodos*/
    public static void imprimirAcadémico (Académico a) {
        System.out.println("Año:\t\t\tNombre:");
        System.out.println(a.getAñoIngreso()+"\t"+a.getNombre());
    }
    public static void imprimirAcademia (HashMap<Character, Académico> mapa) {
        System.out.println("Letra\t\tAño\t\t\tNombre");
        System.out.println("================================================");
        // Recorremos el mapa

        for (Map.Entry<Character, Académico> entrada: mapa.entrySet()){
            System.out.println(entrada.getKey() + "\t\t" + entrada.getValue().getAñoIngreso() /*Depois do getValue. temos os valores do Academico*/ + "\t\t" + entrada.getValue().getNombre());

        }
    }
    public static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra) {
        // tenemos que insertar el academico en el mapa comprobando antes si la letra lo es
        if (Character.isLetter(letra)) {
          //inserto el academico y devuelvo true
          academia.put(letra, nuevo);
          return true;
        } else {
            return false;
        }
    }

    // vamos a crear los académicos con un método
    public static Académico crearAcademico ( String nombre, int año) {
        Académico académico = new Académico("Kamilly", 2004);
        return académico;
    }

}
