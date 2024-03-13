package SegundaEvaluacion.poo.empresaMantenimiento;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return 0;
    }

    @Override
    public double costeTotal() {
        return 0;
    }

    @Override
    public String detalleServicio() {
        return null;
    }
}
