package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String adyacentes = "UT7/UT7-TA3/conexiones.txt";
       String vertices = "UT7/UT7-TA3/aeropuertos.txt";
       TGrafoDirigido vueleSeguro = UtilGrafos.cargarGrafo(vertices,adyacentes,false,TGrafoDirigido.class);
        UtilGrafos.imprimirMatrizMejorado(UtilGrafos.obtenerMatrizCostos(vueleSeguro.getVertices()),
                vueleSeguro.getVertices(),"Matriz de adyacencias");
        UtilGrafos.imprimirMatrizMejorado(vueleSeguro.floyd(),vueleSeguro.getVertices(),"Matriz de floyd");
    }
}