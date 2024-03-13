package SegundaEvaluacion.poo.empresaMantenimiento;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    //ATRIBUTOS
    private double superficie;
    private double precioPintura;
    private double costeAdicional0;

    //CONSTRUCTOR

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    //MÉTODOS GET Y SET

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    // MÉTODOS

    @Override
    public double costeMaterial() {

        return (this.superficie / 7.8)* this.precioPintura ;
    }

    @Override
    public double costeManoObra() {
        return (this.superficie / 10)* 9.5;
    }

    @Override
    public double costeTotal() {
        double coste_total = this.costeMaterial()+this.costeManoObra();
        double costeAdicional = 1;
        this.costeAdicional0 = costeAdicional;
        if (superficie <= 50) {
            costeAdicional = coste_total * 0.15;
            return costeAdicional + coste_total;

        } else {
            return coste_total;
        }


    }

    @Override
    public String detalleServicio() {

        return "TRABAJO DE PINTURA \nCliente: ("+cliente+")\nFecha de inicio: ("+fechaInicio+")\n----------------------------\nPintor: ("+trabajador+")\nCoste Material.....("+costeMaterial()+")\nCoste Mano Obra.....("+costeManoObra()+")\nCoste Adicional.....("+costeAdicional0+")\nTOTAL: .............("+costeTotal()+")--------------------------" ;
    }



}
