package SegundaEvaluacion.poo.herencia.teoria.ejemplos.ejemplo2;

import java.time.LocalDate;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, LocalDate fechaNacimiento, String telefono) {
        super(nombre, fechaNacimiento);

        //COMPROVACIÓN DEL TÉLEFONO:
        int cifras = 0;
        if (telefono.length() == 9) {
            for (int i = 0; i < telefono.length() ; i++) {
                if (Character.isDigit(telefono.charAt(i))) {
                    cifras++;
                }
            }
        }

        if (cifras == 9){
            this.telefono = telefono;
        } else {
            this.telefono = "Desconocido";
        }
    }

    public Cliente(String nombre, LocalDate fechaNacimiento) {
    super(nombre, fechaNacimiento);
    this.telefono = "Desconocido";
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println("\n\n\"DATOS DEL CLIENTE:");
        System.out.println("Esto de Persona:");
        System.out.println(super.toString());
        System.out.println(this.toString());
        System.out.println("y esto del cliente");
    }

}
