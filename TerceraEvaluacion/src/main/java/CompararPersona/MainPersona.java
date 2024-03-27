package CompararPersona;

import java.util.ArrayList;

public class MainPersona {
    public static void main(String[] args) {
        Persona pessoa1 = new Persona("Mario",22,1.87);
        Persona pessoa2 = new Persona("Pepe",52,1.73);
        Persona pessoa3 = new Persona("Manuel",27,1.58);
        Persona pessoa4 = new Persona("David",25,1.64);
        Persona pessoa5 = new Persona("Alberto",80,1.84);

        ArrayList<Persona> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);

        System.out.println("PRIMEIRO");
        imprimir(pessoas);

        System.out.println("\nSEGUNDO");
        CompararAltura compararAltura = new CompararAltura();
        pessoas.sort(compararAltura);
        imprimir(pessoas);

        System.out.println("\nTERCERO");
        CompararEdad compararEdad = new CompararEdad();
        pessoas.sort(compararEdad);
        imprimir(pessoas);


    }
    public static void imprimir(ArrayList<Persona> pessoas){
        for (Persona pessoa: pessoas){
            System.out.println(pessoa);
        }
    }
}
