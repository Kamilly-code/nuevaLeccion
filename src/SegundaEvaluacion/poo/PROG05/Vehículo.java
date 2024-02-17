package SegundaEvaluacion.poo.PROG05;

import java.time.LocalDate;

public class Vehículo {
    // Atributos
    private String marca;
    private String matrícula;
    private int númeroKm;
    private LocalDate fechaMatriculación;
    private String descripción;
    private double precio;
    private String nombreUsuario;
    private String dniPropietario;

    //Constructores

    public Vehículo(String marca, String matrícula, int númeroKm, LocalDate fechaMatriculación, String descripción, double precio, String nombreUsuario, String dniPropietario) {
        this.marca = marca;
        this.matrícula = matrícula;
        this.númeroKm = númeroKm;
        this.fechaMatriculación = fechaMatriculación;
        this.descripción = descripción;
        this.precio = precio;
        this.nombreUsuario = nombreUsuario;
        this.dniPropietario = dniPropietario;
    }


    // Getters y Setters

    // toString

    @Override
    public String toString() {
        return "Vehículo{" +
                "marca='" + marca + '\'' +
                ", matrícula='" + matrícula + '\'' +
                ", númeroKm=" + númeroKm +
                ", fechaMatriculación=" + fechaMatriculación +
                ", descripción='" + descripción + '\'' +
                ", precio=" + precio +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", dniPropietario='" + dniPropietario + '\'' +
                '}';
    }


    // Métodos

}
