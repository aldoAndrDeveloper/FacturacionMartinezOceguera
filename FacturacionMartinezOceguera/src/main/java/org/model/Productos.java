package org.model;

import java.util.List;

public class Productos {
    //ID del producto
    private String SKU;
    //nonmbre del producto
    private String nombreProducto;
    //Descripción del producto
    private String descripcionProducto;
    //Precio del producto
    private double precio;
    //Cantidad del producto en inventario
    private int cantidadInventariada;
    //Reseñas del producto
    private List <ReseniasDeProducto> reseniasDeProductos;
    // Vendedores que venden ese producto, puede haber varios vendedores que vendan el mismo producto
    private List<Vendedor> vendedores;

    public Productos(){}
    public Productos(String SKU, String nombreProducto, String descripcionProducto, double precio, int cantidadInventariada, List<ReseniasDeProducto> reseniasDeProductos, List<Vendedor> vendedores) {
        this.SKU = SKU;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.cantidadInventariada = cantidadInventariada;
        this.reseniasDeProductos = reseniasDeProductos;
        this.vendedores = vendedores;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }
    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
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
