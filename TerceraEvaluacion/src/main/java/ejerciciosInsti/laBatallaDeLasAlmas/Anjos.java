package ejerciciosInsti.laBatallaDeLasAlmas;

public class Anjos extends Intercoporeo {
    //atributos:
    int bondad;
    int maldad;

    public Anjos(int bondad) {
        this.bondad = bondad;
        this.maldad = 0;
    }

    @Override
    public String toString() {
        return "Anjos{" +
                "bondad=" + bondad +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString()); //Para imprimir esse toString

    }


}
