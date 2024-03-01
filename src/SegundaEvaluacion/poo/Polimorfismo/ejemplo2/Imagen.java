package SegundaEvaluacion.poo.Polimorfismo.ejemplo2;

public class Imagen extends  Fichero{
    protected int width;
    protected int height;
    protected byte[] contenido;

    /*public Imagen(String nombreCompleto) {
        super(nombreCompleto);
    }*/

    public Imagen(String nombreCompleto, int width, int height, byte[] contenido) { //String nombre completo viene de Fichero
        super(nombreCompleto); //superclasse
        this.width = width; //largura
        this.height = height; //altura
        this.contenido = contenido;
    }
    // constructor

    // getters y setters

    @Override
    protected String getInfoFichero() {
       // return String.format("Imagen: %s, width: %d, height: %d", nombreCompleto, width, height);
       return "Imagen: " +nombreCompleto+ ", width: " +width+ ", height" +height;

    }


}
