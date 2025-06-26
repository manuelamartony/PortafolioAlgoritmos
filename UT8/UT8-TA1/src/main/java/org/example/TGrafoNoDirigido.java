package org.example;

import java.util.Collection;
import java.util.LinkedList;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido {
    protected TAristas lasAristas = new TAristas();

    /**
     * @param vertices
     * @param aristas
     */
    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
        lasAristas.insertarAmbosSentidos(aristas);

    }

    @Override
    public boolean insertarArista(TArista arista) {
        boolean tempbool = false;
        TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        tempbool = (super.insertarArista(arista) && super.insertarArista(arInv));
        return tempbool;
    }

    public TAristas getLasAristas() {
        return lasAristas;
    }


    @Override
    public TGrafoNoDirigido Prim() {
        LinkedList<Comparable> u = new LinkedList();
        LinkedList<Comparable> v = new LinkedList(getVertices().keySet());
        Comparable tmp = v.getFirst();
        u.add(tmp);
        v.remove(tmp);
        Double costo = 0.0;
        TAristas aristasAAM = new TAristas();

        while (!v.isEmpty()) {
            TArista tmparista = lasAristas.buscarMin(u,v);
            aristasAAM.add(tmparista);
            u.add(tmparista.getEtiquetaDestino());
            v.remove(tmparista.getEtiquetaDestino());
            costo += tmparista.getCosto();

        }
        TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(getVertices().values(),aristasAAM);
        return grafoNoDirigido;

    }

    @Override
    public TGrafoNoDirigido Kruskal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bea(Comparable etiquetaOrigen) {

        Collection<TVertice> visitados = new LinkedList<>();
        this.bea((Comparable) visitados);
        StringBuilder tmp = new StringBuilder();
        for (TVertice v : visitados){
            tmp.append(v.getEtiqueta());
        }
        return tmp.toString();
    }

    }
