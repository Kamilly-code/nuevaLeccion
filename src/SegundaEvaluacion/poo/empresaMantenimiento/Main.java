package SegundaEvaluacion.poo.empresaMantenimiento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Servicio vacaAmarela = new TrabajoPintura ("Ensiso", LocalDate.of(2001,1,1), "Ismal",40,10);
       TrabajoPintura nothing = new TrabajoPintura("kam", LocalDate.of(2001,03,20),"Ken",40,10);

       double costeM = nothing.costeMaterial();
       double costeO = nothing.costeManoObra();

       double costeT = nothing.costeTotal();


       // System.out.printf("resultado del coste material %.2f", costeM );
       // System.out.println();
       // System.out.printf("resultado del coste material %.2f", costeO );
       // System.out.println();
       // System.out.printf("resultado del coste material %.2f", costeT );
        String funciona = nothing.detalleServicio();
        System.out.println(funciona);





    }


}
