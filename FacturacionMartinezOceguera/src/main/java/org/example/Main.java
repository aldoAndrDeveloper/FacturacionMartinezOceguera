package org.example;

import org.model.Comprador;
import org.flujo.FlujoDeTienda;
import org.model.Productos;
import org.model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //este id lo usaremos para crear usuarios dentro del programa, podría ser remplazado cuando implementemos una BD
    static int id = 0;
    //este objeto contiene el flujo de la tienda, sus métodos que los usuarios piueden hacer
    static FlujoDeTienda flujoDeTienda = new FlujoDeTienda();
    /*Voy a agregar vendedores, primero agregaré vendedores a una lista pero usando un solo objeto
    que se irá reiniciado para agregarlo a la lista*/
    static List<Vendedor> vendedores = new ArrayList<>();
    static Vendedor vendedor;

    /*Voy a agregar compradores pero usando 2 objetos diferentes para agregarlos a una lista como lo vimos en alguna de las clases*/
    static List<Comprador> compradores = new ArrayList<>();
    static Comprador comprador = new Comprador();
    static Comprador comprador2 = new Comprador();
    static Productos productos;
    static List<Vendedor> vendedoresPorProducto = new ArrayList<>();
    static List<Productos> listaDeProductos;


    public static void main(String[] args) {

        /**ALTA DE USUARIOS**/
        /*ALTA DE VENDEDORES*/
        vendedor  = new Vendedor(idSumado(), "Juan", "Perez Perez", "correo@correo.com", "+52 1 12345678", "miPassword", (byte) 21);
        vendedores.add(vendedor);
        vendedor = new Vendedor(idSumado(), "Aldo", "Martinez", "correo2@correo.com", "+52 1 12345677", "miPassword", (byte) 30);
        vendedores.add(vendedor);
        /*ALTA DE USUARIOS COMPRADORES*/

        //llenamos comprador 1
        comprador.setId(idSumado());
        comprador.setNombre("Pancho");
        comprador.setApellidos("Ruiz");
        comprador.setContraseña("12341234");
        comprador.setEdad((byte) 29);
        comprador.setCorreo("micorreo3@correo.com");
        comprador.setTelefono("+5213322445566");
        //llenamos comprador 2
        comprador2.setId(idSumado());
        comprador2.setNombre("Monica");
        comprador2.setApellidos("Gonzalez");
        comprador2.setContraseña("12341234");
        comprador2.setEdad((byte) 29);
        comprador2.setCorreo("micorreo4@correo.com");
        comprador2.setTelefono("+5213322445567");
        //agregamos ambos usuarios compradores a la lista
        compradores.add(comprador);
        compradores.add(comprador2);

        /**ALTA DE PRODUCTOS**/

        /*Producto 1*/
        vendedoresPorProducto.add(vendedores.get(0));
        productos = new Productos("xxxxx00000","Galletas Emperador chocolate", "Ricas galletas sabor chocolate", 30.50,1000,null, vendedoresPorProducto);
        flujoDeTienda.agregarProducto(productos);

        /*producto 2*/
        //limpio la lista para usar la misma y agregar mas productos por vendedor
        vendedoresPorProducto.clear();
        vendedoresPorProducto.add(vendedores.get(0));
        vendedoresPorProducto.add(vendedores.get(1));
        productos = new Productos("xxxxx202020","Galletas Emperador Vainilla", "Ricas galletas de vainilla", 27.00,4000,null, vendedoresPorProducto);
        flujoDeTienda.agregarProducto(productos);

        /**FLUJO DE COSAS QUE PUEDES HACER EN LA TIENDA EN LINEA**/
        try {
            listaDeProductos = flujoDeTienda.verProductos();
            flujoDeTienda.agregarCarrito(listaDeProductos.get(0), compradores.get(0).getId(),100);
            flujoDeTienda.verCarritoDeCompras(compradores.get(0).getId());
            flujoDeTienda.comprar(compradores.get(0).getId(),"");

        }//IndexOutOfBoundsException se lanzará si el id no lo encuentra
        catch(IndexOutOfBoundsException e){
            System.out.println("El usuario no existe");
        }//Exception por si pasa algun otro error no contemplado
        catch(Exception ex){
            System.out.println( ex.getMessage());
        }

       // System.out.println(vendedores.size());


//        FlujoDeTienda flujoDeTienda = new FlujoDeTienda();



    }

    private static int idSumado(){
        return id++;
    }


}