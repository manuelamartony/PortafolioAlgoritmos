package org.example;

public class Arbol {
    Nodo raiz;
    public Arbol() {
        raiz = null;
    }

    class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        // Constructor
        public Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }
        if (nodo.valor < valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        }else if (nodo.valor > valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        return nodo;
    }
    public boolean Buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }
    private boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null ) {
            return false;
        }
        if (nodo.valor == valor) {
            return true;
        }
        if (nodo.valor < valor) {
            return buscarRecursivo(nodo.izquierdo, valor);
        }
        return buscarRecursivo(nodo.derecho, valor);
    }
    public void eliminar(int valor) {

    }
    private Nodo eliminarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        }
        if (nodo.valor < valor) {
            eliminarRecursivo(nodo.izquierdo, valor);
        }else if (nodo.valor > valor) {
            eliminarRecursivo(nodo.derecho, valor);
        }
        nodo.valor = valorMinimo(nodo.izquierdo);
        nodo.derecho = eliminarRecursivo(nodo.derecho, nodo.valor);



        return nodo;

    }
    private int valorMinimo(Nodo nodo) {
        int valorMinimo = nodo.valor;
        while (nodo.izquierdo != null) {
            valorMinimo = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return valorMinimo;
    }

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);

    }
}

