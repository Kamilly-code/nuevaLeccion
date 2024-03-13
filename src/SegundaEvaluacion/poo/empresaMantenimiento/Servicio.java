package SegundaEvaluacion.poo.empresaMantenimiento;

import java.time.LocalDate;

public abstract class Servicio {
    //ATRIBUTOS / PROPRIEDADES
    protected String trabajador;
    protected LocalDate fechaInicio;
    protected String cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    //  MÉTODOS

    public abstract double costeMaterial(); //COMO A CLASSE JÁ É ABSTRATA NAO NECESSITA QUE EU COLOQUE QUE OS MÉTODOS SAO PQ ELA JA HEREDA DE ELA.

    public abstract double costeManoObra ();

    public abstract double costeTotal () ;

    public abstract String detalleServicio () ;

    @Override
    public String toString() {
        return "Servicio{" +
                "trabajador='" + trabajador + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
