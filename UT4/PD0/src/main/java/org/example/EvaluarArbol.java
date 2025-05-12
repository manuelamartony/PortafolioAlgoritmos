package org.example;

import org.w3c.dom.Node;

public class EvaluarArbol {

    class Nodo {
        String valor;
        Nodo izquierdo;
        Nodo derecho;


        public Nodo(String valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
        public String getValor(){
            return valor;
        }
        public void setValor(String valor){
            this.valor = valor;
        }
        public Nodo getIzquierdo(){
            return izquierdo;
        }
        public void setIzquierdo(Nodo izquierdo){
            this.izquierdo = izquierdo;
        }
        public Nodo getDerecho(){
            return derecho;
        }
        public void setDerecho(Nodo derecho){
            this.derecho = derecho;
        }
        public boolean esOperador(){
            return valor.equals("+") || valor.equals("-") || valor.equals("*") || valor.equals("/");
        }
        public boolean esHoja(){
            return izquierdo == null && derecho == null;
        }

    }
    Nodo raiz;
    public Nodo getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    public boolean esVacia() {
        return raiz == null;
    }
    public void sustituirVariables(Nodo nodo, java.util.Map<String, Double> valores) {
        if (nodo == null) {
            return;
        }
        if (nodo.esHoja() && !nodo.esOperador() && !esNumero(nodo.getValor())){
            String variable = nodo.getValor();
            if (valores.containsKey(variable)) {
                nodo.setValor(valores.get(variable).toString());
            }
        }
        sustituirVariables(nodo.izquierdo, valores);
        sustituirVariables(nodo.derecho, valores);

    }

    public Double EvaluarArbol(Nodo nodo) throws ArithmeticException {
        if (nodo == null) {
            return 0.0;
        }

        if (nodo.esHoja()) {
            return Double.parseDouble(nodo.getValor());
        }
        double ValorIzquierdo = EvaluarArbol(nodo.izquierdo);
        double ValorDerecho = EvaluarArbol(nodo.derecho);
        switch (nodo.getValor()) {
            case "+":
                return ValorIzquierdo + ValorDerecho;
            case "-":
                return ValorIzquierdo - ValorDerecho;
            case "*":
                return ValorIzquierdo * ValorDerecho;
            case "/":
                if (ValorDerecho == 0) {
                    System.out.println("no se puede dividir entre 0");
                }
                return ValorDerecho / ValorIzquierdo;
            default:
                throw new IllegalArgumentException("Operador no válido: " + nodo.getValor());

        }

    }
    private boolean esNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void arbolPrefijo(String expresion){
        String[] elementos = expresion.trim().split(" ");
        if (elementos.length == 0){
            return;

        }
        int[] indice ={0};
        raiz = arbolPrefijoRecursivo(elementos, indice);

    }
    public Nodo arbolPrefijoRecursivo(String[] elementos, int[] indice) {
        if (indice[0] >= elementos.length){
            return null;
        }
        String elemento = elementos[indice[0]];
        indice[0]++;
        Nodo nodo = new Nodo(elemento);
        if (nodo.esOperador()){
            nodo.setIzquierdo(arbolPrefijoRecursivo(elementos,indice));
            nodo.setDerecho(arbolPrefijoRecursivo(elementos,indice));
        }
        return nodo;
    }
    public void imprimirInOrden(Nodo nodo){
        if (nodo == null) {
            return;
        }
        if (nodo != null) {
            if (nodo.esOperador()) {
                System.out.print("(");
            }
        }
        imprimirInOrden(nodo.getIzquierdo());
        System.out.print(nodo.getValor());
        imprimirInOrden(nodo.getDerecho());
        if (nodo.esOperador()) {
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        EvaluarArbol arbol1 = new EvaluarArbol();

        String[] expresiones = {
                "* + 3 4 5",   // (3 + 4) * 5
                "+ * 2 3 4",   // (2 * 3) + 4
                "- / 10 2 3"   // (10 / 2) - 3
        };

        for (String expresion : expresiones) {
            System.out.println("\nProcesando expresión: " + expresion);
            arbol1 = new EvaluarArbol(); // Crear un nuevo árbol para cada expresión
            arbol1.arbolPrefijo(expresion);

            System.out.print("Expresión en notación infija: ");
            arbol1.imprimirInOrden(arbol1.getRaiz());
            System.out.println();

            try {
                double resultado = arbol1.EvaluarArbol(arbol1.getRaiz());
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Error al evaluar: " + e.getMessage());
            }
        }
    }
}

