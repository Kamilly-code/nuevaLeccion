package ejerciciosInsti.Hoteles;

import java.util.Objects;

public class Hotel implements Comparable {
    // atributos
    private int idHotel;
    private Zona zona;
    private double precio;

    // constructor

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    // getters y seters

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe estar entre 40€ y 500€");
        }
    }


    // toString

    @Override
    public String toString() {
        return idHotel + " - " + "\tUbicado en: " + zona + "\tPrecio por noche: " + precio + " €";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return idHotel == hotel.idHotel && Double.compare(precio, hotel.precio) == 0 && zona == hotel.zona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, zona, precio);
    }

    @Override
    public int compareTo(Object o) {
        Hotel h1 = (Hotel) o;
        if (this.precio > h1.precio){
            return -1;
        } else if (this.precio < h1.precio) {
            return 1;
        } else
        return 0;
    }


    // métodos personalizados
}
