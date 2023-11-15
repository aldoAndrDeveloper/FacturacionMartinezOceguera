package org.model;

public class CarritoDeCompras {

    private String SKUProducto;
    private int idusuario;
    private String fecha;
    private int cantidad;

    public CarritoDeCompras(){}
    public CarritoDeCompras(String SKUProducto, int idusuario, String fecha, int cantidad) {
        this.SKUProducto = SKUProducto;
        this.idusuario = idusuario;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getSKUProducto() {
        return SKUProducto;
    }

    public void setSKUProducto(String SKUProducto) {
        this.SKUProducto = SKUProducto;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
