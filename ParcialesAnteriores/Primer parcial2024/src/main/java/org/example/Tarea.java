package org.example;

public class Tarea{
    String nombre;
    String descripcion;
    int prioridad;
    public Tarea(String nombre, String descripcion, int prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}