package PrimeraEvaluacion.For;

public class bluclesAnidados {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) { // Primeiro executa o 0 e tudo que contem no 0
            System.out.println("i: " +i);
            for (int j = 0; j < 4 ; j++) { // isso é tudo o que contem no 0
                System.out.println("    j: " +j);
            }
        }
    }
}
