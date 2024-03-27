package ClasesObject.biblioteca;

import java.time.LocalDate;

public class Socio implements Comparable{
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Socio(String nombre, String apellidos, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o; //CASTING
        if (this.fechaNac.isBefore(s.fechaNac)){ //COM COMPARTETO primeiro o atributo, logo a classe e o que queremos organizar.
            return 1;
            //2000, se 2000 é antes de 2000 (+1),2010(+1),1999(-1),2005(+1)= 2
            //2010 se 2010 é antes de 2000(-1), 2010(+1),1999(-1),2005(-1) = 2
            //1999 se 1999 é antes de 2000 (+1), 2010(+1),1999
            //2005
        } else if (this.fechaNac.isAfter(s.fechaNac)){
            return -1;
        }else
        return 0;
    }
}
