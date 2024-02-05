package PrimeraEvaluacion.Char;

public class Ejercicio0 {
    public static void main(String[] args) {
        final int tam = 5;
        char [] gabaritos = {'a','a','d','b','c'}; //Arrays
        char [] respostas = new char[tam];

        int nota= 0; //Padrao é inicicializar com 0 já.

        respostas [0] = 'a';
        respostas [1] = 'a';
        respostas [2] = 'd';
        respostas [3] = 'b';
        respostas [4] = 'c';

        for (int i = 0; i < respostas.length ; i++) {
            if (respostas[i] == gabaritos[i]) {
                nota++;
            }
        }
        System.out.printf("Nota do alumno: %d",nota );
    }
}
