package SegundaEvaluacion.POO_EU.Objetos1;

public class Caneta {
    // Atributos
    public String cor;
    public String modelo;
    public float ponta;
    public int carga;
    public boolean tampada;

    // Métodos

    public void status () {
        System.out.println("Modelo da caneta: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor); // this é auto referencia, quem chamou o método status vai ser substituido por this
        System.out.println("Tam ponta: " +this.ponta);
        System.out.println("Quanto tem de carga? " +this.carga+ "%");
        System.out.println("A caneta esta tampada? " +this.tampada);
    }

    public void rabiscar (){
        if (this.tampada== true) {
            System.out.println("ERRO, nao podemos desenhar");
        }else {
            System.out.println("Desenhando...\n"+" //*\n" +
                    "// **\n" +
                    "// ***\n" +
                    "// ****\n" +
                    "// *****\n" +
                    "// ******\n" +
                    "// *******\n" +
                    "// ********\n" +
                    "// *********\n" +
                    "// **********");
        }
    }

    public void tampar (){
      /* return tampada;*/
        this.tampada = true; // só um =
        // this é uma referencia ao objeto, sempre que queremos modificar o valor do atributo, colocamos this
    }

    public void destampar(){
        this.tampada = false;

    }

    /*public static void main(String[] args) {

    }*/

}
