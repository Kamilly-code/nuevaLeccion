package solamente.teste5FAILED;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {
    //5.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras y abarrotes. ¿ Cual sera el total que pagara una persona por su compra ?, se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….

    //ATRIBUTOS.
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    ArrayList<String> producto;
    private double precio;
    private int cantidad;
    private double descuento;
    private double totalCliente;


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalCliente() {
        return totalCliente;
    }

    public void setTotalCliente(double totalCliente) {
        this.totalCliente = totalCliente;
    }

    public void pedindoDatos (){
        this.producto = new ArrayList<>();
        System.out.println("¿Cuál es tu nombre?");
        this.nombre = teclado.nextLine();
        System.out.println("¿Qué producto quieres?");
        this.producto.add(teclado.nextLine());
        for (String produtosAdicionados : producto){
            System.out.println(produtosAdicionados);
        }
        System.out.println("¿Qué precio tiene el producto?");
        double precio2 = teclado.nextDouble();
        this.precio = precio2;
        System.out.println("¿Cuál es la cantidad que quieres?");
        int cantidad2 = teclado.nextInt();
        this.cantidad = cantidad2;
        System.out.println("¿Cuál es el  total que pagará el cliente?");
        double totalC2 = precio2*cantidad2;
        this.totalCliente = totalC2;
        System.out.println(totalCliente);
        System.out.println("¿Cuanto tiene de descuento?");
        if (producto.contains("frutas") || producto.contains("verduras") || producto.contains("abarrotes")){ //abarrotes pateleiras
            if (precio2 >1000) {
                double des = 0.20;
                this.descuento = des;
                System.out.println("Contine 20% de descuento");
                double nuevoTotal = totalC2-this.descuento;
                setTotalCliente(nuevoTotal);
            } else {
                System.out.println("No contine descuentos");
            }
        }
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "En el supermecado el cliente: " +this.nombre+ " has comprado " +producto+ "\nen esta cantidad: "+this.cantidad+" y el total sería: "+this.totalCliente;
    }
}
