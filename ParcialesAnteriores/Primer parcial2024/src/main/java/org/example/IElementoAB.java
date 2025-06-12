package org.example;

public interface IElementoAB {

    /**
     * Inserta un elemento en el árbol.
     * @param unElemento El elemento a insertar.
     * @return true si la inserción fue correcta, false si ya existía un elemento con la misma etiqueta.
     */
    public boolean insertar(TElementoAB unElemento);

    /**
     * Busca un elemento en el árbol por su etiqueta.
     * @param unaEtiqueta La etiqueta a buscar.
     * @return El elemento encontrado o null si no existe.
     */
    public TElementoAB buscar(Comparable unaEtiqueta);

    /**
     * Recorre el árbol en preOrden: raíz, izquierda, derecha.
     */
    public void preOrden();

    /**
     * Recorre el árbol en inOrden: izquierda, raíz, derecha.
     */
    public void inOrden();

    /**
     * Recorre el árbol en postOrden: izquierda, derecha, raíz.
     */
    public void postOrden();

    /**
     * Obtiene la etiqueta del elemento.
     * @return La etiqueta del elemento.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene los datos asociados al elemento.
     * @return Los datos del elemento.
     */
    public Object getDatos();

    /**
     * Obtiene el hijo izquierdo del elemento.
     * @return El hijo izquierdo o null si no tiene.
     */
    public TElementoAB getHijoIzq();

    /**
     * Obtiene el hijo derecho del elemento.
     * @return El hijo derecho o null si no tiene.
     */
    public TElementoAB getHijoDer();

    /**
     * Establece el hijo izquierdo del elemento.
     * @param elemento El nuevo hijo izquierdo.
     */
    public void setHijoIzq(TElementoAB elemento);

    /**
     * Establece el hijo derecho del elemento.
     * @param elemento El nuevo hijo derecho.
     */
    public void setHijoDer(TElementoAB elemento);
}
