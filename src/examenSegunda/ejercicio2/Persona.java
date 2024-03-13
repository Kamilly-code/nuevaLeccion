package examenSegunda.ejercicio2;

import java.time.LocalDate;

/*
 * @Kamilly Brito da Mata
 * */
public abstract class  Persona {
  //todos los ejercicios con protect
 //   protected;
    //ATRIBUTOS:
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
      this.nombre = "Kamilly";
      this.apellido1 = "Brito";
      this.apellido2 = "da Mata";
    }

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract String getNombreCompleto ();
    public abstract void setNombreCompleto (String nombreCompleto);

    public void cambiarFechaNacimiento (LocalDate mudar){

        this.fechaNacimiento = mudar;

    }


}
