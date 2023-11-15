package org.model;

public class Ventas extends CarritoDeCompras{

    private String factura;

    public Ventas (String SKUProducto, int idUsuario, String fecha, int cantidad, String factura){
        super(SKUProducto,  idUsuario,  fecha, cantidad);
        this.factura=factura;
    }

}
