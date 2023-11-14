package org.flujo;

import org.model.Productos;

public interface TiendaVirtual {
     void productoParaVender(Productos producto);
     void comprar();
     Productos verProductos();
     Productos agregarProductos();
}
