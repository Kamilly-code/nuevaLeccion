package SegundaEvaluacion.poo.Polimorfismo.ejemplo2;

public abstract class Fichero {
    protected  String nombreCompleto;

    public Fichero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    protected String getInfoFichero() { //cuando tiene string devuelve algo.
        return "Fichero: " + nombreCompleto;
    }

    public void imprimeInfoFichero () {
        String info = this.getInfoFichero(); // comportamiento polimórfico
        System.out.println(info);
    }

}
