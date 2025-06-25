package org.example;

import java.util.Collection;

public interface IGrafoNoDirigido {

    Collection<TVertice> bea();

    Collection<TVertice> bea(Comparable etiquetaOrigen);

    TGrafoNoDirigido Prim();

    TGrafoNoDirigido Kruskal();
}
