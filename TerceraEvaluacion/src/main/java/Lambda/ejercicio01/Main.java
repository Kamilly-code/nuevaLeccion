package Lambda.ejercicio01;

public class Main {
    public static void main(String[] args) {
        //Voy intentar instanciar la interface funcional HolaMUndo.
        /*HolaMundo hm = new HolaMundo() {  //CLASE ANONIMAS
            @Override
            public void HolaMundo() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("Hola, Mundo i=("+i+")");
                }
            }
        };//se coloca punto e coma te funciona';'.
        hm.HolaMundo();*/

        //PRIMEIRO FAZ A INTERFACE PQ SE NAO NAO FUNCIONA O MÉTODO


        HolaMundo hm = () -> System.out.println("Hola,mundo");
        hm.HolaMundo();

        Impar teste = (n) -> n % 2 != 0;
        System.out.println(teste.esImpar(14));

        //2.Comprueba si el parámetro es la letra ‘y’ (minúscula).
        /*public static boolean esy(Character c) {
            return c == 'y';
        }*/
        Ejercicio2 teste2 = (c) -> c == 'y';
        System.out.println(teste2.esy('b'));


        //3.Devuelve la suma de dos números.
        /*public static double sumar(double x, double y) {
            return x + y;
        }*/
        Ejercicio3 teste3 = (x,y) -> x + y ;
        System.out.printf("%.2f", teste3.sumar(12.1,12.2));

       /* Ejercicio3 teste03 = new Ejercicio3() {
            @Override
            public double sumar(double x, double y) {
                return 0;
            }
        };*/


        //4.Devuelve la suma de los cuadrados de dos números.
        /*public static int sumarCuadrados(int a, int b) {
            return a * a + b * b;
        }*/

        Ejercicio4 teste4 = (a,b) -> ((int) Math.pow(a,2) + (int) Math.pow(b,2)); // o -> a * a + b * b
        System.out.println(teste4.sumarCuadrados(4,8));


        //5.Devuelve el número 42.
        /*public static int devolver42() {
            return 42;
        }*/
        Ejercicio5 teste5 = () -> 42;
        System.out.println(teste5.devolver42());


        //6.Devuelve el número pi.
        /*public static double devolverPI() {
            return Math.PI;
        }*/
        Ejercicio6 teste6 = () -> Math.PI;
        System.out.printf("%.2f",teste6.devolverPI());
        System.out.println(" ");


        //Imprime una cadena de texto.
        /*public static void imprimirCadena(String s) {
            System.out.println(s);
        }*/
        Ejercicio7 teste7 = (s) -> System.out.println(s);
        teste7.imprimirCadena("Kamilly Brito da Mata");



        //Imprime “Hola, mundo”.
        /*public static void imprimirHolaMundo() {
            System.out.println("Hola, mundo.");
        }*/
        Ejercicio8 teste8 = () -> System.out.println("Hola Mundo");
        teste8.imprimirHolaMundo();

    }

}
