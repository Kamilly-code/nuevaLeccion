package examenSegunda.ejercicio2.correcion;

public class Separar {
    public static void main(String[] args) {
        String nombre = "CALMAsepararAsepararANSIEDADEsepararTEMsepararCURAsepararELAsepararNAOsepararÉsepararPARAsepararSEMPRE";
        String[] nombreCompleto = nombre.split("separar"); //pode colocar o split no ARRAY
        for (int i = 0; i < nombreCompleto.length ; i++) {
            System.out.print(nombreCompleto[i]+ " ");
        }


    }
}
