package SegundaEvaluacion.colecciones.ejercicio4;

public class MainPruebas {
    public static void main(String[] args) {
        // creamos un diccionario
        Diccionario miDiccionario = new Diccionario();
        // ponemos agora as palavras

        miDiccionario.nuevoPar("Perro","Dog");
        miDiccionario.nuevoPar("Gato","Cat");
        miDiccionario.nuevoPar("Mesa","Table");
        miDiccionario.nuevoPar("Silla","Chair");
        miDiccionario.nuevoPar("Programación","Programming");
        miDiccionario.nuevoPar("Pelo","Hair");
        miDiccionario.nuevoPar("Cara","Face");

        System.out.println(miDiccionario);

        // traduzir
        String traduccion = miDiccionario.traducaoIngles("Pelo");
        System.out.println(traduccion);

        System.out.println("Palabra aleatoria: " + miDiccionario.palabraAleatoria() ) ;

        System.out.println(miDiccionario.primeraLetraTraduccion("Gato"));

    }
}
