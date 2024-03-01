package SegundaEvaluacion.poo.Herencia.ejemplos.ejemplo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Persi", LocalDate.of(2000,1,1));
        persona.mostrar();

       /* p.setNombre("A. Arenal");
        p.setAñoNacimiento(1985);
        p.setDirección("Pobladura del Valle, 15");
        p.setFechaInicio(new LocalDate());
        p.setSalario(50_000L);
        p.setLenguajes(new String[] { "Java", "JavaScript", "PHP" });

        System.out.println(p.getNombre()); // A. Arenal
        System.out.println(p.getSalario()); // 50000
        System.out.println(Arrays.toString(p.getLenguajes())); // [Java, JavaScript, PHP]*/

        //Probamos la clase Persona creando un objeto

        Empleado empleado = new Empleado("Jaunna", LocalDate.of(2000,1,1),12000);
        empleado.mostrar();

        Cliente cliente1 = new Cliente("Joel",LocalDate.of(2005,5,3),"123456789");
        cliente1.mostrar();

        //PROBAMOS LA CLASE DIRECTIVO.
        Directivo directivo = new Directivo("Colon",LocalDate.of(2000,2,20),12500, Categoria.CEO);
        directivo.mostrar();
        /**/
       // directivo.asignarPlus();
        directivo.mostrar();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        Empresa empresa = new Empresa("Frnandy",empleados,clientes);
        empresa.mostrar();

    }
}
