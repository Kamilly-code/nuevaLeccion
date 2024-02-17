package SegundaEvaluacion.poo.Ejemplos.Ejercicio3;

public class Cuenta {
    // atributos
    private String  codigo;
    private float  balance;
    private Usuario1 proprietario;

    // construtor

    public Cuenta(String codigo, float balance, Usuario1 proprietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.proprietario = proprietario;
    }

    //getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Usuario1 getProprietario() {
        return proprietario;
    }

    public void setProprietario(Usuario1 proprietario) {
        this.proprietario = proprietario;
    }

    // to string


    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", proprietario=" + proprietario +
                '}';
    }
}
