package ClasesObject.ejemplosEquals;

import java.util.Objects;

public class Usuario {
    //ATRIBUTOS
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // esse this, é o objeto que esta chamando o método. Quero dizer, quando estamos em um main e chamamos um objeto vamos comparar esse objeto que chamamos
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o; //AQUI ESTOU FAZENDO CASTING: QUE É FORZAR O PROGRAMA A FAZER O QUE QUEREMOS. CONVERTIMOS O OBJETO O EM UM OBJETO DE TIPO USUARIO.
        return Objects.equals(login, usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
