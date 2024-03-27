package Lambda;

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

        HolaMundo hm = () -> System.out.println("Hola,mundo");
        hm.HolaMundo();



    }





}
