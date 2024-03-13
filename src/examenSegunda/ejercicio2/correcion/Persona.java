package examenSegunda.ejercicio2.correcion;

import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract String getNombreCompleto();

    public abstract void setNombreCompleto(String nombreCompleto);

    public void cambiarFechaNacimiento(int dd, int mm, int aaaa) {
        this.fechaNacimiento = LocalDate.of(aaaa, mm, dd);
    }
}
