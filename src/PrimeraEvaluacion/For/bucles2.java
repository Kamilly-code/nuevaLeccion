package PrimeraEvaluacion.For;

public class bucles2 {
    public static void main(String[] args) {

        int N = 5;


        for (int i = 1; i <= N ; i++) { // Primeiro executa o 0 e tudo que contem no 0
            System.out.print("N(" +i+ ") -> " );
            int suma = 0;
            for (int j = 1; j <= i ; j++) {
                // isso é tudo o que contem no 0

                suma = suma + j;
                System.out.print(j);

                if (j == i) {
                    // (j == i) sendo o ultimo valor de i vai mostrar um igual
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                // j = j +1;
            }
            // i = i +1;
            // o de suma tem que vir aqui:
            System.out.println(suma);
            System.out.println("\n");
        }




    }
}
