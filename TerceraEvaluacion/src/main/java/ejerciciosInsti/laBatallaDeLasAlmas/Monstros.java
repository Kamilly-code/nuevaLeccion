package ejerciciosInsti.laBatallaDeLasAlmas;

public class Monstros extends Intercoporeo{
    private int bondad;
    private int maldad;

    public Monstros(int maldad) {
        this.maldad = maldad;
        this.bondad = 0;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return "Monstros{" +
                "maldad=" + maldad +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }
}
