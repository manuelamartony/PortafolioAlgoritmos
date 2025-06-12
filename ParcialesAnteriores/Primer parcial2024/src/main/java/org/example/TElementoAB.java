package org.example;

public class TElementoAB {
    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private Object datos; // Podría ser cualquier tipo de datos

    /**
     * Constructor del elemento del árbol binario.
     * @param unaEtiqueta La etiqueta del elemento.
     * @param unosDatos Los datos asociados al elemento.
     */
    public TElementoAB(Comparable unaEtiqueta, Object unosDatos) {
        this.etiqueta = unaEtiqueta;
        this.datos = unosDatos;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    /**
     * Inserta un elemento en el árbol.
     * @param unElemento El elemento a insertar.
     * @return true si la inserción fue correcta, false si ya existía un elemento con la misma etiqueta.
     */
    public boolean insertar(TElementoAB unElemento) {
        if (unElemento.etiqueta.compareTo(this.etiqueta) < 0) {
            // La etiqueta es menor, va en el subárbol izquierdo
            if (this.hijoIzq != null) {
                return this.hijoIzq.insertar(unElemento);
            } else {
                this.hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.etiqueta.compareTo(this.etiqueta) > 0) {
            // La etiqueta es mayor, va en el subárbol derecho
            if (this.hijoDer != null) {
                return this.hijoDer.insertar(unElemento);
            } else {
                this.hijoDer = unElemento;
                return true;
            }
        } else {
            // La etiqueta ya existe, no se inserta
            return false;
        }
    }

    /**
     * Busca un elemento en el árbol por su etiqueta.
     * @param unaEtiqueta La etiqueta a buscar.
     * @return El elemento encontrado o null si no existe.
     */
    public TElementoAB buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.etiqueta) == 0) {
            // Es el elemento que busco
            return this;
        } else if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
            // Buscar en el subárbol izquierdo
            if (this.hijoIzq != null) {
                return this.hijoIzq.buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else {
            // Buscar en el subárbol derecho
            if (this.hijoDer != null) {
                return this.hijoDer.buscar(unaEtiqueta);
            } else {
                return null;
            }
        }
    }

    /**
     * Recorre el árbol en preOrden: raíz, izquierda, derecha.
     */
    public void preOrden() {
        // Visitar la raíz
        System.out.println(this.etiqueta);

        // Recorrer el subárbol izquierdo
        if (this.hijoIzq != null) {
            this.hijoIzq.preOrden();
        }

        // Recorrer el subárbol derecho
        if (this.hijoDer != null) {
            this.hijoDer.preOrden();
        }
    }

    /**
     * Recorre el árbol en inOrden: izquierda, raíz, derecha.
     */
    public void inOrden() {
        // Recorrer el subárbol izquierdo
        if (this.hijoIzq != null) {
            this.hijoIzq.inOrden();
        }

        // Visitar la raíz
        System.out.println(this.etiqueta);

        // Recorrer el subárbol derecho
        if (this.hijoDer != null) {
            this.hijoDer.inOrden();
        }
    }

    /**
     * Recorre el árbol en postOrden: izquierda, derecha, raíz.
     */
    public void postOrden() {
        // Recorrer el subárbol izquierdo
        if (this.hijoIzq != null) {
            this.hijoIzq.postOrden();
        }

        // Recorrer el subárbol derecho
        if (this.hijoDer != null) {
            this.hijoDer.postOrden();
        }

        // Visitar la raíz
        System.out.println(this.etiqueta);
    }
}
