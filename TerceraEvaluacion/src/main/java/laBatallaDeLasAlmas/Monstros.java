package laBatallaDeLasAlmas;

public class Monstros extends Intercoporeo{
    private int bondad;
    private int maldad;

    public Monstros(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = maldad;
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
    public void mostrar() {

    }
}
