package org.model;

import org.model.Productos;
import org.model.Usuarios;

import java.util.List;

public class Comprador extends Usuarios{


    /*Sobrecarga de constructores*/
    //Contructor por default

    public Comprador() {
    }
    //Constructor que recibe argumentos
    public Comprador(int id, String nombre, String apellidos, String correo, String telefono, String contraseña, byte edad) {
        super(id, nombre, apellidos, correo, telefono, contraseña, edad);
    }
}
