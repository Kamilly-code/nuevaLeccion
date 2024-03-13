package examenSegunda.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Kamilly Brito da Mata
 * */
public class Empleado extends Persona{
    //ATRIBUTOS:
    private double sueldoBruto; //CERTO
    private LocalDate fechaContrato; //CERTO
    public int contador; //CERTO
    Empleado supervisor; //CERTO
    ArrayList<Empleado> supervisados; //CERTO

    public Empleado(LocalDate fechaNacimiento) { //CERTO
        super(fechaNacimiento);
        //AQUI TINHA QUE COLOCAR O CONTADOR, PARA QUE CADA VEZ QUE EU CRIAR UM TRABALHADOR CONTAR.
        //contador++;
        this.sueldoBruto = 15876; //CERTO
        this.fechaContrato = LocalDate.now(); //CERTO
        this.supervisados = null; //POR ISSO NAO SAIA O NOME DOS SEUS SUPERVISADOS, TU COLOCOU NULL TUA TANSA. CRIA UM NEW ARRAYLIST
        // this.supervisados = new ArrayList<>();
    }


    /*public Empleado() {
        this.sueldoBruto = 15876;
        this.fechaContrato = LocalDate.now();
        this.supervisados = null;
    }*/

   /* public Empleado(double sueldoBruto, LocalDate fechaContrato, int contador, Empleado supervisor, ArrayList<Empleado> supervisados) {
        this.sueldoBruto = ;
        this.fechaContrato = fechaContrato;
        this.contador = contador;
        this.supervisor = supervisor;
        this.supervisados = supervisados;
    }
*/

    // Métodos




    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                ", fechaContrato=" + fechaContrato +
                ", contador=" + contador +
                ", supervisor=" + supervisor +
                ", supervisados=" + supervisados +
                '}';
    }
    // MÉTODOS HEREDADOS

    @Override
    public String getNombreCompleto() {
        return nombre+ " " +apellido1+ " " +apellido2; // return this.apellido1 + " " + this.apellido2 + ", " + this.nombre;
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
       String [] palabras = nombreCompleto.split(" ");
        //String[] palabras = nombreCompleto.split(" ");
        //this.nombre = palabras[0];
        //this.apellido1 = palabras[1];
        //this.apellido2 = palabras[2];
        //COmo é que eu crio um split e nao pego os elementos dele
        System.out.println(nombreCompleto);

       /* String nome;
        String primerApe;
        String segundoApe;
        this.nombre = nombreCompleto*/

    }

    // MÉTODOS DESTA CLASE
    public void aumentarSueldo (double porcentaje) {

        double calPorcentage = porcentaje / 100;
        double porcento = sueldoBruto * calPorcentage;
        double saldoFinal = sueldoBruto + porcento;

        this.sueldoBruto = saldoFinal;
    }

    public void setFechaContrato(LocalDate fechaContrato) {

        this.fechaContrato = fechaContrato;
    }
    /*
    public void setFechaContrato(int dd, int mm, int aaaa) {
        this.fechaContrato = LocalDate.of(aaaa, mm, dd);
    }
     */
    public void asignarSupervisor (Empleado empleado){
        this.supervisor = empleado;

    }
    public void asignarSupervisado (Empleado empleado){
        supervisados.add(empleado);

    }
    
    public void quitarSupervisado (Empleado empleado){
        supervisados.remove(empleado);
    }
    public void mostrarDatosEmpleados (){
        System.out.println("Nombre completo: " +nombre+ " " +apellido1+ " " +apellido2+ " "  );
        System.out.println("Fecha de Nacimiento: " +fechaNacimiento);
        System.out.println("Fecha de contrato: " +fechaContrato);
        System.out.println("Salario: " +this.sueldoBruto);
        System.out.println("Supervisado por: " +this.supervisor);
        System.out.println("Supervisa a: : " +this.supervisados);
    }
}
