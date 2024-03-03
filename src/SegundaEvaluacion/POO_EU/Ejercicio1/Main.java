package SegundaEvaluacion.POO_EU.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria persona1 = new ContaBancaria();
        persona1.setNumConta(1111);
        persona1.setDono("Jubileu");
        persona1.abrirConta("Conta corrente");

        //persona1.set
        //persona1.set

        ContaBancaria persona2 = new ContaBancaria();
        persona2.setNumConta(22222);
        persona2.setDono("Valeria");
        persona2.abrirConta("Conta poupança");

        persona1.depositar(100);
        persona2.depositar(500);

        persona2.sacar(100);

        persona1.sacar(150);
        persona1.fecharConta();

        persona1.atualStatus();
        persona2.atualStatus();
    }
}
