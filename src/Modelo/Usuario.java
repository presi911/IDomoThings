/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Usuario {
    private String nombreUsuario;
     private String contraseña;
    private String nombre;
    private String apellido;
   
    public Usuario(String nuevoNombreUs, String nuevaContraseña, String nuevoNombre, String nuevoApellido)
    {
        this.nombreUsuario= nuevoNombreUs;
        this.contraseña = nuevaContraseña;
        this.nombre= nuevoNombre;
        this.apellido= nuevoApellido;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
    
    
    
}
