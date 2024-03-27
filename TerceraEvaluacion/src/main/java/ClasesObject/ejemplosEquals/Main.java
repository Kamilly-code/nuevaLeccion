package ClasesObject.ejemplosEquals;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Kami","Pe123");
        Usuario usuario2 = new Usuario("Kami","Li852");

        System.out.println(usuario1.equals(usuario2));
       // System.out.println(usuario1.hashCode());
       // System.out.println(usuario1.getClass());
       // System.out.println(usuario2.hashCode());

        //Agora vamos ver o hashcode
        int hashCode1 = usuario1.hashCode();
        System.out.println("HashCode de usuario1: "+hashCode1);
        int hashCode2 = usuario2.hashCode();
        System.out.println("HashCode de usuario2: "+hashCode2);
        //tienem el mismo hascode pq tienen el mismo login
        //es más rápido con hascode.

        System.out.println("¿Son iguales, con hascode? " +(hashCode1 == hashCode2));
        //COMO CONCLUSIÓN, PARA COMPARAR OBJETOS ENTRE SI PODEMOS UTILIZAR UNO U OTRO.

    }
}
