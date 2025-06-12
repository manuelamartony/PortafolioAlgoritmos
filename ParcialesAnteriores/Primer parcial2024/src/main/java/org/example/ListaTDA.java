package org.example;

import java.util.LinkedList;

public class ListaTDA {

    public void listaTarea (LinkedList<Tarea> listaTareas) {
        LinkedList<Tarea> lista = new LinkedList<Tarea>();
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).prioridad == 1) {
                lista.add(listaTareas.get(i));
            }

        }
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).prioridad == 2) {
                lista.add(listaTareas.get(i));
            }

        }
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).prioridad == 3) {
                lista.add(listaTareas.get(i));
            }

        }
        System.out.println(lista);
    }

    public static void main(String[] args) {
        ListaTDA listaTDA = new ListaTDA();
        LinkedList<Tarea> listaTareas = new LinkedList<Tarea>();
        Tarea tarea1 = new Tarea("Tarea1","aa",1);
        Tarea tarea2 = new Tarea("Tarea2","aa",2);
        Tarea tarea3 = new Tarea("Tarea3","aa",1);
        Tarea tarea4 = new Tarea("Tarea4","aa",3);
        listaTareas.add(tarea1);
        listaTareas.add(tarea2);
        listaTareas.add(tarea3);
        listaTareas.add(tarea4);
        listaTDA.listaTarea(listaTareas);
    }


}
