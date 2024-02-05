package SegundaEvaluacion.poo.PROG05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EjemplosLocalDate {
    public static void main(String[] args) {
        // só uma data, localDate
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha de hoy " + hoy);
        // quiero guardar la fecha de naciemiento
        LocalDate fechaNacimiento = LocalDate.of(2004,02,20);
        System.out.println("Fecha de nacimiento: " +fechaNacimiento.getDayOfMonth() + "/" + fechaNacimiento.getMonthValue() +"/" + fechaNacimiento.getYear());

        System.out.println("Día de la semana " +fechaNacimiento.getDayOfWeek().getValue());

        // só quero fecha y hora localDateTime
        LocalDateTime horas = LocalDateTime.now();
        System.out.println(horas.getSecond());

        //

        LocalTime record = LocalTime.of(2, 11,53);
        System.out.println(record); //Un tiempo predeterminado.







    }
}
