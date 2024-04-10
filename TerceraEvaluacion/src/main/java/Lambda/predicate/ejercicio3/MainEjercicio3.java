package Lambda.predicate.ejercicio3;

import java.util.function.Predicate;

public class MainEjercicio3 {
    public static void main(String[] args) {
        //Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> esMultiplo = numero -> numero % 5 == 0;
        System.out.println("25 es multiplo de 5:"+esMultiplo.test(25));
        System.out.println("41 es multiplo de 5:"+esMultiplo.test(41));

        //Define un predicado para comprobar si un String no termina en “s”.
        Predicate<String> terminaEnChar = cadena -> !cadena.endsWith("s") ;

        //Define un predicado para comprobar si un entero es par y múltiplo de 3.
        Predicate<Integer> esParoMultiplo = numero -> numero % 2 == 0 && numero % 3 == 0;

        //Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character> esCharacter = letra -> Character.isLetter(letra) && Character.isUpperCase(letra) ;
        //character si es un digito o un alphabect.
        System.out.println(esCharacter.test('5'));
        System.out.println(esCharacter.test(' '));
        System.out.println(esCharacter.test('A'));
        System.out.println(esCharacter.test('a'));
        //Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        Predicate<Integer> esImpar = numero -> numero % 2 != 0 && numero % 7 == 0;
        //para ver se é impar o número nao pode dividir por dois, entao é só colocar !=0
        //Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        Predicate<Integer> esImpar7 = numero -> numero % 2 != 0 || numero % 7 == 0;



    }

}
