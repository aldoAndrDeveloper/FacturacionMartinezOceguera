package org.flujo;

import org.model.Productos;

import java.util.List;

public class FlujoDeTienda implements TiendaVirtual{




    /*Sobre carga de metodos*/
    @Override
    public void productoParaVender(Productos producto) {
        System.out.println("se vendió un producto con el SKU id:"+ producto.getSKU() +"y Nombre: "+producto.getNombreProducto());
    }
    //Lo sobrecargamos porque necesito también vender mas de un producto
    public void productoParaVender(List<Productos> productosList){
        for (int i=0;i<productosList.size();i++){
            System.out.println("se vendió un producto con el SKU id:"+ productosList.get(i).getSKU() +"y Nombre: "+productosList.get(i).getNombreProducto());

        }
    }

    @Override
    public void comprar() {

    }

    @Override
    public Productos verProductos() {
        return null;
    }

    @Override
    public Productos agregarProductos() {
        return null;
    }
}
