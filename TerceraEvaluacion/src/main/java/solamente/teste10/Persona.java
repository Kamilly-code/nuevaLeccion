package solamente.teste10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Persona {

        //constantes
        public static final String CADENA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final char SEXO_DEF = 'H';
        public static final int SOBREPESO = 1;
        public static final int ABAJO_PESO = 0;
        public static final int PESO_IDEAL = -1;



        private String nombre; //CIERTO
        private int edad; //CIERTO
        private String dni; //CIERTO
        private char sexo; //CIERTO
        private double peso, altura; //CIERTO

        //Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.

    public Persona() {
        this.sexo = SEXO_DEF;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC (){
        double calculoIMC = this.peso/(Math.pow(this.altura,2));
        if (calculoIMC < 20){
            System.out.println(calculoIMC);
            return PESO_IDEAL;
        } else if (calculoIMC <= 20 && calculoIMC >= 25) {
            System.out.println(calculoIMC);
            return ABAJO_PESO;
        } else if (calculoIMC > 25) {
            System.out.println(calculoIMC);
            return SOBREPESO;
        } else {
            System.out.println("Valor desconocido");
            return 0;
        }
    }

    public boolean esMayorDeEdad (){
        if (edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo (char sexo){
        if (sexo == 'F' || sexo == 'f'){
            System.out.println("feminino");
            this.sexo = 'F';
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println("masculino");
            this.sexo = 'M';
        }

    }

    public String generarDNI (){
        Random generador = new Random();
        int [] numeros = new int[8];
        int ultimaLetra = 0;
        String sb = null;
        //FOR NUMERO:
        for (int i = 0; i < 8 ; i++) {
            numeros [i] = generador.nextInt(1, 10);
        }

        //FOR LETRA
        StringBuffer randomString = new StringBuffer();
        for (int i = 0; i < 1 ; i++) {
            ultimaLetra  = generador.nextInt(CADENA.length());
            char randomChar = CADENA.charAt(ultimaLetra);
            randomString.append(randomChar);
        }


        String uno = Arrays.toString(numeros);
        String nuevoDNI1 = uno.replaceAll(",","").replace("[","").replace("]","");
        String nuevoDNI2 = nuevoDNI1.trim();
        String nuevoDNI3 = nuevoDNI2+randomString;
        String nuevoDNI4 = nuevoDNI3.replace(" ","");


        return this.dni = nuevoDNI4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre de la persona: "+this.nombre+"\nDNI: "+this.dni+"\nEdad: "+this.edad+"\nGenero sexual: "+this.sexo+"\nPeso: "+this.peso+"\nPeso IMC: "+this.calcularIMC()+"\nAltura: "+this.altura;
    }
}
