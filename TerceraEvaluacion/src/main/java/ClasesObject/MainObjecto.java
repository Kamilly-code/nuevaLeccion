package ClasesObject;

public class MainObjecto {
    public static void main(String[] args) {
        EjemploObject eo = new EjemploObject("objeto",1);
        System.out.println(eo);
        //puedo saber o caminho que pertence este objeto utilizando getClass()
        String rutaClase = String.valueOf(eo.getClass());
        System.out.println("Esta clase está en: " +rutaClase);
        //equals y hashcode son como comparaciones de objetos

        //SOBREESCRIBIR ES PEGAR UM METODO DE UMA CLAASE E COLOCAMOS OUTRA ESPECIFICACOES




    }


}
