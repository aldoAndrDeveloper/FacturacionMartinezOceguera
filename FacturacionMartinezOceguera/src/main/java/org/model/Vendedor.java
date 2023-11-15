package org.model;

import org.model.Productos;
import org.model.Usuarios;

import java.util.List;

public class Vendedor extends Usuarios {


    String nombreDeTienda;


    /*Sobrecarga de constructores*/
    //Contructor por default
    public Vendedor(){
    }
    //Contructor que recibe argumentos
    public Vendedor(int id, String nombre, String apellidos, String correo, String telefono, String contraseña, byte edad) {
        super(id, nombre, apellidos, correo, telefono, contraseña, edad);
    }

    public String getNombreDeTienda() {
        return nombreDeTienda;
    }

    public void setNombreDeTienda(String nombreDeTienda) {
        this.nombreDeTienda = nombreDeTienda;
    }

}
