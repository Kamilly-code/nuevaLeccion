package SegundaEvaluacion.poo.Ejemplos.Ejercicio3;

public class Usuario1 {
    // atributos
    private String login;
    private String nombre;
    private String apellidos;

    // construtor


    public Usuario1(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //getter and setter
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    // to string ()


    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
