package SegundaEvaluacion.poo.Ejemplos.Ejercicios.Aplicación;

public class Usuario {
    // Atributos
    private String username;
    private String email;
    private String password;

    private Estado estado;
    //Constructor

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }

    //Getters y setters


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    // to string

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // aqui vienen los métodos de usuario, los que creo yo.

    public void mensajeEstado () {
        if (estado.equals(Estado.PENDIENTE)){
            System.out.println("Tienes que esperar un poco");
        } else if (estado.equals(Estado.ACTIVO)) {
            System.out.println("Tudo ok, via libre");
        } else if (estado.equals(Estado.BLOQUEADO)) {
            System.out.println("Usuario bloqueado. ALgo habrás hecho");
        } else {
            System.out.println("Estado desconocido");
        }
    }

}
