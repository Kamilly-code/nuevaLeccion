package solamente.teste8FAILED;

public class Alumno {
    private String nombre;
    private String apellido;
    private int codigoAlumno;

    public Alumno(String nombre, String apellido, int codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigoAlumno=" + codigoAlumno +
                '}';
    }
}
