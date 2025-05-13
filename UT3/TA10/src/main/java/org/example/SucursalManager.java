package org.example;

import java.io.*;
import java.util.LinkedList;

public class SucursalManager {
    private LinkedList<String> sucursales;
    SucursalManager() {
        sucursales = new LinkedList<>();
    }
    public boolean Buscar(String sucursal) {
        return sucursales.contains(sucursal);
    }
    public void AgregarSucursal(String sucursal) {
        if (!sucursales.contains(sucursal)) {
            sucursales.add(sucursal);
            System.out.println("Se agregó la sucursal en la ciudad: " + sucursal);
        }
        else {
            System.out.println("El sucursal ya existe");
        }

    }
    public void EliminarSucursal(String sucursal) {
        if (sucursales.contains(sucursal)) {
            sucursales.remove(sucursal);
            System.out.println("Se elimino la sucursal:" + sucursal);
        }
        else {
            System.out.println("El sucursal no existe");
        }
    }
    public void cantidadSucursales() {
        System.out.println("Tamaño lista: " + sucursales.size());
    }
    public void MostrarSucursales(String sucursal) {

        System.out.println("Lista de sucursales: " + sucursales);
    }
    public void estaEnDirectorio(){
       if (sucursales.isEmpty()){
           System.out.println("No hay sucursal en la ciudad");
        }
       else {
           System.out.println("Se esta en la ciudad: " + sucursales);
       }
    }
    public void MostrarSiguiente(String sucursal) {
        int indice = sucursales.indexOf(sucursal);
        String siguiente = sucursales.get(indice +1);
        System.out.println("sucursal siguiente a: " + sucursal + "es: " + siguiente );
    }

    public void CargarSucursal(String sucursal) {
        sucursales.clear();
        try {
            File archivo = new File(sucursal);
                BufferedReader reader = new BufferedReader(new FileReader(archivo));
                String linea;
                while (true){
                    linea = reader.readLine();
                    if (linea == null) {
                        break;
                    }
                    linea = linea.trim();
                    if (!linea.isEmpty()){
                        sucursales.add(linea);
                    }


                }
                reader.close();
                System.out.println("Sucursales cargadas exitosamente desde " + sucursal);
                System.out.println("Total de sucursales: " + sucursales.size());


        } catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Hubo un error al leer el archivo: " + e.getMessage());
        }

    }
    public void Imprimir(String cadena) {
        for (int i = 0; i < sucursales.size(); i++) {
            System.out.print(sucursales.get(i) + cadena);
        }
    }

    public static void main(String[] args) {
        SucursalManager sucursal = new SucursalManager();
        sucursal.CargarSucursal("C:\\Users\\Estudiante UCU\\Desktop\\Algoritmos\\PortafolioAlgoritmos\\UT3\\TA10\\suc1.txt");
        sucursal.EliminarSucursal("Chicago");
        sucursal.MostrarSiguiente("Hong Kong");

        SucursalManager sucursal2 = new SucursalManager();
        sucursal2.CargarSucursal("C:\\Users\\Estudiante UCU\\Desktop\\Algoritmos\\PortafolioAlgoritmos\\UT3\\TA10\\suc2.txt");
        sucursal2.EliminarSucursal("Shenzen");
        sucursal2.EliminarSucursal("Tokio");
        sucursal2.MostrarSucursales("C:\\Users\\Estudiante UCU\\Desktop\\Algoritmos\\PortafolioAlgoritmos\\UT3\\TA10\\suc2.txt");
        sucursal2.cantidadSucursales();

        SucursalManager sucursal3 = new SucursalManager();
        sucursal3.CargarSucursal("C:\\Users\\Estudiante UCU\\Desktop\\Algoritmos\\PortafolioAlgoritmos\\UT3\\TA10\\suc3.txt");
        sucursal3.Imprimir(";_");
    }
}
