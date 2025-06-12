package org.example;

public class Lista<T> implements ILista<T> {
    private Nodo<T> primero;
    public  Nodo<T> getPrimero() {
        return primero = null;
    }
    public void insertar(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }

        if (esVacia()) {
            primero = nodo;
        } else {
            // Buscar el último nodo
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }
    public void insertar (Comparable etiqueta, T dato ){
        Nodo<T> nuevoNodo = new Nodo<>(dato, etiqueta);
        insertar(nuevoNodo);
    }
    public Nodo<T> buscar(Comparable clave){
        if (clave == null) {
            return null;
        }
        Nodo<T> actual = primero;
        if (actual != null) {
            if (actual.getEtiqueta().compareTo(clave) == 0){
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    public boolean eliminar(Comparable clave){
        if (clave == null || esVacia()) {
            return false;
        }
        if (primero.getEtiqueta().compareTo(clave) == 0) {
            return true;
        }
        Nodo<T> actual = primero;
        if (actual != null) {
            if (actual.getEtiqueta().compareTo(clave) == 0){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    public String imprimir(String separador){
        if (esVacia()){
            return "";
        }
        StringBuilder salida = new StringBuilder();
        Nodo<T> actual = primero;
        while (actual != null){
            salida.append(actual.getEtiqueta());
            if (actual.getSiguiente() != null) {
                salida.append(separador);
            }
            actual = actual.getSiguiente();
        }
        return salida.toString();
    }
    public int cantElementos(){
        int contador = 0;
        Nodo<T> actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }
    public boolean esVacia(){
        return primero == null;
    }
    public void setPrimero( Nodo<T> unNodo){
        primero = unNodo;
    }
}

