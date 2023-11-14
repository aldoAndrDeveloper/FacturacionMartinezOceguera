package org.example;

import org.flujo.Comprador;
import org.flujo.FlujoDeTienda;
import org.flujo.TiendaVirtual;
import org.flujo.Vendedor;
import org.model.Productos;

public class Main {
    //este id lo usaremos para crear usuarios dentro del programa, podría ser remplazado cuando implementemos una BD
    static int id = 0;

    public static void main(String[] args) {
      Vendedor vendedor = new Vendedor(idSumado(), "Juan", "Perez Perez", "correo@correo.com", "+52 1 12345678", "miPassword", (byte) 21);
      Comprador comprador = new Comprador();
      FlujoDeTienda flujoDeTienda = new FlujoDeTienda();

    }

    private static void vendedoresVendiendo(){

    }
    private static int idSumado(){
        return id++;
    }


}