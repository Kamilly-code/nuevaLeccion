package SegundaEvaluacion.poo.Teoria;

public class Miclase {
    // Atributos
    int atributo;
    boolean atributo1;
    String atributo2;

    // Constructor -> podemos no ponerlo, y java utilizará el constructor por defecto, que no recibe parámetros , só cria objetos vazios.

    // Getters y setters, solo ponemos cuando es privado


    // toString()


    // métodos de usuario, métodos que no están definidos. (Normalmente sao métodos de instancia, aqueles que só chamam os objetos que criamos nessa classe, para controlarlos)
    // Método que imprime o atributo

    public void imprimirAtributo () {
        System.out.println("Valor del atributo: " +atributo);
        System.out.println("Valor del atributo boolean: " +atributo1);
        System.out.println("Valor del atributo String: " +atributo2);
    }


}
