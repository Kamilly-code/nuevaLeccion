package SegundaEvaluacion.poo.Libreria;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colleciones {
    public static ArrayList<Editorial> obtenerEditoriales () {
        ArrayList<Editorial> editorial = new ArrayList<>();
        Editorial editorial1 = new Editorial(1,"Pretince Hall");
        Editorial editorial2 = new Editorial(2, "Wiley");
        Editorial editorial3 = new Editorial(3, "Wrox");
        Editorial editorial4 = new Editorial(4, "Addison Wesley");
        Editorial editorial5 = new Editorial(5, "O'Reilly");

        ArrayList<Editorial> listaEditorial = new ArrayList<Editorial>(); //Colocamos quando que queremos preencher.

        listaEditorial.add(editorial1);
        listaEditorial.add(editorial2);
        listaEditorial.add(editorial3);
        listaEditorial.add(editorial4);
        listaEditorial.add(editorial5);

        return listaEditorial;
    }

    public static Editorial buscarEditoriales (ArrayList<Editorial> miLista , int idEditorial  ) {
        Editorial editorial;
        Iterator<Editorial> objeto = miLista.iterator();
        while (objeto.hasNext()){
            editorial = objeto.next();
            if (editorial.getIdEditorial()== idEditorial){
                return editorial;
            }
        }return null;

    }



}

