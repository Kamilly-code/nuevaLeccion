package Lambda.predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        //utilizamos predicados quando passamos um valor por parametro e queremos que devolva um boolean (true/false);
        //Ejemplo: es millenial si ha nacido entre 1981 y 1996 ambos inclusivo.
        //ahora con la sintaxis de predicado o predicade

        //EXPRESION LAMBDA: é igual o return só que mais abreviado.
        Predicate<Integer> predicado1 = año -> año >= 1981 && año <= 1996;
                //Predicate<Integer> esMillenial =  tiene que recibir un numero
        //PARA CHAMAR NO SOUT TEM QUE UTILIZAR TESTE
        System.out.println(predicado1.test(1950));

    }

    public static boolean esMillenial (int año) {
        return (año >= 1981 && año <= 1996);
    }
}
