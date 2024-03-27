package solamente.teste9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Teste9 {
    Map alumno = new HashMap();

    public void addAlumno(String nac){
        if (alumno.containsKey(nac)){
            Integer i = (Integer) alumno.get(nac);
            alumno.remove(nac);
            alumno.put(nac, i++);
        }else{
            alumno.put(nac,1);
        }
    }

    public void showAll(){
        Iterator it = alumno.keySet().iterator();
        while (it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Numero de alumno: "+key+" Nacionalidad alumno: "+alumno.get(key));
        }}

    public void showNacionalidad(){
        for (Object k :alumno.keySet()){
            System.out.println(k+"->"+alumno.get(k));
        }
    }

    public int cuantos(){
        return alumno.size();
    }

    public void borrar(String nac){
        alumno.remove(nac);
    }

}
