package PrimeraEvaluacion.Switch;

public class Ejercicio1 {
    //Primeiros exemplos com if, para você ver a diferença.

    public static void main(String[] args) {
        //SWITCH=TROCAR/CAMBIAR

        int posición = 1;
        //COM IF
        /*if (posición == 1) {

        }else if (posición==2){

        }*/

        switch (posición) {
            case 1:
                System.out.println("Medalha de ouro");
                break;
            case 2:
                System.out.println("Medalha de prata");
                break;
            case 3:
                System.out.println("Medalha de bronze");
            default:
                System.out.println("Nenhuma medalha");
                break;

        }

        int num1, num2, res;
        num1 = 10; num2 = 5;

        String op = "/";

        switch (op) {
            case "+":
                res=num1+num2;
                System.out.println("El resultado de la ecuación entre " +num1+ " y " +num2+ " es:" +res);
                break;
            case "-":
                res=num1-num2;
               System.out.println("El resultado de la ecuación entre " +num1+ " y " +num2+ " es:" +res);
                break;
            case "*":
                res=num1*num2;
                System.out.println("El resultado de la ecuación entre " +num1+ " y " +num2+ " es:" +res);
                break;
            case "/":
                res=num1/num2;
                System.out.printf("Opercao: %s : resultado: %d%n",op,res);
                break;
            default:
                System.out.println("Nao podemos fazer nenhuma operaçao");
        }






    }
}
