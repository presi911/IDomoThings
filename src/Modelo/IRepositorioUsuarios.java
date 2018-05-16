/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public interface IRepositorioUsuarios {
    Usuario consultarUsuario(String nomUsuario) throws ExcepcionUsuarioNoRegistrado;
    void agregarUsuario(String nomUsuario, String contraseña, String nombre, String apellido);
}
