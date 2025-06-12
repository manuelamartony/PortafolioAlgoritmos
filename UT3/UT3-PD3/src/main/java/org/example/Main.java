package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void main(String[] args) {
        System.out.println("=== PROGRAMA DE PRUEBA PARA LISTA ENLAZADA ===\n");

        // Crear una lista de strings
        Lista<T> listaPersonas = new Lista<T>();

        // Prueba 1: Verificar lista vacía
        System.out.println("--- PRUEBA 1: Lista vacía ---");
        System.out.println("¿Lista vacía? " + listaPersonas.esVacia());
        System.out.println("Cantidad de elementos: " + listaPersonas.cantElementos());
        System.out.println("Contenido: " + listaPersonas.imprimir());
        System.out.println();

        // Prueba 2: Insertar elementos
        System.out.println("--- PRUEBA 2: Insertar elementos ---");
        listaPersonas.insertar("001", "Juan Pérez");
        listaPersonas.insertar("002", "María García");
        listaPersonas.insertar("003", "Carlos López");
        listaPersonas.insertar("004", "Ana Martínez");

        System.out.println("Después de insertar 4 elementos:");
        System.out.println("¿Lista vacía? " + listaPersonas.esVacia());
        System.out.println("Cantidad de elementos: " + listaPersonas.cantElementos());
        System.out.println("Etiquetas: " + listaPersonas.imprimir());
        System.out.println("Etiquetas con separador ' | ': " + listaPersonas.imprimir(" | "));
        System.out.println();

        // Prueba 3: Mostrar todos los datos
        System.out.println("--- PRUEBA 3: Mostrar todos los datos ---");
        listaPersonas.imprimir();
        System.out.println();

        // Prueba 4: Buscar elementos
        System.out.println("--- PRUEBA 4: Buscar elementos ---");

        Nodo<String> nodoBuscado = listaPersonas.buscar("002");
        if (nodoBuscado != null) {
            System.out.print("Elemento encontrado con etiqueta '002': ");
            nodoBuscado.imprimir();
        } else {
            System.out.println("Elemento con etiqueta '002' no encontrado");
        }

        Nodo<String> nodoNoExiste = listaPersonas.buscar("999");
        if (nodoNoExiste != null) {
            System.out.print("Elemento encontrado con etiqueta '999': ");
            nodoNoExiste.imprimir();
        } else {
            System.out.println("Elemento con etiqueta '999' no encontrado (correcto)");
        }
        System.out.println();

        // Prueba 5: Eliminar elementos
        System.out.println("--- PRUEBA 5: Eliminar elementos ---");

        // Eliminar elemento del medio
        boolean eliminado = listaPersonas.eliminar("002");
        System.out.println("Eliminando '002': " + eliminado);
        System.out.println("Lista después de eliminar '002': " + listaPersonas.imprimir());
        System.out.println("Cantidad de elementos: " + listaPersonas.cantElementos());
        System.out.println();

        // Eliminar primer elemento
        eliminado = listaPersonas.eliminar("001");
        System.out.println("Eliminando '001' (primer elemento): " + eliminado);
        System.out.println("Lista después de eliminar '001': " + listaPersonas.imprimir());
        System.out.println("Cantidad de elementos: " + listaPersonas.cantElementos());
        System.out.println();

        // Intentar eliminar elemento que no existe
        eliminado = listaPersonas.eliminar("999");
        System.out.println("Intentando eliminar '999' (no existe): " + eliminado);
        System.out.println();

        // Prueba 6: Crear nodos manualmente e insertarlos
        System.out.println("--- PRUEBA 6: Insertar nodos creados manualmente ---");

        Nodo<String> nodo1 = new Nodo<>("Roberto Silva", "005");
        Nodo<String> nodo2 = new Nodo<>("Laura Torres", "006");

        listaPersonas.insertar(nodo1);
        listaPersonas.insertar(nodo2);

        System.out.println("Lista después de insertar nodos manuales:");
        listaPersonas.imprimir();
        System.out.println("Etiquetas: " + listaPersonas.imprimir(" -> "));
        System.out.println();

        // Prueba 7: Pruebas con lista de números
        System.out.println("--- PRUEBA 7: Lista de números ---");

        Lista<Integer> listaNumeros = new Lista<>();
        listaNumeros.insertar(1, 100);
        listaNumeros.insertar(2, 200);
        listaNumeros.insertar(3, 300);
        listaNumeros.insertar(4, 400);

        System.out.println("Lista de números:");
        listaNumeros.imprimir();
        System.out.println("Etiquetas: " + listaNumeros.imprimir());

        // Buscar número
        Nodo<Integer> numeroEncontrado = listaNumeros.buscar(3);
        if (numeroEncontrado != null) {
            System.out.print("Número encontrado: ");
            numeroEncontrado.imprimir();
        }
        System.out.println();

        // Prueba 8: Vaciar lista completamente
        System.out.println("--- PRUEBA 8: Vaciar lista completamente ---");

        System.out.println("Eliminando todos los elementos de la lista de personas...");
        listaPersonas.eliminar("003");
        listaPersonas.eliminar("004");
        listaPersonas.eliminar("005");
        listaPersonas.eliminar("006");

        System.out.println("¿Lista vacía? " + listaPersonas.esVacia());
        System.out.println("Cantidad de elementos: " + listaPersonas.cantElementos());
        System.out.println("Contenido: " + listaPersonas.imprimir());
        System.out.println();

        // Prueba 9: Métodos de nodo individual
        System.out.println("--- PRUEBA 9: Métodos de nodo individual ---");

        Nodo<String> nodoTest = new Nodo<>("Dato de prueba", "TEST");
        System.out.println("Datos del nodo de prueba:");
        nodoTest.imprimir();
        nodoTest.imprimirEtiqueta();
        System.out.println("Comparación con 'TEST': " + nodoTest.compareTo("TEST"));
        System.out.println("Comparación con 'AAA': " + nodoTest.compareTo("AAA"));
        System.out.println("Comparación con 'ZZZ': " + nodoTest.compareTo("ZZZ"));

        System.out.println("\n=== FIN DE PRUEBAS ===");
    }

}