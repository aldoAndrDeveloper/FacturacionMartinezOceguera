package org.model;

import java.util.List;

public class Productos {
    String SKU;
    String nombreProducto;
    String descripcionProducto;
    double precio;
    int cantidadInventariada;
    List <ReseniasDeProducto> reseniasDeProductos;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventariada() {
        return cantidadInventariada;
    }

    public void setCantidadInventariada(int cantidadInventariada) {
        this.cantidadInventariada = cantidadInventariada;
    }

    public List<ReseniasDeProducto> getReseniasDeProductos() {
        return reseniasDeProductos;
    }

    public void setReseniasDeProductos(List<ReseniasDeProducto> reseniasDeProductos) {
        this.reseniasDeProductos = reseniasDeProductos;
    }


}
