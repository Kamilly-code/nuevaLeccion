package SegundaEvaluacion.POO_EU.Ejercicio1;

import java.util.Scanner;

public class ContaBancaria {
    static Scanner teclado = new Scanner(System.in);

    public void atualStatus () {
        System.out.println("***********************************");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipoConta());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    }

    //atributos
    public int numConta;
    protected String tipoConta;
    private String dono;
    private  double saldo;
    private boolean status;

    //CONSTRUCTOR

    public ContaBancaria() {
       // this.numConta = numConta;
       // this.tipoConta = tipoConta;
       // this.dono = dono;
        this.setSaldo(0.0);
        this.setStatus(false);
    }


    //GETTERS Y SETTERS

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //OTHERS MÉTODOS

    public void abrirConta (String tC) {
        this.setTipoConta(tC);
        this.setStatus(true);
        if (tC.contains("corrente")){
            this.setSaldo(50);
        } else if (tC.contains("poupança")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta () {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("ERROR, conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(double novaGrana){
        if (this.status == true) {
             this.setSaldo(getSaldo()+ novaGrana);
        } else {
            System.out.println("imposivel depositar");
        }
    }

    public  void sacar (double perdeGrana) {
        if (status == true) {
            if (saldo >= perdeGrana) {
                this.setSaldo(this.getSaldo() - perdeGrana);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public  void pagarMensal (double plano) {
        int mensal = 0;
        if (tipoConta.contains("corrente")) {
             mensal = 12;
        } else if (tipoConta.contains("poupança")) {
             mensal = 20;
        } else if (status == true) {
            if (saldo > mensal) {
                this.setSaldo(getSaldo()-mensal);
            }
        }
    }

}
