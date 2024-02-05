package SegundaEvaluacion.poo.EjercicioCajero;
/* Existen gestores que administran las cuentas bancarias y atienden a sus propietarios. Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
Con respecto a los gestores, existen las siguientes restricciones:
Un gestor tendrá siempre un nombre y un teléfono.
*/
public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("11111111A", "Kamilly B. da Juniar");
        System.out.println(cuenta);
      //  cuenta.sacarDinero();
      //  cuenta.ingresarDinero();

     //   cuenta.sacarDinero();
     //   cuenta.actualizarLibreta();

        // COn dos parametros:
        CuentaCorriente cuentaCon2 = new CuentaCorriente("22222222B",50000);
        System.out.println(cuentaCon2);

        // COn 3 parametros:
        CuentaCorriente cuentaCon3 = new CuentaCorriente("33333333C","Joana D'Arc",10000);
        System.out.println(cuentaCon3);
    }
    //Mostrar información: muestra la información disponible de la cuenta corriente.


}
