package org.example;

public class Nodo<T> implements  INodo<T> {
    private T dato;
    private Nodo siguiente;
    private Comparable etiqueta;

    public Nodo(T dato, Comparable etiqueta) {
        this.dato = dato;
        this.siguiente = null;
        this.etiqueta = etiqueta;
    }
    public T getDato(){
        return dato;
    }
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo<T> nodo){
        this.siguiente = nodo;
    }
    public void imprimir(){
        System.out.println("Dato: "+ dato);
    }
    public void imprimirEtiqueta(){
        System.out.println("Etiqueta: "+ etiqueta);
    }
    public  Comparable getEtiqueta(){
        return etiqueta;
    }
    public int compareTo(Comparable etiqueta){
        return this.getEtiqueta().compareTo(etiqueta);
    }

}
