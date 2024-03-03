package SegundaEvaluacion.POO_EU.MétodosEspeciales;

public class Caneta {

    // Principal diferencia entre los dos es que:
    // No get é um método que retorna, e no set, só muda recebendo os parametros mas nao recebe nada
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String color;

    //constructor 1
    /*public Caneta () { // sem void, ele nao tem modficador
        // Método constructor tem o mesmo nomee da clase
        this.tampar();
        this.color = "Azul";

    }*/

    // CONSTRUCTOR 2
    public Caneta (String modelo0, String color0, float ponta0) {
        this.setModelo(modelo0);
        this.setPonta(ponta0);
        this.setColor(color0);
        this.tampar();
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m; // altera o atributo anterior, para o novo parametro
    }
    public float getPonta () {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p; // altera o atributo anterior, para o novo parametro
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public void status () {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: " +this.color);
        System.out.println("Está tampada?: " +this.tampada);
    }

    // others métodos
     public void tampar () {
        this.tampada = true;
     }
    public void destampar () {
        this.tampada = false;
    }



}
