package org.flujo;

import org.model.CarritoDeCompras;
import org.model.Comprador;
import org.model.Productos;
import org.model.Vendedor;

import java.util.List;

public interface TiendaVirtual {
     void agregarCarrito(Productos producto, int idUsuario, int cantidad);
     List <CarritoDeCompras> verCarritoDeCompras(int idUsuario);
     void comprar(int idUsuario, String factura);
     List<Productos> verProductos();
     Productos agregarProducto(Productos producto);
}
